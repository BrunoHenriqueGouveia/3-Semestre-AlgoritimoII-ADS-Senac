package ADO5;

public class VetorContas {

	// lista de atributos
	private Object[] vetorContas;
	private int tamanho;

	// metodo construtor
	public VetorContas() {
		this.vetorContas = new Object[20];
		this.tamanho = 0;
	}

	// Método para adicionar uma conta ao vetor
	public void adiciona(Object elemento) throws Exception {

		this.aumentaCapacidade();

		if (this.tamanho < this.vetorContas.length) {
			this.vetorContas[this.tamanho] = elemento;
			this.tamanho++;

		} else {
			throw new Exception("o vetor ja esta cheio");
		}

	}

	// Retorna o número de contas armazenadas no vetor
	public int tamanho() {
		return this.tamanho;
	}

	// Método que retorna o nome da conta, dado o número da conta e a senha
	public String nome(int numeroConta, String senha) {

		for (int i = 0; i < tamanho; i++) {
			if (this.vetorContas[i] instanceof Conta) {
				Conta conta = (Conta) vetorContas[i];
				if (conta.getNumero() == numeroConta && conta.getSenha().equalsIgnoreCase(senha)) {
					return conta.getNome();
				}

			}

		}
		return null;
	}

	// Método toString para representar o vetor como uma string
	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("->\n");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(i + 1);
			s.append(this.vetorContas[i]);
		}

		if (this.tamanho > 0) {
			s.append(this.tamanho);
			s.append(this.vetorContas[this.tamanho - 1]);
		}

		s.append("<-");
		return s.toString();
	}

	// Verifica se existe uma conta cadastrada com o número e senha fornecidos
	public boolean verificarSetemContaCadastrada(int numeroConta, String senha) {

		for (int i = 0; i < tamanho; i++) {
			if (this.vetorContas[i] instanceof Conta) {
				Conta conta = (Conta) vetorContas[i];
				if (conta.getNumero() == numeroConta && conta.getSenha().equalsIgnoreCase(senha)) {
					return true;
				}

			}

		}
		return false;
	}

	// Retorna o saldo ou o limite da conta conforme a operação solicitada
	public double saldoElimite(int numeroConta, String senha, String operacao) {

		for (int i = 0; i < tamanho; i++) {
			if (this.vetorContas[i] instanceof Conta) {
				Conta conta = (Conta) vetorContas[i];
				if (conta.getNumero() == numeroConta && conta.getSenha().equalsIgnoreCase(senha)) {

					if (operacao.equals("saldo")) {
						return conta.getSaldo();
					} else if (operacao.equals("limite")) {
						return conta.getLimite();
					}
				}

			}

		}
		return -1;
	}

	// Realiza depósito ou saque na conta conforme a operação solicitada
	public boolean depositaOUsaque(int numeroConta, String senha, double valor, String operacao) {

		for (int i = 0; i < tamanho; i++) {
			if (this.vetorContas[i] instanceof Conta) {
				Conta conta = (Conta) vetorContas[i];
				if (conta.getNumero() == numeroConta && conta.getSenha().equalsIgnoreCase(senha)) {

					if (operacao.equals("deposito")) {
						conta.setSaldo(valor + conta.getSaldo());
						limiteEmergencialPago(numeroConta, valor);
						return true;
					} else if (operacao.equals("saque")) {
						conta.setSaldo(conta.getSaldo() - valor);
						return true;
					}
				}

			}

		}
		return false;
	}

	// Transfere dinheiro entre contas
	public boolean trasferencia(int numContaDestino, String nomeContaDestino, double valor, int numeroConta,
			String senha, boolean emergencial) {

		for (int i = 0; i < tamanho; i++) {

			if (this.vetorContas[i] instanceof Conta) {

				Conta conta = (Conta) vetorContas[i];

				if (conta.getNumero() == numeroConta && conta.getSenha().equalsIgnoreCase(senha)) {

					for (int j = 0; j < tamanho; j++) {

						if (this.vetorContas[j] instanceof Conta) {

							Conta contaDestino = (Conta) vetorContas[j];

							if (contaDestino.getNome().equals(nomeContaDestino)
									&& contaDestino.getNumero() == numContaDestino) {

								if (emergencial == false) {
									conta.setSaldo(conta.getSaldo() - valor);
								}

								contaDestino.setSaldo(contaDestino.getSaldo() + valor);
								limiteEmergencialPago(contaDestino.getNumero(), valor);
								return true;

							}
						}
					}

				}

			}

		}
		return false;
	}

	// Deduz o limite emergencial de uma conta
	public void limiteEmergencial(int numeroConta, String senha, double valor, double limite) {

		for (int i = 0; i < tamanho; i++) {
			if (this.vetorContas[i] instanceof Conta) {
				Conta conta = (Conta) vetorContas[i];
				if (conta.getNumero() == numeroConta && conta.getSenha().equalsIgnoreCase(senha)) {

					conta.setSaldo(conta.getSaldo() - valor);
					conta.setLimite(limite - valor);

				}

			}

		}
	}

	// Reajusta o limite emergencial de uma conta após pagamento
	public void limiteEmergencialPago(int numeroConta, double valorPago) {

		for (int i = 0; i < tamanho; i++) {
			if (this.vetorContas[i] instanceof Conta) {
				Conta conta = (Conta) vetorContas[i];
				if (conta.getNumero() == numeroConta) {

					if (conta.getSaldo() < 0) {

						conta.setLimite(conta.getLimite() + valorPago);

					} else if (conta.getSaldo() > 0 && conta.getLimite() < 1000
							&& conta.getTipoDeConta().equals("PF")) {

						conta.setLimite(1000);
					} else if (conta.getSaldo() > 0 && conta.getLimite() < 5000
							&& conta.getTipoDeConta().equals("PJ")) {

						conta.setLimite(5000);
					}

				}

			}

		}

	}

	// Aumenta a capacidade do vetor de contas se ele estiver cheio
	public void aumentaCapacidade() {

		if (this.vetorContas.length == this.tamanho) {
			Object[] elementosNovos = new Object[this.vetorContas.length * 2];

			for (int i = 0; i < this.vetorContas.length; i++) {
				elementosNovos[i] = this.vetorContas[i];
			}

			this.vetorContas = elementosNovos;
		}
	}

	// método deposita tem a função de realizar um depósito em uma conta, utilizando
	// o número da conta, o nome do titular e o valor a ser depositado.
	public boolean deposita(int numeroConta, String nome, double valor) {

		for (int i = 0; i < tamanho; i++) {
			if (this.vetorContas[i] instanceof Conta) {
				Conta conta = (Conta) vetorContas[i];
				if (conta.getNumero() == numeroConta && conta.getNome().equalsIgnoreCase(nome)) {

					conta.setSaldo(valor + conta.getSaldo());
					limiteEmergencialPago(numeroConta, valor);
					return true;

				}

			}

		}
		return false;
	}
}

package ADO5;

import javax.swing.JOptionPane;

public class Cadastro {
	public static void main(String[] args) throws Exception {

		// VetorContas armazena as contas criadas
		VetorContas vetor = new VetorContas();

		// Opções para o usuário
		String op[] = { "Criar conta", "Entrar na Conta", "Deposito", "Finalizar programa" };
		String tipo[] = { "Transferir", "Sacar", "Depositar", "Saldo", "limite emergencial", "Sair da Conta" };
		String tipoConta[] = { "Pessoa fisica", "Pessoa juridica" };
		Object escolha, operacao;

		do {
			// Mostra as opções principais ao usuário
			operacao = JOptionPane.showInputDialog(null, "Escolha o que deseja fazer:", "Escolha de operação", 3, null,
					op, op[0]);

			// Criar conta
			if (operacao.equals("Criar conta")) {

				escolha = JOptionPane.showInputDialog(null, "Escolha o tipo de conta que deseja criar:",
						"Escolha de operação", 3, null, tipoConta, tipoConta[0]);

				// Criação de conta Pessoa Física
				if (escolha.equals("Pessoa fisica")) {
					vetor.adiciona(cadastrarPF());
				} else {// Criação de conta Pessoa Jurídica
					vetor.adiciona(cadastrarPJ());
				}

				// Entrar na Conta
			} else if (operacao.equals("Entrar na Conta")) {
				int numConta = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o numero da conta:"));
				String senha = JOptionPane.showInputDialog("informe a senha:");

				// Verifica se a conta existe
				if (vetor.verificarSetemContaCadastrada(numConta, senha)) {
					do {

						// Mostra o menu de operações disponíveis dentro da conta
						escolha = JOptionPane.showInputDialog(null,
								"Escolha o que deseja fazer " + vetor.nome(numConta, senha), "Escolha de operação", 3,
								null, tipo, tipo[0]);

						// Transferir dinheiro
						if (escolha.equals("Transferir")) {
							String nomeDestino;
							int contaDestino;
							double valorTransferencia;
							do {
								// Solicita os dados da conta de destino
								nomeDestino = JOptionPane.showInputDialog("informe o nome do proprietario da conta");
								contaDestino = Integer
										.parseInt(JOptionPane.showInputDialog("Informe a conta de trasferencia"));
								valorTransferencia = Double
										.parseDouble(JOptionPane.showInputDialog("Informe o valor de deposito"));

							} while (JOptionPane.showConfirmDialog(null,
									"Informações da transação esta correta\n conta: " + contaDestino + "\nnome: "
											+ nomeDestino + "\nvalor:R$" + valorTransferencia) != 0);

							// Verifica se há saldo suficiente para a transferência
							if (vetor.saldoElimite(numConta, senha, "saldo") < valorTransferencia) {

								// Caso não tenha saldo, pergunta se deseja usar o limite emergencial
								if (JOptionPane.showConfirmDialog(null,
										"voçe não tem saldo para essa trasferencia deseja usar limite emergencial") == 0) {
									double limite;

									// Calcula o saldo mais o limite
									if (vetor.saldoElimite(numConta, senha, "saldo") > 0) {
										limite = vetor.saldoElimite(numConta, senha, "saldo")
												+ vetor.saldoElimite(numConta, senha, "limite");
									} else {
										limite = vetor.saldoElimite(numConta, senha, "limite");
									}
									// Verifica se o limite é suficiente para a transferência
									if (limite >= valorTransferencia) {

										if (vetor.trasferencia(contaDestino, nomeDestino, valorTransferencia, numConta,
												senha, true)) {
											vetor.limiteEmergencial(numConta, senha, valorTransferencia, limite);
											JOptionPane.showMessageDialog(null,
													"Transferencia realizada com sucesso\n para conta: " + contaDestino
															+ "\nnome conta: " + nomeDestino + "\n valor trasferido: "
															+ valorTransferencia);
										} else {
											JOptionPane.showMessageDialog(null,
													"Trasferencia não realizada\n dados incorreto ");
										}

									} else {
										JOptionPane.showMessageDialog(null,
												"Valor não autorizado seu limite emergencial é R$:"
														+ vetor.saldoElimite(numConta, senha, "limite"));
									}
								}
							} else {// Se houver saldo suficiente, realiza a transferência normalmente
								if (vetor.trasferencia(contaDestino, nomeDestino, valorTransferencia, numConta, senha,
										false)) {
									JOptionPane.showMessageDialog(null,
											"Transferencia realizada com sucesso\n para conta: " + contaDestino
													+ "\nnome conta: " + nomeDestino + "\n valor trasferido: "
													+ valorTransferencia);
								} else {
									JOptionPane.showMessageDialog(null,
											"Trasferencia não realizada\n dados incorreto ");
								}
							}
							// Sacar dinheiro
						} else if (escolha.equals("Sacar")) {
							String confirma = "";
							double valor = 0;

							// Solicita o valor do saque e confirmação da senha
							do {

								valor = Double.parseDouble(JOptionPane.showInputDialog("informe o valor:"));
								confirma = JOptionPane
										.showInputDialog("Informe a senha da sua conta para confirma o saque:");

								if (!senha.equals(confirma)) {
									JOptionPane.showMessageDialog(null, "Senha errada tente novamente!!");
								}
							} while (!senha.equals(confirma));

							// Verifica se há saldo suficiente para o saque
							if (vetor.saldoElimite(numConta, senha, "saldo") < valor) {

								// Se não houver saldo, pergunta se deseja usar limite emergencial
								if (JOptionPane.showConfirmDialog(null,
										"voçe não tem saldo para esse saque deseja usar limite emergencial") == 0) {
									double limite;

									if (vetor.saldoElimite(numConta, senha, "saldo") > 0) {
										limite = vetor.saldoElimite(numConta, senha, "saldo")
												+ vetor.saldoElimite(numConta, senha, "limite");
									} else {
										limite = vetor.saldoElimite(numConta, senha, "limite");
									}

									if (limite >= valor) {
										vetor.limiteEmergencial(numConta, senha, valor, limite);
										JOptionPane.showMessageDialog(null,
												"saque efetuado com sucesso\n seu saldo atual é R$: "
														+ vetor.saldoElimite(numConta, senha, "saldo"));

									} else {
										JOptionPane.showMessageDialog(null,
												"Valor não autorizado seu limite emergencial é R$:"
														+ vetor.saldoElimite(numConta, senha, "limite"));
									}
								}
							} else {

								if (vetor.depositaOUsaque(numConta, senha, valor, "saque")) {
									JOptionPane.showMessageDialog(null,
											"saque efetuado com sucesso\n seu saldo atual é R$: "
													+ vetor.saldoElimite(numConta, senha, "saldo"));
								}
							}
							// Depositar dinheiro
						} else if (escolha.equals("Depositar")) {
							String confirma = "";
							double valor = 0;
							do {// Solicita o valor e confirmação da senha

								valor = Double.parseDouble(JOptionPane.showInputDialog("informe o valor:"));
								confirma = JOptionPane
										.showInputDialog("Informe a senha da sua conta para confirma o deposito:");

								if (!senha.equals(confirma)) {
									JOptionPane.showMessageDialog(null, "Senha errada tente novamente!!");
								}
							} while (!senha.equals(confirma));

							if (vetor.depositaOUsaque(numConta, senha, valor, "deposito")) {
								JOptionPane.showMessageDialog(null,
										"Deposito efetuado com sucesso\n seu saldo atual é R$: "
												+ vetor.saldoElimite(numConta, senha, "saldo"));
							}
							// Consultar saldo
						} else if (escolha.equals("Saldo")) {
							JOptionPane.showMessageDialog(null,
									"Saldo da sua conta é R$:" + vetor.saldoElimite(numConta, senha, "saldo"));
						}
						// Consultar limite emergencial
						else if (escolha.equals("limite emergencial")) {
							JOptionPane.showMessageDialog(null, "limite emergencial da sua conta é R$:"
									+ vetor.saldoElimite(numConta, senha, "limite"));
						}

					} while (!escolha.equals("Sair da Conta"));

				} else {

					JOptionPane.showConfirmDialog(null, "Conta não encontrada\ndeseja cadastrar uma conta?");

				}

			} else if (operacao.equals("Deposito")) {

				String nomeDestino;
				int contaDestino;
				double valorTransferencia;
				do {
					nomeDestino = JOptionPane.showInputDialog("informe o nome do proprietario da conta");
					contaDestino = Integer.parseInt(JOptionPane.showInputDialog("Informe a conta de trasferencia"));
					valorTransferencia = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de deposito"));

				} while (JOptionPane.showConfirmDialog(null, "Informações da transação esta correta\n conta: "
						+ contaDestino + "\nnome: " + nomeDestino + "\nvalor:R$" + valorTransferencia) != 0);

				if (vetor.deposita(contaDestino, nomeDestino, valorTransferencia)) {
					JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso\n para conta: " + contaDestino
							+ "\nnome conta: " + nomeDestino + "\n valor trasferido: " + valorTransferencia);
				} else {
					JOptionPane.showMessageDialog(null, "Trasferencia não realizada\n dados incorreto ");
				}

			}
		} while (!operacao.equals("Finalizar programa"));

	}

	private static Conta cadastrarPJ() {
		String nome = JOptionPane.showInputDialog("Digite o nome da Empresa: ");
		String cnpj = JOptionPane.showInputDialog("Digite o CNPJ: ");
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));

		String senha = JOptionPane.showInputDialog("cadastre uma senha");
		String senha2 = "";
		do {
			senha2 = JOptionPane.showInputDialog("repita a senha:");

			if (!senha.equals(senha2)) {
				JOptionPane.showMessageDialog(null, "senha diferente da outra");
			}

		} while (!senha.equals(senha2));

		PessoaJuridica pj = new PessoaJuridica(numero, nome, cnpj, senha);

		JOptionPane.showMessageDialog(null,
				"conta cadastrado com sucesso: dados da sua conta\n" + pj.dadosCadastrado());
		return pj;
	}

	private static Conta cadastrarPF() {
		String nome = JOptionPane.showInputDialog("Digite o nome da Pessoa: ");
		String cpf = JOptionPane.showInputDialog("Digite o CPF: ");
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
		String senha = JOptionPane.showInputDialog("cadastre uma senha");
		String senha2 = "";
		do {
			senha2 = JOptionPane.showInputDialog("repita a senha:");

			if (!senha.equals(senha2)) {
				JOptionPane.showMessageDialog(null, "senha diferente da outra");
			}

		} while (!senha.equals(senha2));

		PessoaFisica pf = new PessoaFisica(numero, nome, cpf, senha);

		JOptionPane.showMessageDialog(null, "conta cadastrado com sucesso:\n" + pf.dadosCadastrado());
		return pf;
	}

}
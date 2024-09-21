package ADO5;

public class PessoaFisica extends Conta {

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	private String cpf;

	public PessoaFisica(int numero, String nome, String cpf, String senha) {
		super(numero, nome, senha, 0, 1000, "PF");
		this.cpf = cpf;
	}

	public String dadosCadastrado() {
		return "Pessoa Fisica \ncpf: " + cpf + super.dadosCadastrado();
	}

}

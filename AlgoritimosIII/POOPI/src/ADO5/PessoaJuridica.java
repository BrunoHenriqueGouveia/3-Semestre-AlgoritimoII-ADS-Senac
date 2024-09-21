package ADO5;

public class PessoaJuridica extends Conta {


	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	private String cnpj;

	public PessoaJuridica(int numero,String nome, String cnpj, String senha) {
		super(numero,nome, senha, 0,5000,"PJ");
		this.cnpj = cnpj;
	}

	public String dadosCadastrado() {
		return "Pessoa Juridica \ncnpj: " + cnpj+ super.dadosCadastrado();
	}

}

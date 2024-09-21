package Aula6Ex2;

public class FornecedorPessoa extends Fornecedor {
	
	@Override
	public String toString() {
		return "FornecedorPessoa [rg=" + rg + ", cpf=" + cpf + ", Nome Empresa=" + getNome() + ", Telefone=" + getFone()
				+ "]";
	}

	private String rg, cpf;

	public FornecedorPessoa(String nome, String fone, String rg, String cpf) {
		super(nome, fone);
		this.rg = rg;
		this.cpf = cpf;
	}
	
	
	public FornecedorPessoa() {

	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}

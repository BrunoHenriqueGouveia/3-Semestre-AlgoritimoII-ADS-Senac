package Aula6Ex2;

public class FornecedorEmpresa extends Fornecedor {



	@Override
	public String toString() {
		return "FornecedorEmpresa [iE=" + iE + ", cnpj=" + cnpj + ", Nome=" + getNome() + ", telefone="
				+ getFone() + "]";
	}

	private String iE, cnpj;

	public FornecedorEmpresa(String nome, String fone, String iE, String cnpj) {
		super(nome, fone);
		this.iE = iE;
		this.cnpj = cnpj;
	}

	public FornecedorEmpresa() {
		super();
	}

	public String getiE() {
		return iE;
	}

	public void setiE(String iE) {
		this.iE = iE;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	

}

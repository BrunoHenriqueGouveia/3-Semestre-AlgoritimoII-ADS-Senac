package ADO5;

public class Conta {

	private int numero;
	private double saldo, limite;
	private String nome, senha,tipoDeConta;

	public Conta(int numero, String nome, String senha,double saldo, double limite, String tipoDeConta) {
		this.numero = numero;
		this.nome = nome;
		this.senha = senha;
		this.saldo = saldo;
		this.limite = limite;
		this.setTipoDeConta(tipoDeConta);
	}

	public Conta() {
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String dadosCadastrado() {
		return "\nNome: " + nome + "\nNumero da conta: " + numero + "\nsenha: " + senha;
	}

	public String getTipoDeConta() {
		return tipoDeConta;
	}

	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
	
	

}
package Aula7Ex3;

public class Pessoa {
	private String nome;
	private int idade;
	private String endereco;
	private String tel;

	public Pessoa(String nome, int idade, String endereco, String tel) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.tel = tel;
	}

	public String toString() {
		String str = this.nome + "\n" + idade + "\n" + this.endereco + "\n" + tel;
		return str;
	}

	public static void main(String args[]) {
		Pessoa p = new Pessoa("Leandro", 25, "Rua XV", "2586-3247");
		String str = p.toString();
		System.out.println(str + "\n");
		System.out.println(p);
	}
}
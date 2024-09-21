package Aula9Colecoes;

import Aula8Ex2.Pessoa;

public class PessoaTesteEquals {
	public static void main(String[] args) {
		PessoaTesteEquals p1 = new PessoaTesteEquals("Bruno", "123");
		PessoaTesteEquals p2 = new PessoaTesteEquals("Bruno", "123");

		if (p1.equals(p2)) {
			System.out.println("os dois são iguais usando equais sobrescrevendo");
		} else {
			System.out.println("os dois não são iguais");
		}
		
		if (p1 == p2) {
			System.out.println("os dois são iguais usando sinal de igual");
		} else {
			System.out.println("os dois não são iguais");
		}
		
	}

	private String nome;
	private String RG;

	public PessoaTesteEquals(String nome, String RG) {
		this.setNome(nome);
		this.setRG(RG);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRG(String RG) {
		this.RG = RG;
	}

	public String getNome() {
		return nome;
	}

	public String getRG() {
		return RG;
	}

	// Sobrescrita do método equals da classe Object
	public boolean equals(Object o) {
		// Devemos verificar se o objeto "o" eh uma instancia da classe Pessoa
		if (o instanceof PessoaTesteEquals) {
			// Devemos fazer o cast de Object para Pessoa
			PessoaTesteEquals p = (PessoaTesteEquals) o;
			if (this.getNome().equals(p.getNome()) && this.getRG().equals(p.getRG())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}

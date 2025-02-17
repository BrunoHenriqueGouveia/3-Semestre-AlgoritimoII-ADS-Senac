package Aula9Colecoes;

import java.util.Objects;

public class FunicionarioTesteHashCode {

	public static void main(String[] args) {
		FunicionarioTesteHashCode funcionario1 = new FunicionarioTesteHashCode("bruno", "11988191980");
		FunicionarioTesteHashCode funcionario2 = new FunicionarioTesteHashCode("bruno", "11988191980");

		if (funcionario1.equals(funcionario2)) {
			System.out.println("os dois são iguais usando equais sobrescrevendo");
		} else {
			System.out.println("os dois não são iguais");
		}

		System.out.println(funcionario1);
		System.out.println(funcionario2);
		System.out.println(funcionario1.hashCode());
		System.out.println(funcionario2.hashCode());

	}

	private String nome;
	private String telefone;

	public FunicionarioTesteHashCode(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, telefone);
	}

	@Override
	public boolean equals(Object o) {
		// Devemos verificar se o objeto "o" eh uma instancia da classe Pessoa
		if (o instanceof FunicionarioTesteHashCode) {
			// Devemos fazer o cast de Object para Pessoa
			FunicionarioTesteHashCode f = (FunicionarioTesteHashCode) o;
			if (this.getNome().equals(f.getNome()) && this.getTelefone().equals(f.getTelefone())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FunicionarioTesteHashCode [");
		if (nome != null) {
			builder.append("nome=");
			builder.append(nome);
			builder.append(", ");
		}
		if (telefone != null) {
			builder.append("telefone=");
			builder.append(telefone);
		}
		builder.append("]");
		return builder.toString();
	}

}

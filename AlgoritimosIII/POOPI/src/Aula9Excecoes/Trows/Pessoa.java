package Aula9Excecoes.Trows;

public class Pessoa {
	String nome;
	byte idade;

	public Pessoa(String nome, byte idade) throws IdadeInvalidaException {
		setNome(nome);
		setIdade(idade);
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) throws IdadeInvalidaException {
		if (idade < 0 || idade > 128) {
			throw new IdadeInvalidaException("A idade é invalida");
		} else {
			this.idade = idade;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
}
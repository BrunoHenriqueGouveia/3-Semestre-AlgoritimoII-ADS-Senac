package Aula7Ex1;

public class Aluno extends Pessoa {
	
	private int ra;

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}


	public Aluno(String nome, String cpf, int ra) {
		super(nome, cpf);
		this.ra = ra;
	}

	@Override
	public String toString() {
		return  super.toString() +" Aluno [ra=" + ra +"]";
	}

}

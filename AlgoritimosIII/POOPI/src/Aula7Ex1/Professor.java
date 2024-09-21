package Aula7Ex1;

public class Professor extends Pessoa {

	private int rgf;

	public Professor() {
	}

	public Professor(String nome, String cpf, int rgf) {
		super(nome, cpf);
		this.setRgf(rgf);
	}

	public int getRgf() {
		return rgf;
	}

	public void setRgf(int rgf) {
		this.rgf = rgf;
	}

	@Override
	public String toString() {
		return super.toString() + " Professor [rgf=" + rgf + "]";
	}

}

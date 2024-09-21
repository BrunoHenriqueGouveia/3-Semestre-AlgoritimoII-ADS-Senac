package Aula8Ex1;

public class Onibus extends Veiculo {

	private int passageiros;

	public Onibus(String placa, int ano, int passageiros) {
		super(placa, ano);
		this.passageiros = passageiros;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	@Override
	public String toString() {
		return "Onibus [passageiros=" + passageiros + "," + super.toString() + "]";
	}

}

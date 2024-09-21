package Aula8Ex1;

public class Caminhao extends Veiculo {

	private int pesoCarga;

	public Caminhao(String placa, int ano, int pesoCarga) {
		super(placa, ano);
		this.pesoCarga = pesoCarga;
	}

	public int getPesoCarga() {
		return pesoCarga;
	}

	public void setPesoCarga(int pesoCarga) {
		this.pesoCarga = pesoCarga;
	}

	@Override
	public String toString() {
		return "Caminhao [pesoCarga=" + pesoCarga + "," + super.toString() + "]";
	}

}

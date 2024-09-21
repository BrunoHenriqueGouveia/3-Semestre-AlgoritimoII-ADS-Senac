package ADO2;

/*
Bruno Henrique Gouveia Da Silva 
*/

public class Veiculos {
	private String marca;
	private String modelo;
	private String anoFabricacao;
	private String[] velocidade = { "0", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60", "65",
			"70", "75", "80", "85", "90", "95", "100", "105", "110", "115", "120" };
	private String[] ligarCarro = { "Ligar Carro", "Desligar Carro" };

	public Veiculos() {
	}

	public void setVelocidade(String[] velocidade) {
		this.velocidade = velocidade;
	}

	public String[] getVelocidade() {
		return velocidade;
	}

	public String[] getLigarCarro() {
		return ligarCarro;
	}

	public void setLigarCarro(String[] ligarCarro) {
		this.ligarCarro = ligarCarro;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public boolean ligadoOuDesligado(String ligado) {

		if (ligado.equalsIgnoreCase("Ligar Carro")) {
			return true;
		}

		return false;
	}

	public String marcha(int velocidade) {
		String marcha = "";
		if (velocidade == 0) {
			marcha = "neutro";
		} else if (velocidade <= 20) {
			marcha = "1ª marcha";

		} else if (velocidade <= 40) {
			marcha = "2ª marcha";

		} else if (velocidade <= 60) {
			marcha = "3ª marcha";

		} else if (velocidade <= 80) {
			marcha = "4ª marcha";

		} else if (velocidade <= 120) {
			marcha = "5ª marcha";

		} else {
			marcha = "Não permitido";
		}

		return marcha;
	}

}

package ADO3;


/*
 * Bruno Henrique Gouveia Da Silva
 */

public class Pessoa {
	private String sexo;
	private double altura;
	private double peso;

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double imc() {

		return getPeso() / (getAltura() * getAltura());

	}

	public String classifica() {

		String resp = "";

		if (getSexo().equalsIgnoreCase("Femenino")) {
			if (imc() < 19) {
				resp = "Abaixo do pesokk";
			} else if (imc() < 24) {
				resp = "Normal";
			} else if (imc() < 29) {
				resp = "Obsidade leve";
			} else if (imc() < 39) {
				resp = "Obsidade moderada";
			} else {
				resp = "Obsidade mórbida";
			}

		} else {
			if (imc() < 20) {
				resp = "Abaixo do peso";
			} else if (imc() < 25) {
				resp = "Normal";
			} else if (imc() < 30) {
				resp = "Obsidade leve";
			} else if (imc() < 40) {
				resp = "Obsidade moderada";
			} else {
				resp = "Obsidade mórbida";
			}

		}

		return resp;
	}

}

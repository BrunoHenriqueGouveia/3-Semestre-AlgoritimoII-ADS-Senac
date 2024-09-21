package Aula4Ex2;

import javax.swing.JOptionPane;

public class Circulo {
	private double raio = 0;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		if (raio > 0) {
			this.raio = raio;
		} else {
			JOptionPane.showMessageDialog(null, "raio invalido,Digite corretamente");
		}
	}

	public static double calcularArea(double raio) {

		double resultado = Math.PI * raio * raio;
		return resultado;
	}

	public static double calcularPerimetro(double raio) {

		double resultado = (2 * Math.PI) * raio;
		return resultado;
	}

}

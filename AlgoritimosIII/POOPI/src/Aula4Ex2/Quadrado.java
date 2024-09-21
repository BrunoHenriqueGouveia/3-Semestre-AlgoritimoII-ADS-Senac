package Aula4Ex2;

import javax.swing.JOptionPane;

public class Quadrado {
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		if (lado > 0) {
			this.lado = lado;
		} else {
			JOptionPane.showMessageDialog(null, "raio invalido,Digite corretamente");
		}
	}

	public static double areaQuadrado(double lado) {
		return Math.pow(lado, 2);
	}

	public static double perimetroQuadrado(double lado) {
		return lado * 4;
	}

}

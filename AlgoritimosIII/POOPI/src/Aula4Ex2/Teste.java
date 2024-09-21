package Aula4Ex2;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		Circulo c = new Circulo();
		Quadrado q = new Quadrado();

		do {
			String formaGeometrica[] = { "Circulo", "Quadrado", "Triangulo" };
			Object escolha = JOptionPane.showInputDialog(null, "O que deseja calcular?", "Círculo",
					JOptionPane.QUESTION_MESSAGE, null, formaGeometrica, formaGeometrica[1]);

			if (escolha.equals("Circulo")) {
				do {
					c.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do RAIO:")));
				} while (c.getRaio() <= 0);

				String valores[] = { "Perímetro", "Área" };
				escolha = JOptionPane.showInputDialog(null, "O que deseja calcular?", "Círculo",
						JOptionPane.QUESTION_MESSAGE, null, valores, valores[1]);
				if (escolha.equals("Perímetro")) {// nome, telefone, ie, cnpj
					JOptionPane.showMessageDialog(null,
							"Perímetro do círculo de raio: " + c.getRaio() + " = " + c.calcularPerimetro(c.getRaio()));
				} else if (escolha.equals("Área")) {// nome, telefone, ie, cnpj
					JOptionPane.showMessageDialog(null,
							"Área do círculo de raio: " + c.getRaio() + " = " + c.calcularArea(c.getRaio()));
				}
			} else if (escolha.equals("Quadrado")) {
				do {
					q.setLado(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do Quadrado:")));
				} while (q.getLado() <= 0);

				String valores[] = { "Perímetro", "Área" };
				escolha = JOptionPane.showInputDialog(null, "O que deseja calcular?", "Círculo",
						JOptionPane.QUESTION_MESSAGE, null, valores, valores[1]);
				if (escolha.equals("Perímetro")) {// nome, telefone, ie, cnpj
					JOptionPane.showMessageDialog(null, "Perímetro do quadrado: " + q.perimetroQuadrado(q.getLado()));
				} else if (escolha.equals("Área")) {// nome, telefone, ie, cnpj
					JOptionPane.showMessageDialog(null, "Área do quadrado: " + q.areaQuadrado(q.getLado()));
				}

			}

		} while (JOptionPane.showConfirmDialog(null, "deseja continuar") == 0);
	}

}

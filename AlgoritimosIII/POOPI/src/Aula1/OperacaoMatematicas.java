package Aula1;

import javax.swing.JOptionPane;

public class OperacaoMatematicas {
	public static void main(String[] args) {
		double num1 = 0, num2 = 0, result = 0;
		String operacao = null;
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n"
				+ "1-Soma\n 2-Subtração\n3-Multiplicação\n4-Divisão:\n"));
		if(escolha==1) {
			num1 = Double.parseDouble(JOptionPane.showInputDialog(
					"Digite o 1º Número:"));
			num2 = Double.parseDouble(JOptionPane.showInputDialog(
					"Digite o 2º Número:"));
			operacao = " + ";
			result = num1 + num2;
		}
		else if(escolha==2) {
			num1 = Double.parseDouble(JOptionPane.showInputDialog(
					"Digite o 1º Número:"));
			num2 = Double.parseDouble(JOptionPane.showInputDialog(
					"Digite o 2º Número:"));
			operacao = " - ";
			result = num1 - num2;
		}
		else if(escolha==3) {
			num1 = Double.parseDouble(JOptionPane.showInputDialog(
					"Digite o 1º Número:"));
			num2 = Double.parseDouble(JOptionPane.showInputDialog(
					"Digite o 2º Número:"));
			operacao = " X ";
			result = num1 * num2;
		}
		else if(escolha==4) {
			num1 = Double.parseDouble(JOptionPane.showInputDialog(
					"Digite o 1º Número:"));
			num2 = Double.parseDouble(JOptionPane.showInputDialog(
					"Digite o 2º Número:"));
			operacao = " / ";
			result = num1 / num2;
		}
		JOptionPane.showMessageDialog(null, num1 + operacao + num2 + " = " + result);
	}
}

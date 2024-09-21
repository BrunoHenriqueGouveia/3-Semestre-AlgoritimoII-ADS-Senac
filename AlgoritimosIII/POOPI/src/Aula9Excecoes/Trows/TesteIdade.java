package Aula9Excecoes.Trows;

import javax.swing.JOptionPane;

public class TesteIdade {
	public static void main(String[] args) throws IdadeInvalidaException {
		
		String nome = JOptionPane.showInputDialog("Informe seu nome:");
		byte idade = Byte.parseByte(JOptionPane.showInputDialog("informe sua idade:"));
		Pessoa p = new Pessoa(nome, idade);
		JOptionPane.showMessageDialog(null, p);

	}
}

package Aula9Excecoes;

import javax.swing.JOptionPane;

public class TesteException2 {
	public static void main(String args[]) {
		String str;
		String mensagem = "Digite a informacao";
		int icone = JOptionPane.INFORMATION_MESSAGE;

		try {
			str = JOptionPane.showInputDialog(null, mensagem, "msg", icone);
			char c = str.charAt(0);
		} catch (NullPointerException e) {
			System.out.println("A variavel str está nula (null) ");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("A variavel str está vazia (null) ");
		}
	}
}

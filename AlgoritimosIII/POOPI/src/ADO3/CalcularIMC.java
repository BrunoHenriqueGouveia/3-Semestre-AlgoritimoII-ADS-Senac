package ADO3;

/*
 * Bruno Henrique Gouveia Da Silva
 */

import javax.swing.JOptionPane;

public class CalcularIMC {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();

		do {
		String sexo[] = { "Femenino", "Masculino" };
		p.setSexo((String) JOptionPane.showInputDialog(null, "Informe seu Sexo:", "Sexo", JOptionPane.QUESTION_MESSAGE,
				null, sexo, sexo[1]));

		p.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe sua Altura:")));

		p.setPeso(Double.parseDouble(JOptionPane.showInputDialog("informe seu Peso:")));

		JOptionPane.showMessageDialog(null, "Sua classificação no IMC é: " + p.classifica());

		}while(JOptionPane.showConfirmDialog(null, "Deseja calcular outro IMC")==0);
	}

}

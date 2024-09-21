package Aula6Ex1;

import javax.swing.JOptionPane;

public class CadastraPessoa {

	public static void main(String[] args) {

		String[] sexo = { "Masculino", "Femenino" };
		Pessoa p = new Pessoa();

		p.setNome(JOptionPane.showInputDialog("informe seu nome:"));
		p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("informe idade:")));
		p.setCpf(JOptionPane.showInputDialog("informe seu cpf:"));
		String escolha = ((String) JOptionPane.showInputDialog(null, "Sexo", "Informe seu Sexo",
				JOptionPane.QUESTION_MESSAGE, null, sexo, sexo[0]));

		if (escolha.equalsIgnoreCase("Masculino")) {
			p.setSexo(Pessoa.masculino);
		} else {
			p.setSexo(Pessoa.femenino);
		}

		JOptionPane.showMessageDialog(null, p);

	}

}

package Aula7Ex1;

import javax.swing.JOptionPane;

public class Cadastrar {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();

		do {
			String tipo[] = { "Cadastrar Aluno", "Cadastrar Professor" };
			String escolha = ((String) JOptionPane.showInputDialog(null, "Escolha", "Escolha",
					JOptionPane.QUESTION_MESSAGE, null, tipo, tipo[0]));

			if (escolha.equalsIgnoreCase("Cadastrar Aluno")) {
				String nome = (JOptionPane.showInputDialog("informe nome "));
				String cpf = (JOptionPane.showInputDialog("informe seu cpf"));
				int ra = 0;

				do {
					ra = Integer.parseInt(JOptionPane.showInputDialog("Informe seu ra"));

					if (ra < 1) {
						JOptionPane.showMessageDialog(null, "ra tem que ser maior que 0");
					}

				} while (ra <= 0);

				p = new Aluno(nome, cpf, ra);
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso\n"+ p);

			} else {
				String nome = (JOptionPane.showInputDialog("informe nome "));
				String cpf = (JOptionPane.showInputDialog("informe seu cpf"));
				int rgf = 0;

				do {
					rgf = Integer.parseInt(JOptionPane.showInputDialog("Informe seu rgf"));
					if (rgf < 1) {
						JOptionPane.showMessageDialog(null, "rgf tem que ser maior que 0");
					}
				} while (rgf <= 0);

				p = new Professor(nome, cpf, rgf);
				JOptionPane.showMessageDialog(null,"Cadastrado com sucesso\n"+ p);
			}

		} while (JOptionPane.showConfirmDialog(null, "deseja cadastrar outra pessoa") == 0);

	}

}

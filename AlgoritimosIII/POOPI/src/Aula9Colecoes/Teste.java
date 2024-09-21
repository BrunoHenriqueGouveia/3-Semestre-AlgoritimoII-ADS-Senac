package Aula9Colecoes;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		VetorPessoa vetor = new VetorPessoa();

		do {
			String nome = JOptionPane.showInputDialog("Insira o nome:");
			vetor.adiciona(nome);
		} while (JOptionPane.showConfirmDialog(null, "deseja cadastrar outra pessoa") == 0);

		JOptionPane.showMessageDialog(null, vetor);

		String op[] = { "consulta", "exclusão", "Finalizar Programa" };

		do {
			Object escolha = JOptionPane.showInputDialog(null, "Escolha", "Escolha", 3, null, op, op[0]);

			if (escolha.equals("consulta")) {
				String nome = JOptionPane.showInputDialog("Insira o nome:");
				int posicao = vetor.buscaPosicao(nome);

				if (posicao == -1) {
					JOptionPane.showMessageDialog(null, "posição Invalida!!");
				} else {
					JOptionPane.showMessageDialog(null, nome + " foi encontrado na posição " + posicao);
				}
			} else if (escolha.equals("exclusão")){
				String nome = JOptionPane.showInputDialog("Insira o nome:");

				if (JOptionPane.showConfirmDialog(null, "deseja remover esse nome: " + nome) == 0) {

					Boolean removido = vetor.remove(nome);

					if (removido == false) {
						JOptionPane.showMessageDialog(null, "posição Invalida!!");
					} else {
						JOptionPane.showMessageDialog(null, nome + " foi removido com sucesso \n" + vetor);

					}
				}
			}
		} while (!op.equals("Finalizar Programa"));

	}

}

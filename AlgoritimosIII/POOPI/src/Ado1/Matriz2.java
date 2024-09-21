package Ado1;

/*
Bruno Henrique Gouveia Da Silva 
*/
import javax.swing.JOptionPane;

public class Matriz2 {
	public static void main(String[] args) {

		int matriz[][];
		int continuar = 0;

		do {

			int tamanho = Integer.parseInt(JOptionPane.showInputDialog("informe o tamanho da matriz"));

			matriz = new int[tamanho][tamanho];

			String[] itens = { "usuario cadastrar valores na matriz",
					"valores gerados aleatorios de 0 a 100 na matriz" };

			String valorSelecionado = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opçao",
					JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

			if (valorSelecionado.equalsIgnoreCase("usuario cadastrar valores na matriz")) {

				for (int l = 0; l < matriz.length; l++) {
					for (int c = 0; c < matriz[l].length; c++) {
						int valores = Integer.parseInt(
								JOptionPane.showInputDialog("inserir numero na matriz na posição" + l + "x" + c + ":"));
						matriz[l][c] = valores;
					}
				}

			} else if (valorSelecionado.equalsIgnoreCase("valores gerados aleatorios de 0 a 100 na matriz")) {
				matriz = matrizAleatoria(tamanho, tamanho);

			}

			imprimirMatriz(matriz);
			imprimirResultado(resultados(matriz));

			continuar = JOptionPane.showConfirmDialog(null, "Deseja Continuar:");

		} while (continuar == 0);

	}

	public static void imprimirResultado(int[] resultados) {

		String resultado = "A soma de todos numeros da matriz é: " + resultados[0] + "\nO maior numeros da matriz é: "
				+ resultados[1] + "\nO menor numeros da matriz é: " + resultados[2]
				+ "\nA soma da diagonal principal da matriz é: " + resultados[3]
				+ "\nA soma da diagonal secundaria da matriz é: " + resultados[4];

		JOptionPane.showMessageDialog(null, resultado);
	}

	public static int[] resultados(int[][] matriz) {

		int soma = 0, maior = matriz[0][0], menor = matriz[0][0], diPrincipal = 0, diSecundaria = 0;

		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {

				soma += matriz[l][c];

				if (matriz[l][c] > maior) {
					maior = matriz[l][c];
				}
				if (matriz[l][c] < menor) {
					menor = matriz[l][c];
				}
				if (l == c) {
					diPrincipal += matriz[l][c];
				}
				if (l + c == matriz.length - 1) {
					diSecundaria += matriz[l][c];
				}

			}

		}
		int[] resultado = { soma, maior, menor, diPrincipal, diSecundaria };

		return resultado;

	}

	public static int[][] matrizAleatoria(int linha, int coluna) {

		int matriz[][] = new int[linha][coluna];

		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {

				int randomNum = (int) (Math.random() * 101);
				matriz[l][c] = randomNum;
			}
		}

		return matriz;
	}

	public static void imprimirMatriz(int[][] matriz) {

		String imprimir = "Matriz\n";
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				imprimir += matriz[l][c] + " ";
			}
			imprimir += "\n";

		}
		JOptionPane.showMessageDialog(null, imprimir);
	}

}

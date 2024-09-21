package Ado1;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int linha, coluna, opcao;
		int matriz[][];
		String continuar = "não";

		do {

			System.out.println("informe o tamanho da matriz");

			System.out.print("qtd linhas:");
			linha = ler.nextInt();
			System.out.print("qtd coluna:");
			coluna = ler.nextInt();

			matriz = new int[linha][coluna];

			System.out.println("1 usuario cadastrar valores na matriz");
			System.out.println("2 valores aleatorios de 0 a 100 na matriz");
			opcao = ler.nextInt();

			if (opcao == 1) {

				for (int l = 0; l < matriz.length; l++) {
					for (int c = 0; c < matriz[l].length; c++) {

						System.out.printf("inserir numero na matriz na posição %dx%d:", l + 1, c + 1);
						matriz[l][c] = ler.nextInt();
					}
				}
				imprimirMatriz(matriz);
			} else if (opcao == 2) {
				matriz = matrizAleatoria(linha, coluna);
				imprimirMatriz(matriz);
			} else {
				System.err.println("opcao invalida");
			}

			imprimirResultado(resultados(matriz));

			System.out.println("deseja continuar: sim ou não?");
			continuar = ler.next();

		} while (continuar.equalsIgnoreCase("sim"));
		
		ler.close();
	}

	public static void imprimirResultado(int[] resultados) {

		System.out.println("===================================");
		System.out.println("A soma de todos numeros da matriz é:" + resultados[0]);
		System.out.println("o maior numeros da matriz é:" + resultados[1]);
		System.out.println("o menor numeros da matriz é:" + resultados[2]);
		System.out.println("A soma da diagonal principal da matriz é:" + resultados[3]);
		System.out.println("A soma da diagonal secundaria da matriz é:" + resultados[4]);
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

		System.out.println("Matriz");
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.print(matriz[l][c] + " ");

			}
			System.out.println();

		}
	}

}

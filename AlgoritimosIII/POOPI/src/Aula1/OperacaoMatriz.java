package Aula1;

import javax.swing.JOptionPane;

public class OperacaoMatriz {

	public static void main(String[] args) {
		int matriz[][] = {
				{10,52,45,63},
				{25,35,31,98},
				{50,60,28,34},
				{65,30,90,27}
			};
			String result = "";
			for (int l = 0; l < matriz.length; l++) {
				for (int c = 0; c < matriz.length; c++) {
					System.out.print(matriz[l][c] + " ");
					if(l==c)
						result += matriz[l][c] + " ";
				}
				System.out.println();
			}
			JOptionPane.showMessageDialog(null, result);
	}

}

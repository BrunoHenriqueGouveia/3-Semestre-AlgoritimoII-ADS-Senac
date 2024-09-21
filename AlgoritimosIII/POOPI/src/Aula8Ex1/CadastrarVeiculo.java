package Aula8Ex1;

import javax.swing.JOptionPane;

public class CadastrarVeiculo {

	public static void main(String[] args) {

		String[] tipoVeiculo = { "Caminhao", "Onibus" };

		Veiculo v;
		
		do {

		Object escolha = JOptionPane.showInputDialog(null, "Qual veiculo Cadastrar", "Veiculo",
				JOptionPane.QUESTION_MESSAGE, null, tipoVeiculo, tipoVeiculo[0]);

		String placa = JOptionPane.showInputDialog("Informe a placa do veiculo");
		int ano = Integer.parseInt(JOptionPane.showInputDialog("informe ano do veiculo"));

		if (escolha.equals("Onibus")) {

			int passageiros = Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade de passageiros:"));

			v = new Onibus(placa, ano, passageiros);
			JOptionPane.showMessageDialog(null, v);

		} else {
			int pesoCarga = Integer.parseInt(JOptionPane.showInputDialog("informe o peso da carga:"));

			v = new Caminhao(placa, ano, pesoCarga);
			JOptionPane.showMessageDialog(null, v);
		}
		
		}while(JOptionPane.showConfirmDialog(null, "deseja Cadastrar outro veiculo") == 0);

	}

}

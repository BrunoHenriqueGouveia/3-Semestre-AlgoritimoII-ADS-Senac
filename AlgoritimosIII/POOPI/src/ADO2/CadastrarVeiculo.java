package ADO2;

/*
 Bruno Henrique Gouveia Da Silva 
 */
import javax.swing.JOptionPane;

public class CadastrarVeiculo {

	public static void main(String[] args) {
		Veiculos veiculo = new Veiculos();
		int novoVeiculo = 0;
		boolean ligado = false;

		do {

			veiculo.setMarca(JOptionPane.showInputDialog(null, "Informe a marca do veiculo:"));
			veiculo.setModelo(JOptionPane.showInputDialog(null, "Informe o modelo do veiculo:"));
			veiculo.setAnoFabricacao(JOptionPane.showInputDialog(null, "Informe o ano de fabricação do veiculo:"));

			do {
				String marcha = "";
				ligado = veiculo.ligadoOuDesligado((String) JOptionPane.showInputDialog(null,
						"marca: " + veiculo.getMarca() + "\nmodelo: " + veiculo.getModelo() + "\nAno Fabricação: "
								+ veiculo.getAnoFabricacao() + "\nDeseja ligar ou desligar carro:",
						"Opçao", JOptionPane.INFORMATION_MESSAGE, null, veiculo.getLigarCarro(),
						veiculo.getLigarCarro()[0]));

				while (marcha != "neutro" && ligado) {
					marcha = veiculo.marcha(Integer.parseInt((String) JOptionPane.showInputDialog(null,
							"Velocidade do carro:\nObs:Para desligar carro colocar no neutro(0km)", "Opçao",
							JOptionPane.INFORMATION_MESSAGE, null, veiculo.getVelocidade(),
							veiculo.getVelocidade()[0])));

					JOptionPane.showMessageDialog(null, "carro\nEsta: " + marcha);

				}
			} while (ligado == true);

			novoVeiculo = JOptionPane.showConfirmDialog(null, "deseja cadastrar outro veiculo:");
		} while (novoVeiculo == 0);

	}

}

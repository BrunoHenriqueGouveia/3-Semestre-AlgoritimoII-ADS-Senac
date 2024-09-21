package Aula3.Ex1;

import javax.swing.JOptionPane;

public class CadastrarPessoa {

	public static void main(String[] args) {
		
		Pessoa novaPessoa = new Pessoa();
		
		novaPessoa.setNome(JOptionPane.showInputDialog("informe seu nome:"));
		novaPessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("informe sua idade:")));
		novaPessoa.setEndereco(JOptionPane.showInputDialog("informe seu endereço:"));
		JOptionPane.showMessageDialog(null, novaPessoa.imprimirResultado());
		

	}

}

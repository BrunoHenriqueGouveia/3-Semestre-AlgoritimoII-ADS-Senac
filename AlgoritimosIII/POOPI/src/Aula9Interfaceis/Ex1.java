package Aula9Interfaceis;

import java.awt.*;
import javax.swing.*;

public class Ex1 extends JFrame {

	JLabel lblNome, lblTelefone;
	JTextField txtNome, txtTelefone;
	JButton bGravar, bSair;

	public Ex1() {
		
		TesteJFrame modelo = new TesteJFrame();
		
		setTitle(JOptionPane.showInputDialog("Informe o titulo"));// Titulo da janela
		setSize(Integer.parseInt(JOptionPane.showInputDialog("informe largura")),
				Integer.parseInt(JOptionPane.showInputDialog("informe altura")));// tamanho da janela larg, alt
		getContentPane().setLayout(null); // anula o layout padrao

		// cor de fundo da janela RGB (Red Green Blue)
		Color cor = JColorChooser.showDialog(null, "Escolha a cor de tela de fundo", getBackground());
		getContentPane().setBackground(cor);

		// provoca o termino da execução (encerra o programa)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblNome = modelo.criarJLabel("Nome", 10, 10);
	    add(lblNome); // Adicione o componente à janela Ex1
	    
	    txtNome = modelo.CriarTxt(10, 50);
	    add(txtNome); // Adicione o componente à janela Ex1
	    
	    lblTelefone = modelo.criarJLabel("Telefone", 10, 90);
	    add(lblTelefone); // Adicione o componente à janela Ex1
	    
	    txtTelefone = modelo.CriarTxt(10, 130);
	    add(txtTelefone); // Adicione o componente à janela Ex1
	    
	    bGravar = modelo.Criarbutao("Gravar", 'G', 100, 275, 100, 40);
	    add(bGravar); // Adicione o componente à janela Ex1
	    
	    bSair = modelo.Criarbutao("Sair", 'S', 200, 275, 100, 40);
	    add(bSair); // Adicione o componente à janela Ex1
		
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex1();
	}

}

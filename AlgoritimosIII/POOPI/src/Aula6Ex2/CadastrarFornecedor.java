package Aula6Ex2;

import javax.swing.JOptionPane;

public class CadastrarFornecedor {

	public static void main(String[] args) {
		

		int qtdFornecedor = Integer
				.parseInt(JOptionPane.showInputDialog("informe quantos fornecedor deseja cadastrar:"));
		

		Fornecedor fornecedor[] = new Fornecedor[qtdFornecedor];

		for (int i = 0; i < qtdFornecedor; i++) {

			String tipofornecedor[] = { "Fornecedor Empresa", "Fornecedor pessoa" };
			String escolha = ((String) JOptionPane.showInputDialog(null, "Escolha", "Escolha",
					JOptionPane.QUESTION_MESSAGE, null, tipofornecedor, tipofornecedor[0]));

			if (escolha.equalsIgnoreCase("Fornecedor Empresa")) {
				String nome = (JOptionPane.showInputDialog("informe nome da empresa"));
				String telefone = (JOptionPane.showInputDialog("informe seu telefone"));
				String ie = JOptionPane.showInputDialog("Informe seu IE");
				String cnpj = JOptionPane.showInputDialog("Informe seu cnpj");

				FornecedorEmpresa fE = new FornecedorEmpresa(nome, telefone, ie, cnpj);
				fornecedor[i] = fE;
			} else {
				String nome = (JOptionPane.showInputDialog("informe seu nome"));
				String telefone = (JOptionPane.showInputDialog("informe seu telefone"));
				String cpf = JOptionPane.showInputDialog("Informe seu cpf");
				String rg = JOptionPane.showInputDialog("Informe seu rg");

				FornecedorPessoa fP = new FornecedorPessoa(nome, telefone, rg, cpf);
				fornecedor[i] = fP;
			}

		}

		for(int i=0; i < fornecedor.length;i++) {
		     JOptionPane.showMessageDialog(null, fornecedor[i]);
		}
	}

}

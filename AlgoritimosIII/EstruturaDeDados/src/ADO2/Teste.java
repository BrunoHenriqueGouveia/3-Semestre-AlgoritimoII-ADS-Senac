package ADO2;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno.hgsilva3
 */
public class Teste {

    public static void main(String[] args) {

        Fila<String> fila = new Fila<>();

        String op[] = {"Solicitar nova senha", "Excluir uma senha", "Listar todas as senhas", "Visualizar que é o próximo a ser atendido", "chamar o próximo a ser atendido", "Finalizar Programa"};
        String operacao = "";

        do {

            operacao = (String) JOptionPane.showInputDialog(null, "Informe operação desejada:", "Opçao",
                    JOptionPane.INFORMATION_MESSAGE, null, op, op[0]);

            switch (operacao) {
                case "Finalizar Programa" -> {
                    JOptionPane.showMessageDialog(null, "Ate a Proxima!!!");
                }
                case "Solicitar nova senha" -> {

                    Object escolha = JOptionPane.showInputDialog(null, "Qual tipo de senha:", "Opção", JOptionPane.INFORMATION_MESSAGE, null, fila.tipo, fila.tipo[0]);

                    if (escolha.equals("Prioridade")) {
                        fila.setPreferencia(true);
                    }

                    fila.gerarSenha();

                }
                case "Excluir uma senha" -> {
                    String nome = JOptionPane.showInputDialog("Informe o nome da senha:");

                    if (JOptionPane.showConfirmDialog(null, "Deseja remove essa senha") == 0) {

                        try {
                            fila.remove(fila.buscaPosicao(nome));
                            JOptionPane.showMessageDialog(null, "Senha excluida com sucesso");
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }

                    }

                }
                case "Listar todas as senhas" -> {
                    if (fila.estaVazia()) {
                        JOptionPane.showMessageDialog(null, "Fila esta vazia");
                    } else {
                        JOptionPane.showMessageDialog(null, fila);
                    }

                }
                case "Visualizar que é o próximo a ser atendido" -> {

                    if (fila.estaVazia()) {
                        JOptionPane.showMessageDialog(null, "Fila esta vazia");
                    } else {
                        JOptionPane.showMessageDialog(null, "Proximo a senha a ser chamada é: " + fila.espiar());
                    }

                }
                case "chamar o próximo a ser atendido" -> {

                    if (fila.estaVazia()) {
                        JOptionPane.showMessageDialog(null, "Fila esta vazia");
                    } else {
                        fila.chamarProximo();
                    }

                }
                default ->
                    JOptionPane.showMessageDialog(null, "opção invalida, tente novamento");

            }

        } while (!operacao.equalsIgnoreCase("Finalizar Programa"));

    }

}

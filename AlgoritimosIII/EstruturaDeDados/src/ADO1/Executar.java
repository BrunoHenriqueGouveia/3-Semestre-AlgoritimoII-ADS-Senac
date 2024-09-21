
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADO1;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno.hgsilva3
 */
public class Executar {

    public static void main(String[] args) throws Exception {

        Remedio r = new Remedio();
        VetorFarmacia vetor = new VetorFarmacia();

        String opcao = "";

        do {

            opcao = (String) JOptionPane.showInputDialog(null, "Informe operação desejada:", "Opçao",
                    JOptionPane.INFORMATION_MESSAGE, null, r.getOp(), r.getOp()[0]);

            switch (opcao) {
                case "Finalizar Programa" -> {
                    JOptionPane.showMessageDialog(null, "Ate a Proxima!!!");
                }
                case "1) Adiciona Novo remedio" -> {

                    String nome = JOptionPane.showInputDialog("informe nome do remedio: ");

                    String qtdDeGramaRemedio = JOptionPane.showInputDialog("informe quantas Gramas tem a caixa: ");

                    int qtdComprimidos = Integer.parseInt(JOptionPane.showInputDialog("informe quantidade de comprimidos: "));

                    int qtdDeCaixaRemedio = Integer.parseInt(JOptionPane.showInputDialog("informe quantidade de caixas de remedios: "));

                    double valorRemedio = Double.parseDouble(JOptionPane.showInputDialog("informe o valor do remedio: "));

                    String tipoRemedio = (String) JOptionPane.showInputDialog(null, "Informe o tipo do remedio:", "Opçao",
                            JOptionPane.INFORMATION_MESSAGE, null, r.getTipos(), r.getTipos()[0]);

                    Remedio dadosremedio = new Remedio(nome, qtdDeGramaRemedio, qtdComprimidos, qtdDeCaixaRemedio, valorRemedio, tipoRemedio);
                    vetor.adiciona(dadosremedio);
                    JOptionPane.showMessageDialog(null, "Remedio Cadastrado com sucesso");
                }
                case "2) Remove remedio" -> {
                    String nome = JOptionPane.showInputDialog("Informe o nome do remedio:");

                    if (JOptionPane.showConfirmDialog(null, "Deseja remove esse remedio:\n" + vetor.buscaPorNome(nome)) == 0) {
                        vetor.remove(vetor.buscaPosicao(nome));
                    }
                }
                case "3) Quantidade de remedio cadastrado" -> {

                    JOptionPane.showMessageDialog(null, "Quantidade de remedios cadastrado é: " + vetor.tamanho);

                }
                case "4) Mostrar remedios cadastrados" -> {
                    JOptionPane.showMessageDialog(null, vetor);
                }
                case "5) Busca posição do remedio" -> {

                    String nomeRmedio = JOptionPane.showInputDialog("informe nome do remedio: ");
                    if (vetor.buscaPosicao(nomeRmedio) >= 0) {
                        JOptionPane.showMessageDialog(null, "A posição do remedio cadastrado é: " + vetor.buscaPosicao(nomeRmedio));
                    } else {
                        JOptionPane.showMessageDialog(null, "Remedio não encontrado");

                    }

                }
                case "6) Busca dados do remedio" -> {
                    String nomeRmedio = JOptionPane.showInputDialog("informe nome do remedio: ");
                    JOptionPane.showMessageDialog(null, vetor.buscaPorNome(nomeRmedio));

                }
                case "7) Alterar dados do remedio" -> {
                    String nomeRmedio = JOptionPane.showInputDialog("informe nome do remedio: ");
                    Remedio remedio = vetor.buscaPorNome(nomeRmedio);
                    if (remedio != null) {
                        String novoNome = JOptionPane.showInputDialog("informe novo nome do remedio: ");
                        String qtdDeGramaRemedio = JOptionPane.showInputDialog("informe nova quantidade de Gramas: ");
                        int qtdComprimidos = Integer.parseInt(JOptionPane.showInputDialog("informe nova quantidade de comprimidos: "));
                        int qtdDeCaixaRemedio = Integer.parseInt(JOptionPane.showInputDialog("informe nova quantidade de caixas de remedios: "));
                        double valorRemedio = Double.parseDouble(JOptionPane.showInputDialog("informe novo valor do remedio: "));
                        String tipoRemedio = (String) JOptionPane.showInputDialog(null, "Informe o novo tipo do remedio:", "Opçao",
                                JOptionPane.INFORMATION_MESSAGE, null, r.getTipos(), r.getTipos()[0]);

                        remedio.setNomeRemedio(novoNome);
                        remedio.setQtdDeGramaRemedio(qtdDeGramaRemedio);
                        remedio.setQtdComprimidos(qtdComprimidos);
                        remedio.setQtdDeCaixaRemedio(qtdDeCaixaRemedio);
                        remedio.setValorRemedio(valorRemedio);
                        remedio.setTipoRemedio(tipoRemedio);

                        JOptionPane.showMessageDialog(null, "Dados do remedio alterados com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null, "Remedio não encontrado");
                    }
                }
                default ->
                    JOptionPane.showMessageDialog(null, "opção invalida, tente novamento");

            }

        } while (!opcao.equalsIgnoreCase("Finalizar Programa"));

    }

}

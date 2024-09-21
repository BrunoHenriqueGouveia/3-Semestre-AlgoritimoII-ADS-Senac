/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADO1;

/**
 *
 * @author bruno.hgsilva3
 */
public class Remedio {

    private String nomeRemedio;
    private String qtdDeGramaRemedio;
    private int qtdComprimidos;
    private int qtdDeCaixaRemedio;
    private double valorRemedio;
    private String tipoRemedio;
    private String[] tipos = {"Escolha um Tipo", "Alergias", "Anti-inflamatorio", "Antidepressivos", "Calmantes", "Asma", "Congestao nasal", "Diabetes", "Dor e Febre", "Dor de garganta", "Gripe e resfriado", "Gastrite", "Infecções", "Insonia", "Tosse"};
    private String[] op = {"Opções", "1) Adiciona Novo remedio", "2) Remove remedio", "3) Quantidade de remedio cadastrado", "4) Mostrar remedios cadastrados", "5) Busca posição do remedio", "6) Busca dados do remedio", "7) Alterar dados do remedio", "Finalizar Programa"};

    public String[] getOp() {
        return op;
    }

    public void setOp(String[] op) {
        this.op = op;
    }

    public Remedio() {
    }

    public String[] getTipos() {
        return tipos;
    }

    public Remedio(String nomeRemedio, String qtdDeGramaRemedio, int qtdComprimidos, int qtdDeCaixaRemedio, double valorRemedio, String tipoRemedio) {
        this.nomeRemedio = nomeRemedio;
        this.qtdDeGramaRemedio = qtdDeGramaRemedio;
        this.qtdComprimidos = qtdComprimidos;
        this.qtdDeCaixaRemedio = qtdDeCaixaRemedio;
        this.valorRemedio = valorRemedio;
        this.tipoRemedio = tipoRemedio;
    }

    public String getNomeRemedio() {
        return nomeRemedio;
    }

    public void setNomeRemedio(String nomeRemedio) {
        this.nomeRemedio = nomeRemedio;
    }

    public String getQtdDeGramaRemedio() {
        return qtdDeGramaRemedio;
    }

    public void setQtdDeGramaRemedio(String qtdDeGramaRemedio) {
        this.qtdDeGramaRemedio = qtdDeGramaRemedio;
    }

    public int getQtdComprimidos() {
        return qtdComprimidos;
    }

    public void setQtdComprimidos(int qtdComprimidos) {
        this.qtdComprimidos = qtdComprimidos;
    }

    public int getQtdDeCaixaRemedio() {
        return qtdDeCaixaRemedio;
    }

    public void setQtdDeCaixaRemedio(int qtdDeCaixaRemedio) {
        this.qtdDeCaixaRemedio = qtdDeCaixaRemedio;
    }

    public double getValorRemedio() {
        return valorRemedio;
    }

    public void setValorRemedio(double valorRemedio) {
        this.valorRemedio = valorRemedio;
    }

    public String getTipoRemedio() {
        return tipoRemedio;
    }

    public void setTipoRemedio(String tipoRemedio) {
        this.tipoRemedio = tipoRemedio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n=========================\n");
        sb.append("Remedio: ").append(nomeRemedio).append("\n");
        sb.append("Grama Remedio: ").append(qtdDeGramaRemedio).append("\n");
        sb.append("Quantidade Comprimidos: ").append(qtdComprimidos).append("\n");
        sb.append("Quantidade Caixa Remedios: ").append(qtdDeCaixaRemedio).append("\n");
        sb.append("valor Remedio: $").append(valorRemedio).append("\n");
        sb.append("Tipo Remedio: ").append(tipoRemedio).append("\n");
        sb.append("========================\n");
        return sb.toString();
    }

}

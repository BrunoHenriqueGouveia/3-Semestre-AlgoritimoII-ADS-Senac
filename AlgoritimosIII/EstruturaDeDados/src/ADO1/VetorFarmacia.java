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
public class VetorFarmacia {

    // lista de atributos
    public Object[] elementos;
    public int tamanho;

    // metodo construtor
    public VetorFarmacia() {

//this palavra-chave Java é usada para referenciar a instância atual do método
//no qual é usada. Aqui, isso se refere à variável de instância. ...
//Isso chama o construtor da mesma classe java que possui um parâmetro .
        this.elementos = new Object[20];
        this.tamanho = 0;
    }

    public void adiciona(Object elemento) throws Exception {

        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

        } else {
            throw new Exception("o vetor ja esta cheio");
        }

    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("->\n");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(i + 1);
            s.append(this.elementos[i]);
        }

        if (this.tamanho > 0) {
            s.append(this.tamanho);
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("<-");
        return s.toString();
    }

    public Remedio buscaPorNome(String nomeRemedio) {

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] instanceof Remedio) {
                Remedio remedio = (Remedio) elementos[i];
                if (remedio.getNomeRemedio().equals(nomeRemedio)) {
                    return remedio;
                }

            }

        }
        return null;
    }

    public int buscaPosicao(String nomeRemedio) {

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] instanceof Remedio) {
                Remedio remedio = (Remedio) elementos[i];
                if (remedio.getNomeRemedio().equals(nomeRemedio)) {
                    return i;
                }

            }

        }
        return -1;
    }

    public boolean adicionaInicio(int posicao, Object elemento) throws Exception {
        this.aumentaCapacidade();
        if (posicao >= 0 && posicao < tamanho) {
            for (int i = this.tamanho - 1; i >= posicao; i--) {
                this.elementos[i + 1] = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("posicao invalida");

        }

        return true;

    }

    public void aumentaCapacidade() {

        if (this.elementos.length == this.tamanho) {
            Object[] elementosNovos = new Object[this.elementos.length * 2];

            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }

    public void remove(int posicao) throws Exception {

        if (posicao >= 0 && posicao < this.tamanho) {

            for (int i = posicao; i < this.tamanho - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.tamanho--;

            JOptionPane.showMessageDialog(null, "Remedio removido com sucesso");

        } else {
            throw new Exception("posicao invalida");

        }

    }

}

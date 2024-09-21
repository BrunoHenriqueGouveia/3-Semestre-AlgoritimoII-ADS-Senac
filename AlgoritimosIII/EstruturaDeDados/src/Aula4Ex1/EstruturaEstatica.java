/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4Ex1;

/**
 *
 * @author bruno.hgsilva3
 */
public class EstruturaEstatica<T> {

    public T[] elementos;
    public int tamanho;

    //metodo construtor com paramentro
    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }
    // metodo construtor sem parametro

    public EstruturaEstatica() {
        this(10);
    }

    // metodo para adicionar elementos
    public boolean adiciona(T elemento) {

        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;

        }
        return false;

    }

    //metodo para adicionar em qualquer posicao
    public boolean adicionaQualquerPosicao(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("posição invalida");
        }
        this.aumentaCapacidade();
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];

        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    //metodo para aumentar a capacidade
    public void aumentaCapacidade() {

        if (this.elementos.length == this.tamanho) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public void remove(int posicao) throws Exception {

        if (posicao >= 0 && posicao < this.tamanho) {

            for (int i = posicao; i < this.tamanho - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.tamanho--;

        } else {
            throw new Exception("posicao invalida");

        }

    }

}

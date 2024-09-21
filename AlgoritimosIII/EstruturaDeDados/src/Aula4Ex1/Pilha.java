/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4Ex1;

/**
 *
 * @author bruno.hgsilva3
 * @param <T>
 */
public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
        //dessa forma estamos reutilizando o codigo da classe pai
        super.adiciona(elemento);
    }

    public T topo() {

        if (this.estaVazia()) {
            return null;
        } else {
            return this.elementos[tamanho - 1];
        }
    }

    public T desempilha() {
        if (this.estaVazia()) {
            return null;
        }
        T elemento = this.elementos[tamanho - 1];
        tamanho--;
        return elemento;
    }

}

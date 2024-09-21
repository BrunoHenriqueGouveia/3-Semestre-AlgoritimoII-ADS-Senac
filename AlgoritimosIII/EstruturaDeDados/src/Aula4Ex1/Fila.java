/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4Ex1;

/**
 *
 * @author bruno.hgsilva3
 */
public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento) {
        this.adiciona(elemento);
    }

    //somente tem como funcionalidade observar e podemos ver que está por exemplo no início da fila
    public T espiar() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    /*
    Agora vamos remover um elemento da fila com o método
    desenfileira(), lembrando do comportamento da fila que é
    FIFO – Firs In First Out (Primeiro a entrar, primeiro a sair)
     */
    public T desenfileira() throws Exception {
        if (this.estaVazia()) {
            return null;
        }

        /* ja temos um metodo paa remover na classe pai porem precisa indicar
        a posição e para isso vamos criar uma constante
         */
        
        final int posicao = 0;
        T elementoRemovido = this.elementos[posicao];
        this.remove(posicao);
        return elementoRemovido;
    }

}

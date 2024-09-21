package Aula4Ex1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author bruno.hgsilva3
 */
public class Teste {

    public static void main(String[] args) throws Exception {

        //pilha
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 1; i <= 10; i++) {
            pilha.empilha(i);
        }
        System.out.println("esta vazia: " + pilha.estaVazia());

        System.out.println(pilha);

        System.out.println(pilha.tamanho());

        System.out.println("quem esta no topo: " + pilha.topo());

        System.out.println("desembilhar quem esta no topo: " + pilha.desempilha());

        System.out.println(pilha);

        System.out.println("==========================================");
        //==================================================
        // Agora que já vimos a lógica do funcionamento de uma pilha,
        //vamos conhecer a API Java Stack, que são bem semelhantes
        //aos métodos desenvolvidos até agora nesse projeto

        Stack<Integer> stack = new Stack<>();

        // metodo para verificar se a pilha esta vazia
        System.out.println(stack.isEmpty());

        // metodo para embilhar
        stack.push(5);
        stack.push(4);
        stack.push(2);

        //metodo para verificar o tamanho da pilha
        System.out.println(stack.size());

        // metodo ToString para exibir a pilha
        System.out.println(stack);

        // metodo para verificar o topo
        System.out.println(stack.peek());

        //metodo para desempilhar
        System.out.println(stack.pop());

        // metodo ToString para exibir a pilha
        System.out.println(stack);

        //========================================================================
        //fila
        Fila<Integer> fila = new Fila<>();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        // vamos verificar se a fila esta vazia, nesse caso sera false
        System.out.println("A fila esta vazia? " + fila.estaVazia());

        //vamos verificar o tamanho da minha fila apos enfileirar
        System.out.println("Qual o tamanho: " + fila.tamanho());

        // vamos visualizar os elementos dentro da fila
        System.out.println(fila.toString());

        // vamos espiar a fila 
        System.out.println(fila.espiar());

        //´poderiamos criar um estrutura de decisão com o retorno do metodo
        if (fila.espiar() == null) {
            System.out.println("Ninguem na fila");
        } else {
            System.out.println("o elemento da primeira posição é: " + fila.espiar());
        }

        // vamos desenpilhar um elemento
        System.out.println(fila.desenfileira());

        // vamos visualizar a fila novamente apos remover um elemento
        System.out.println(fila.toString());

        /*Agora vamos conferi a API do Java que contém todas essas
funcionalidades prontas – API Java Queue
         */
        
         Queue<Integer> filaPronta = new LinkedList<Integer>();
         
         filaPronta.add(1);
         filaPronta.add(2);
         filaPronta.add(3);
         
         //exibe
         System.out.println(filaPronta.toString());
         
         //recupera, mais não remove, o cabeçalho desta fila ou retorna nulo se a fila estiver vazia ou seja nossso metodo espiar
         System.out.println(filaPronta.peek());
     
         //remove elemento da fila ou desenfileira, por conta da classe Queue
         // FIFO - Firs In First Out(Primeiro a entrar, primeiro a sair).
         System.out.println(filaPronta.remove());
         
         
         
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosOrdenacao;

/**
 *
 * @author bruno.hgsilva3
 */
public class BubbleSort {

    public static void main(String[] args) {

        //criando um vetor de numeros inteiros de 10 posiçoes
        int[] vetor = new int[10];

        //inserindo valores no vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);

            //exibindo os valores do vetor
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.println("===========================");
        //metodo de ordenação BubbleSort
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {

                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }

        }

        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

}

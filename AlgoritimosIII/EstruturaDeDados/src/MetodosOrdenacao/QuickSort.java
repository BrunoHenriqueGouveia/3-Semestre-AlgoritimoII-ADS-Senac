/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosOrdenacao;

public class QuickSort {

    public static void main(String[] args) {

        // crianado um vetor de numeros inteiros
        int[] vetor = new int[10];

        //inserindo valores no vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);

            //exibindo os valores do vetor
            System.out.print(vetor[i] + " ");
        }
        
        
        // chamando o metodo para a ordenação
        quickSortFuncao(vetor, 0, vetor.length-1);
        
        // exibindo o nosso vetor ordenado
        System.out.println();
        System.out.println("===========================");
         for (int i : vetor) {
            System.out.print(i + " ");
        }

    }

    // metodo  para ordenar
    public static void quickSortFuncao(int[] vetor, int esquerda, int direita) {

        if (esquerda < direita) {
            int pivo = particaoFuncao(vetor, esquerda, direita);
            quickSortFuncao(vetor, esquerda, pivo);
            quickSortFuncao(vetor, pivo + 1, direita);
        }
    }

    public static int particaoFuncao(int[] vetor, int esquerda, int direita) {

        int meio = (int) (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        int aux;

        while (true) {

            do {
                i++;
            } while (vetor[i] < pivo);

            do {
                j--;
            } while (vetor[j] > pivo);

            if (i >= j) {
                return j;
            }
            aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;

        }

    }
}

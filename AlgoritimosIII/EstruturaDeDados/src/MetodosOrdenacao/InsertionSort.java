/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosOrdenacao;

public class InsertionSort {

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

        //metodo de ordenação InsertioSort
        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }

        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosOrdenacao;

public class InsertionSortTime {

    /*
    Tempo de execução de um vetor de 100 = 0ms
     Tempo de execução de um vetor de 1.000 = 2ms
     Tempo de execução de um vetor de 10.000 = 15ms
     Tempo de execução de um vetor de 100.000 =925 ms
     Tempo de execução de um vetor de 1.000.000 = 92312ms
    
     */
    public static void main(String[] args) {
        //criando um vetor de numeros inteiros de 10 posiçoes
        int[] vetor = new int[1000000];

        //inserindo valores no vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);

        }

        //variavel que registra o tempo de execução do programa no inicio
        long inicio = System.currentTimeMillis();

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

        //variavel que registra o tempo de execução do programa no final
        long fim = System.currentTimeMillis();

        //exibindo o tempo de execução
        System.out.println("Tempo de execução: " + (fim - inicio));
    }

}

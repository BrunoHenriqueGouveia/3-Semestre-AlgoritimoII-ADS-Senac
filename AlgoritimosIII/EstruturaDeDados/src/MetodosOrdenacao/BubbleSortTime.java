/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosOrdenacao;

public class BubbleSortTime {

    /*
    Tempo de execução de um vetor de 100 = 0ms
     Tempo de execução de um vetor de 1.000 = 4ms
     Tempo de execução de um vetor de 10.000 = 172ms
     Tempo de execução de um vetor de 100.000 =16.684ms 
     Tempo de execução de um vetor de 1.000.000 =165.3756ms
    
     */
    public static void main(String[] args) {
        //criando um vetor de numeros inteiros de 10 posiçoes
        int[] vetor = new int[100000];

        //inserindo valores no vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);

        }

        //variavel que registra o tempo de execução do programa no inicio
        long inicio = System.currentTimeMillis();

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

        //variavel que registra o tempo de execução do programa no final
        long fim = System.currentTimeMillis();

        //exibindo o tempo de execução
        System.out.println("Tempo de execução: " + (fim - inicio));

    }

}

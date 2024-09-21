/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosOrdenacao;

/**
 *
 * @author bruno.hgsilva3
 */
public class QuickSortTime {

    /*
    Tempo de execução de um vetor de 100 = 0ms
     Tempo de execução de um vetor de 1.000 = 0ms
     Tempo de execução de um vetor de 10.000 = 0ms
     Tempo de execução de um vetor de 100.000 =14 ms
     Tempo de execução de um vetor de 1.000.000 = 123ms
    
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

        // chamando o metodo para a ordenação
        quickSortFuncao(vetor, 0, vetor.length - 1);
        
        //variavel que registra o tempo de execução do programa no final
        long fim = System.currentTimeMillis();

        //exibindo o tempo de execução
        System.out.println("Tempo de execução: " + (fim - inicio));
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosOrdenacao;

/**
 *
 * @author bruno.hgsilva3
 */
public class SelectionSortTime {
     /*
    Tempo de execução de um vetor de 100 = 0ms
     Tempo de execução de um vetor de 1.000 = 6ms
     Tempo de execução de um vetor de 10.000 = 72ms
     Tempo de execução de um vetor de 100.000 =6600 ms
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

       //metodo de ordenação selectioSort
        int aux, menor_posicao;
        for (int i = 0; i < vetor.length; i++) {
            menor_posicao = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor_posicao]) {
                    menor_posicao = j;
                }
            }

            aux = vetor[menor_posicao];
            vetor[menor_posicao] = vetor[i];
            vetor[i] = aux;

        }

        //variavel que registra o tempo de execução do programa no final
        long fim = System.currentTimeMillis();

        //exibindo o tempo de execução
        System.out.println("Tempo de execução: " + (fim - inicio));
    }

}

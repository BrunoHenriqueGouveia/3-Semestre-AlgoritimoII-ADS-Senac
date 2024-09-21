/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturadedados;

import java.util.Scanner;

/**
 *
 * @author bruno.hgsilva3
 */
public class Ex1Aula {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double[] temperatura = new double[7];
        double soma = 0;

        for (int i = 0; i < temperatura.length; i++) {

            System.out.println("digite a temperatura do " + (i + 1) + "° dia:");
            temperatura[i] = ler.nextDouble();
            soma += temperatura[i];
        }

        double media = soma / 7;
        int qtdAcimaDaMedia = 0;
        int qtdAbaixoDaMedia = 0;

        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] > media) {
                qtdAcimaDaMedia++;
            }
            if (temperatura[i] < media) {
                qtdAbaixoDaMedia++;
            }
        }
        System.out.println("A media das temperatrura é: " + media);
        System.out.println("Total de dias que a temperatura ficou acima da média: " + qtdAcimaDaMedia);
        System.out.println("Total de dias que a temperatura ficou abaixo da média: " + qtdAbaixoDaMedia);

    }
}

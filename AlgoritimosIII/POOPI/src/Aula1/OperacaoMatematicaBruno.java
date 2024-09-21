package Aula1;
import java.util.Scanner;
public class OperacaoMatematicaBruno {
	 public static void main(String[] args) {

		    Scanner ler = new Scanner(System.in);
		    int num = 0;
		    double soma, sub, multi, divisao, valor1, valor2;

		    do {
		      System.out.println("1 soma");
		      System.out.println("2 subtração");
		      System.out.println("3 multiplicaçao ");
		      System.out.println("4 divisão");
		      System.out.println("0 finalizar");
		      num = ler.nextInt();

		      if (num == 1) {
		        System.out.println("informe o numero?");
		        valor1 = ler.nextDouble();
		        valor2 = ler.nextDouble();
		        soma = valor1 + valor2;
		        System.out.printf("o valor da soma %.0f + %.0f = %.0f %n", valor1, valor2, soma);
		      } else if (num == 2) {
		        System.out.println("informe o numero?");
		        valor1 = ler.nextDouble();
		        valor2 = ler.nextDouble();
		        sub = valor1 - valor2;
		        System.out.printf("o valor da subtração %.0f - %.0f = %.0f %n", valor1, valor2, sub);
		      } else if (num == 3) {
		        System.out.println("informe o numero?");
		        valor1 = ler.nextDouble();
		        valor2 = ler.nextDouble();
		        multi = valor1 * valor2;
		        System.out.printf("o valor da multiplicação %.0f * %.0f = %.0f %n", valor1, valor2, multi);
		      } else if (num == 4) {
		        System.out.println("informe o numero?");
		        valor1 = ler.nextDouble();
		        do {
		          valor2 = ler.nextDouble();
		          if (valor2 == 0) {
		            System.out.println("o denominador deve ser diferente de 0 \n informe novamente:");
		          }
		        } while (valor2 == 0);
		        divisao = valor1 / valor2;
		        System.out.printf("o valor da divisão %.0f / %.0f = %.0f %n", valor1, valor2, divisao);
		      }
		      else if (num > 4){
		        System.out.println("opção invalida");
		      }

		    } while (num != 0);
		    ler.close();
		  }
	 
	
}

package Aula9Excecoes;

public class TesteException3 {
	public static void main(String args[]) {
		int a = 25;
		int b = 0;

		try {
			int c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Divisao por zero");
		}
	}
}

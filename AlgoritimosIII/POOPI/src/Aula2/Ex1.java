package Aula2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoas novo = new Pessoas();
		String continuar = "", cadastrarNovo = "", nome, deseja;
		int passos = 0, idade = 0, totalDePassos = 0;

		do {
			System.out.println("informe seu nome:");
			nome = ler.next();

			System.out.println("informe sua idade:");
			idade = ler.nextInt();

			System.out.println("deseja caminha:Sim ou Não");
			deseja = ler.next();

			novo.setIdade(idade);
			novo.setNome(nome);

			do {

				if (deseja.equalsIgnoreCase("sim")) {

					System.out.println("informe a quantidade de passos:");
					passos = ler.nextInt();
					System.out.println("caminhando.....");
					totalDePassos += passos;
				}

				System.out.println("deseja continuar andando:Sim ou Não?");
				continuar = ler.next();

			} while (continuar.equalsIgnoreCase("sim"));

			novo.setAndar(totalDePassos);
			novo.imprimir();

			System.out.println("deseja cadastrar outra pessoa:Sim ou Não?");
			cadastrarNovo = ler.next();

		} while (cadastrarNovo.equalsIgnoreCase("sim"));

		ler.close();
	}

}

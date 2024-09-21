package Aula2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Pessoas nomeInvertido = new Pessoas();
		
		System.out.println("informe seu nome");
		String nome = ler.next();
		
		System.out.println(nomeInvertido.nomeInvertido(nome));
		ler.close();

	}

}

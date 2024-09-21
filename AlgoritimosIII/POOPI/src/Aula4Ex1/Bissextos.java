package Aula4Ex1;

import java.util.Calendar;

/**
 * Crie um programa que imprima na tela todos os anos 
 * bissextos desde o ano ZERO até o ano atual.
 */
public class Bissextos {
	static Calendar c = Calendar.getInstance();

	public static void main(String[] args) {
		for(int i=1; i<=c.get(Calendar.YEAR) ; i++) {
			Data d = new Data();
			d.setAno(i);
			if(d.isAnoBissexto())
				System.out.println(i + " é bissexto!");
			else
				System.out.println(i + " não é bissexto!");
			
		}
	}

}

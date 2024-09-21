package ADO4;

/*
 * Bruno Henrique Gouveia Da Silva
 */

import java.util.InputMismatchException;

public class Utilitario {

	// verifica cnpj
	public static boolean isCNPJ(String CNPJ) {

		// considera-se erro CNPJ's formados por uma sequencia de numeros iguais
		if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") || CNPJ.equals("22222222222222")
				|| CNPJ.equals("33333333333333") || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555")
				|| CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") || CNPJ.equals("88888888888888")
				|| CNPJ.equals("99999999999999") || (CNPJ.length() != 14)) {
			return (false);
		}

		char dig13, dig14;
		int sm, i, r, num, peso;

		// "try" - protege o código para eventuais erros de conversao de tipo (int)
		try {
			// Calculo do 11o. Digito Verificador
			sm = 0;
			peso = 2;
			for (i = 11; i >= 0; i--) {
				// converte o i-ésimo caractere do CNPJ em um número:
				// por exemplo, transforma o caractere '0' no inteiro 0
				// (48 eh a posição de '0' na tabela ASCII)
				num = (int) (CNPJ.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso + 1;
				if (peso == 10) {
					peso = 2;
				}
			}

			r = sm % 11;
			if ((r == 0) || (r == 1)) {
				dig13 = '0';
			} else {
				dig13 = (char) ((11 - r) + 48);
			}

			// Calculo do 2o. Digito Verificador
			sm = 0;
			peso = 2;

			for (i = 12; i >= 0; i--) {
				num = (int) (CNPJ.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso + 1;
				if (peso == 10)
					peso = 2;
			}

			r = sm % 11;
			if ((r == 0) || (r == 1))
				dig14 = '0';
			else
				dig14 = (char) ((11 - r) + 48);

			// Verifica se os dígitos calculados conferem com os dígitos informados.
			if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13)))
				return (true);
			else
				return (false);
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	// máscara do CNPJ: 99.999.999.9999-99
	public static String imprimeCNPJ(String CNPJ) {
		return (CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." + CNPJ.substring(5, 8) + "."
				+ CNPJ.substring(8, 12) + "-" + CNPJ.substring(12, 14));
	}

	// verificador cpf
	public static boolean isCPF(String CPF) {
		// considera-se erro CPF"s formados por uma sequencia de numeros iguais
		if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222")
				|| CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555")
				|| CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888")
				|| CPF.equals("99999999999") || (CPF.length() != 11)) {
			return (false);
		}

		char dig10, dig11;
		int sm, i, r, num, peso;

		// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
		try {
			// Calculo do 1o. Digito Verificador
			sm = 0;
			peso = 10;
			for (i = 0; i < 9; i++) {
				// converte o i-esimo caractere do CPF em um numero:
				// por exemplo, transforma o caractere "0" no inteiro 0
				// (48 eh a posicao de "0" na tabela ASCII)
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11)) {
				dig10 = '0';
			} else {
				dig10 = (char) (r + 48); // converte no respectivo caractere numerico
			}

			// Calculo do 2o. Digito Verificador
			sm = 0;
			peso = 11;
			for (i = 0; i < 10; i++) {
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11)) {
				dig11 = '0';
			} else {
				dig11 = (char) (r + 48);
			}

			// Verifica se os digitos calculados conferem com os digitos informados.
			if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
				return (true);
			} else {
				return (false);
			}
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	// mascara de cpf 999.999.999-99.
	public static String imprimeCPF(String CPF) {
		return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." + CPF.substring(6, 9) + "-"
				+ CPF.substring(9, 11));
	}

	// validação IE
	public static boolean isIE(String IE) {

		// considera-se erro IE"s formados por uma sequencia de numeros iguais
		if (IE.equals("000000000") || IE.equals("111111111") || IE.equals("222222222") || IE.equals("333333333")
				|| IE.equals("444444444") || IE.equals("555555555") || IE.equals("666666666") || IE.equals("777777777")
				|| IE.equals("888888888") || IE.equals("999999999") || (IE.length() != 9)) {
			return (false);
		}

		char dig9;
		int sm = 0, peso = 9, num, r;

		try {

			for (int i = 0; i < 8; i++) {
				num = (int) IE.charAt(i) - 48;
				sm = sm + (peso * num);
				peso = peso - 1;
			}

			r = sm % 11;
			if (r == 0 || r == 1) {
				dig9 = '0';
			} else {
				r = 11 - r;
				dig9 = (char) (r + 48);
			}

			// Verifica se os digitos calculados conferem com os digitos informados.
			if ((dig9 == IE.charAt(8))) {
				return (true);
			} else {
				return (false);
			}

		} catch (InputMismatchException erro) {
			return (false);
		}

	}

	// mascara de IE 999.999.999
	public static String imprimeIE(String IE) {
		return (IE.substring(0, 3) + "." + IE.substring(3, 6) + "." + IE.substring(6, 9));
	}

	// validação RG
	public static boolean isRG(String RG) {
		// considera-se erro RG"s formados por uma sequencia de numeros iguais
		if (RG.equals("000000000") || RG.equals("111111111") || RG.equals("222222222") || RG.equals("333333333")
				|| RG.equals("444444444") || RG.equals("555555555") || RG.equals("666666666") || RG.equals("777777777")
				|| RG.equals("888888888") || RG.equals("999999999") || (RG.length() != 9)) {
			return false;
		}

		char dig9;
		int soma = 0, num, peso = 9;

		try {

			for (int i = 7; i >= 0; i--) {
				num = (int) RG.charAt(i) - 48;
				soma = soma + (num * peso);
				peso--;
			}

			int r = 11 - (soma % 11);

			if (r == 10 || r == 11) {
				dig9 = '0';
			} else {
				dig9 = (char) (r + 48);
			}

			// Verifica se os digitos calculados conferem com os digitos informados.
			if (dig9 == RG.charAt(8)) {
				return true;
			} else {
				return false;
			}

		} catch (InputMismatchException erro) {
			return false;
		}

	}

	// mascara de RG 99.999.999-9
	public static String imprimeRG(String RG) {
		return (RG.substring(0, 2) + "." + RG.substring(2, 5) + "." + RG.substring(5, 8) + "-" + RG.substring(8, 9));
	}

	public static void main(String[] args) {

		System.out.println(Utilitario.imprimeCPF("37476402812"));
		System.out.println("CPF valido: " + Utilitario.isCPF("37476402812"));
		System.out.println();
		System.out.println(Utilitario.imprimeCNPJ("11222333000181"));
		System.out.println("Cnpj valido: " + Utilitario.isCNPJ("11222333000181"));
		System.out.println();
		System.out.println(Utilitario.imprimeIE("120000385"));
		System.out.println("IE valido: " + Utilitario.isIE("120000385"));
		System.out.println();
		System.out.println(Utilitario.imprimeRG("396719338"));
		System.out.println("RG valido: " + Utilitario.isRG("396719338"));

	}

}

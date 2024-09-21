package Aula4Ex1;

import javax.swing.JOptionPane;

public class Data {
	private int ano;
	private byte mes;
	private byte dia;

	public int getAno() {
		return ano;
	}

	public void setAno(int a) {
		if (a > 0) {
			ano = a;
		} else
			JOptionPane.showMessageDialog(null, validarData());
	}

	public byte getDia() {
		return dia;
	}

	public void setDia(byte d) {
		if (d > 0 && d <= 31) {
			dia = d;
		} else
			JOptionPane.showMessageDialog(null, validarData());
	}

	private String validarData() {
		return "Data inválida. \nPreencha novamente";

	}

	public byte getMes() {
		return mes;
	}

	public void ajustarMes(byte m) {
		if (m > 0 && m <= 12) {
			mes = m;
		} else
			JOptionPane.showMessageDialog(null, validarData());
	}

	public boolean isAnoBissexto() {
		if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0))
			return true;
		else
			return false;
	}
}
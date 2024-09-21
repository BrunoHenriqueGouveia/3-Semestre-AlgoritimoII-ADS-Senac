package Aula4Ex1;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 * Crie um classe CadastraData que permita o cadastramento e exibição do dia,
 * mês e ano e ao final imprima-os e verifique e imprima a mensagem se o ano
 * informado é ou não bissexto.
 * 
 */

public class CadastraData {
	public static void main(String[] args) {

		Calendar d = Calendar.getInstance();
		Data data = new Data();

		// dia
		data.setDia((byte) (d.get(Calendar.DAY_OF_MONTH)));

		// mes o +1 é pq no calendar o mes começa no zero
		data.ajustarMes((byte) (d.get(Calendar.MONTH) + 1));

		// ano
		data.setAno(d.get(Calendar.YEAR));

		JOptionPane.showMessageDialog(null, data.getDia() + "/" + data.getMes() + "/" + data.getAno());

		if (data.isAnoBissexto()) {
			JOptionPane.showMessageDialog(null, data.getAno() + " é bissexto!");
		} else
			JOptionPane.showMessageDialog(null, data.getAno() + " não é bissexto!");
	}
}
package Aula5Ex2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		LocalDate dataAtaul = LocalDate.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalTime localTime = LocalTime.now();
		
		System.out.println(dataAtaul);
		System.out.println(localDateTime);
		System.out.println(localTime);

		Pessoa p = new Pessoa();
		
		do {

		p.setNome(JOptionPane.showInputDialog("informe seu nome:"));
		p.setDiaNascimento(Integer.parseInt(JOptionPane.showInputDialog("informe dia de nascimento:")));
		p.setMesNascimento(Integer.parseInt(JOptionPane.showInputDialog("informe mes de nascimento:")));
		p.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("informe ano de nascimento:")));

		LocalDate nascimento = LocalDate.of(p.getAnoNascimento(), p.getMesNascimento(), p.getDiaNascimento());

		String dataFormatada = nascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		JOptionPane.showMessageDialog(null, p.getNome()+" nasceu em: " + dataFormatada);
		
		Period periodoVivido = Period.between(nascimento, dataAtaul);
		
		long minutpsVividos = ChronoUnit.MINUTES.between(nascimento, dataAtaul);
		long horasVividas = ChronoUnit.HOURS.between(nascimento, dataAtaul);
		long diasVividos = ChronoUnit.DAYS.between(nascimento, dataAtaul);
		
		JOptionPane.showMessageDialog(null,p.getNome()+ " ja viveu: " + periodoVivido +"\n dias vividos: "+ diasVividos+ "\n horas vividos: "+horasVividas+"\n minutos vividos:"+minutpsVividos);
		}while(JOptionPane.showConfirmDialog(null, "Deseja continuar") == 0);

	}

}

package Aula5Ex1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ManipulandoLocalDate {

	public static void main(String[] args) {
		
		LocalDate localDate      = LocalDate.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalTime localTime      = LocalTime.now();
		
		String strLocalDate2   = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String strLocalDateTime2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		String strLocalTime2   = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	}

}

package Aula5Ex1;

public class Carro {
	public static String placa = "ABD-1563";

	public static void main(String[] args) {
	   
	Carro carro1 = new Carro();
	Carro carro2 = new Carro();
	
	
	
	System.out.println("Carro.placa: " + Carro.placa);
	System.out.println("carro1.placa: " + carro1.placa);
	System.out.println("carro2.placa: " + carro2.placa);
	System.out.println("Alterando a placa do carro 1");
	carro1.placa = "DBX-4034";
	System.out.println("carro1.placa: " + carro1.placa);
	System.out.println("carro2.placa: " + carro2.placa);
	System.out.println("Carro.placa: " + Carro.placa);
	
	
	}
}

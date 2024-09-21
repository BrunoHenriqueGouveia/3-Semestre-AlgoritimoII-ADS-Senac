package Aula8Ex2;

public class TesteCastDown {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		
		// Cast up de Cliente para Pessoa
		Pessoa p = c;
		
		// Cast down de Pessoa para Cliente
		Cliente c2 = (Cliente) p;
		
		// Criacao de uma instancia da classe Pessoa
		Pessoa p2 = new Pessoa();
		
		// Cast down invalido de Pessoa para Cliente
		Cliente c3 = (Cliente) p2;

	}

}

package Aula8Ex2;

public class TesteCastUp {

	public static void main(String[] args) {

		// O objeto c foi declarado e instanciado como Cliente
		Cliente c = new Cliente();

		// Cast up explicito do objeto da classe Cliente para a classe Pessoa
		Pessoa p = (Pessoa) c;

		// Cast up do objeto da classe Cliente para a classe Pessoa
		Pessoa p2 = c;

		// Cast up do objeto da classe Cliente para Pessoa
		Pessoa p3 = new Cliente();

		// Cast up explicito do objeto da classe Cliente para a classe Object
		Object o = (Object) c;

		// Cast up do objeto da classe Cliente para a classe Object
		Object o2 = c;

	}

}

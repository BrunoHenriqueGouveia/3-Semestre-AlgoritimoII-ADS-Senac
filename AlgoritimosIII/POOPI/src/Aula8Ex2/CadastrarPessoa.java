package Aula8Ex2;

public class CadastrarPessoa {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		Funcionario f = new Funcionario();
		CadastrarPessoa t = new CadastrarPessoa();
		Pessoa p = new Pessoa();
		
		t.converter(c);
		t.converter(f);
		

	}

	public void converter(Pessoa p) {
		
		// verifica se o objeto p eh uma instancia da classe Cliente
		if (p instanceof Cliente) {
			Cliente cli = (Cliente) p;
			cli.imprimir();
		} else {
			Funcionario fun = (Funcionario) p;
			fun.imprimir();
		}
	}

}

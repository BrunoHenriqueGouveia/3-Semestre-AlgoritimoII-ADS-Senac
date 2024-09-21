package Aula2;

public class Pessoas {
	private String nome;
	private int idade;
	private int andar;
	
	public Pessoas() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void imprimir() {
		System.out.println("O total de passos é:"+getAndar()+" Nome:" + getNome()+" idade:"+getIdade());
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}
	
	public String nomeInvertido(String nome) {
		String nomeInvertido="";
		
		for (int i = nome.length()-1; i > -1 ; i--) {
			
			char letra = nome.charAt(i);
			nomeInvertido += letra;
			
		}
		return nomeInvertido;
	}
	
	

}

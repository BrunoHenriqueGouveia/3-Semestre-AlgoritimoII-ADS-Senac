package RevisaoProjetoObjeto;

public class VetorObjeto {

	// lista de atributos
	public Object[] elementos;
	public int tamanho;

	// metodo construtor
	public VetorObjeto(int capacidade) {

//this palavra-chave Java é usada para referenciar a instância atual do método
//no qual é usada. Aqui, isso se refere à variável de instância. ...
//Isso chama o construtor da mesma classe java que possui um parâmetro .
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	};

	public void adiciona(Object elemento) throws Exception {

		this.aumentaCapacidade();

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;

		} else {
			throw new Exception("o vetor ja esta cheio");
		}

	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");
		return s.toString();
	}

	public Object busca(int posicao) throws Exception {

		if (posicao >= 0 && posicao < tamanho) {
			return elementos[posicao];
		} else {
			throw new Exception("posição invalida");
		}

	}

	public int busca1(Object elemento) {

		for (int i = 0; i < tamanho; i++) {
			if (elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;

	}

	public boolean adicionaInicio(int posicao, Object elemento) throws Exception {
		this.aumentaCapacidade();
		if (posicao >= 0 && posicao < tamanho) {
			for (int i = this.tamanho - 1; i >= posicao; i--) {
				this.elementos[i + 1] = this.elementos[i];
			}
			this.elementos[posicao] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("posicao invalida");

		}

		return true;

	}

	public void aumentaCapacidade() {

		if (this.elementos.length == this.tamanho) {
			Object[] elementosNovos = new Object[this.elementos.length * 2];

			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}

			this.elementos = elementosNovos;
		}
	}

	public void remove (int posicao) throws Exception{
		
		if(posicao >=0 && posicao < this.tamanho) {
			
			for (int i = posicao; i < this.tamanho-1; i++) {
				this.elementos[i] = this.elementos[i+1];
			}
			this.tamanho--;
			
		}else{
			throw new Exception("posicao invalida");
			
		}
		
		
	}
	
}

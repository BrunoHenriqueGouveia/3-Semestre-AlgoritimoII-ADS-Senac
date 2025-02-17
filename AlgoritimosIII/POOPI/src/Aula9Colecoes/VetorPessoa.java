package Aula9Colecoes;

import java.util.Arrays;
import java.util.Iterator;

public class VetorPessoa {
	private String vetorPessoa[];
	private int tamanho;

	public VetorPessoa() {
		this.vetorPessoa = new String[2];
		this.tamanho = 0;
	}

	// Método para adicionar uma conta ao vetor
	public void adiciona(String elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.vetorPessoa.length) {
			this.vetorPessoa[this.tamanho] = elemento;
			this.tamanho++;
		}

	}

	// Aumenta a capacidade do vetor de contas se ele estiver cheio
	public void aumentaCapacidade() {

		if (this.vetorPessoa.length == this.tamanho) {
			String[] elementosNovos = new String[this.vetorPessoa.length * 2];

			for (int i = 0; i < this.vetorPessoa.length; i++) {
				elementosNovos[i] = this.vetorPessoa[i];
			}

			this.vetorPessoa = elementosNovos;
		}
	}

	// Método toString para representar o vetor como uma string
	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("->\n");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(i + 1);
			s.append(" " + this.vetorPessoa[i]);
			s.append("\n");
		}

		if (this.tamanho > 0) {
			s.append(this.tamanho);
			s.append(" " + this.vetorPessoa[this.tamanho - 1]);
		}

		s.append("\n<-");
		return s.toString();
	}

	public int buscaPosicao(String nome) {

		for (int i = 0; i < tamanho; i++) {
			if (vetorPessoa[i].equals(nome)) {
				return i;
			}
		}

		return -1;

	}

	public boolean remove(String nome) {

		for (int i = 0; i < tamanho; i++) {
			if (vetorPessoa[i].equals(nome)) {
				vetorPessoa[i] = vetorPessoa[i + 1];
				i++;
				while (i < tamanho) {
					vetorPessoa[i] = vetorPessoa[i + 1];
					i++;
				}
				tamanho--;
				return true;
			}
		}

		return false;
	}

}

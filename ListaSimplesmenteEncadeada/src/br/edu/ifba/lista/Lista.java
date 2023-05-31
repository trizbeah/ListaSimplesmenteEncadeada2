package br.edu.ifba.lista;

import br.edu.ifba.basicas.Celula;

public class Lista {

	private Celula primeiro;
	private Celula ultimo;

	private int totalElementos = 0;

	public void adicionarNoComeco(Object elemento) {

		Celula c = new Celula(this.primeiro, elemento);
		this.primeiro = c;

		if (this.totalElementos == 0) {
			this.ultimo = c;
		}

		this.totalElementos++;

	}

	public void listar() {

		Celula aux = this.primeiro;
		for (int cont = 0; cont < this.totalElementos - 1; cont++) {
			System.out.print(aux.getElemento() + " - ");
			aux = aux.getProxima();
		}

		System.out.println(aux.getElemento());
	}

	public void adicionaNoFinal(Object elemento) {

		if (this.totalElementos == 0) {
			this.adicionarNoComeco(elemento);
		} else {
			Celula c = new Celula(elemento);
			this.ultimo.setProxima(c);
			this.ultimo = c;
			this.totalElementos++;

		}
	}

	public void adicionarPorPosicao(int posicao, Object elemento) {

		Celula aux = this.primeiro;

		if (posicao > this.totalElementos || posicao < 0) {
			System.out.println("Posição fora dos limites!");

		}

		for (int cont = 0; cont < posicao - 1; cont++) {
			aux = aux.getProxima();

		}

		Celula c = new Celula(aux.getProxima(), elemento);
		aux.setProxima(c);
		this.totalElementos++;

	}

}

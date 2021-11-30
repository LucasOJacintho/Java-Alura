package br.com.bytebank.banco.modelo;

public class GuadadorDeReferencias {
	
	private Object[] referencias;
	private int posicaolivre;
	
	
	public GuadadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicaolivre = 0; // não é nescessario pois 0 é padrão.
		
	}
	
	public void adiciona(Object ref) {
		this.referencias[this.posicaolivre] = ref;
		this.posicaolivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaolivre;
	}

	public Object getPosicaoReferecia(int pos) {
		return this.referencias[pos];
	}
	

}

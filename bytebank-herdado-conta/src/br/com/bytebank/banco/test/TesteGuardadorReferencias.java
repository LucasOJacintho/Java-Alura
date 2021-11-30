package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuadadorDeReferencias;

public class TesteGuardadorReferencias {
	
	public static void main(String[] args) {
		
		GuadadorDeReferencias guardador = new GuadadorDeReferencias();
		
		
		Conta cc = new ContaCorrente(1223, 3455);
		guardador.adiciona(cc);
		
		
		Conta cc2 = new ContaCorrente(3345, 2345);
		guardador.adiciona(cc2);
		
		
		int tamanho = guardador.getQuantidadeDeElementos();
		
		System.out.println(tamanho);
		
		Conta ref =(Conta) guardador.getPosicaoReferecia(1);
		System.out.println(ref.getNumero());
	}

}

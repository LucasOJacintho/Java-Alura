package br.com.bytebank.banco.test;

import java.security.GuardedObject;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GaurdadorDeContas;

public class Teste {
	
	public static void main(String[] args) {
		
		GaurdadorDeContas guardador = new GaurdadorDeContas();
		
		Conta cc = new ContaCorrente(1223, 3455);
		guardador.adiciona(cc);
		
		
		Conta cc2 = new ContaCorrente(3345, 2345);
		guardador.adiciona(cc2);
		
		
		int tamanho = guardador.getQuantidadeDeElementos();
		
		System.out.println(tamanho);
		
		Conta ref = guardador.getPosicaoReferecia(1);
		System.out.println(ref.getNumero());
	}

}

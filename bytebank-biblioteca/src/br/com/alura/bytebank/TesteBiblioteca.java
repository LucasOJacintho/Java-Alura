package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(1234, 34567);
		
		conta.deposita(200.00);
		
		System.out.println(conta.getSaldo());
		

	}

}

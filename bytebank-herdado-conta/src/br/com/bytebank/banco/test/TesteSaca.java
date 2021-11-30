package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;
import br.com.bytebank.banco.modelo.Conta;

public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 2345);
		conta.deposita(200.0);
		
		try {
			conta.saca(210.0);
		} catch (Exception ex) {
			System.out.println("Saldo insuficiente " + ex.getMessage());
		}
		System.out.println(conta.getSaldo());
	}

}

package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

//import br.com.bytebank.banco.modelo.*;

//modelo." " é FQN Full Qualified Name
public class TesteContas {
	public static void main(String[] args)  throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(111, 112);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);

		System.out.println("Conta-corrente: " + cc.getSaldo());
		System.out.println("Conta-poupamça: " + cp.getSaldo());

	}
}

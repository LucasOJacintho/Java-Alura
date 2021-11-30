package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {
	public static void main(String[] args) {

//		System.out.println("X");
//		System.out.println(3);
//		System.out.println(false);

		ContaCorrente cc = new ContaCorrente(234, 23456);
		ContaPoupanca cp = new ContaPoupanca(3452, 98765);

		println(cc);

		System.out.println(cc);
		System.out.println(cp);
	}

	static void println() {}

	static void println(int a) {}

	static void println(boolean valor) {}

	static void println(Object referencia) {}
}

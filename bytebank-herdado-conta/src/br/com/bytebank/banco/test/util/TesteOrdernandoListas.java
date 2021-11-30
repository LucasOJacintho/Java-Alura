package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdernandoListas {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 31);
		cc1.deposita(333.00);

		Conta cc2 = new ContaPoupanca(22, 43);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 24);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 15);
		cc4.deposita(222.00);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		System.out.println("----------------------------------------");

		for (Conta conta : lista) {
			System.out.println(conta);
		}
		NumeeroDaContaComparator comparator = new NumeeroDaContaComparator();

		lista.sort(comparator);

		System.out.println("----------------------------------------");

		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}

// calsse que implementa a inteface que compara e ordena os elementos
// através do método baseado no numero da conta. 

class NumeeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		if (c1.getNumero() < c2.getNumero()) {
			return -1;
		}
		if (c1.getNumero() > c2.getNumero()) {
			return 1;
		}
		return 0;
	}

}
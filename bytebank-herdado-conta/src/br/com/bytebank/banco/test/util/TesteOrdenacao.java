package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 31);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.00);

		Conta cc2 = new ContaPoupanca(22, 43);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Lucas");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 24);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Noemi");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 15);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Maria");
		cc4.setTitular(clienteCC4);
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
		//NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		//TitularDaContaComparator titularComparator = new TitularDaContaComparator();

		// passa a referencia o contrutor dentro do metoto sort.
		lista.sort(new TitularDaContaComparator());
		
		//Collections.sort(lista, new NumeroDaContaComparator());
		Collections.sort(lista); // pra esse é necessario ter o comparable na classe mae Conta
		//Collections.reverse(lista);
		
		System.out.println("----------------------------------------");

		for (Conta conta : lista) {
			System.out.println(conta + ", Nome do titular: " +  conta.getTitular().getNome());
		}
	}
}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		// primeiro ele pega os dados o nome
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();

		// compara as strings e devolve um int
		return nomeC1.compareTo(nomeC2);
	}
}



class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		// apartir do wrapper do int ele faz tambem 
		return Integer.compare(c1.getNumero(), c2.getNumero()); 
		
//		// Isso é a mesma cois que o if irá fazer mas de maneira simplicifacada 
//		return c1.getNumero() - c2.getNumero();
		
//		
//		if (c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		if (c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		return 0;
	}

}

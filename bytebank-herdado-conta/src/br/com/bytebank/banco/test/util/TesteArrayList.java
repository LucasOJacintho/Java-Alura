package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		/*
		 * ArrayList<Conta> lista = new ArrayList<Conta>(); quando usando Arraylist sem
		 * <> generics ele criar Warnins no codigo (em amalero) eles servem para tipar
		 * (especificar) o que vai dentro da sua lsita exemplo
		 * 
		 * havera na array só tipo Conta e não aseitará Cliente.
		 */
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(24, 34);
		lista.add(cc1); // adicionando na lista de array

		Conta cc2 = new ContaCorrente(23, 33);
		lista.add(cc2);

		System.out.println(lista.size()); // quantidade de referencias guardadas

		/// Object ref = lista.get(0); forma generica

		Conta ref = (Conta) lista.get(0); // ele pega o indice ( a posição) | especifico

		System.out.println(ref.getNumero());

		lista.remove(0); // remove da lista na posição que quer

		System.out.println("Tamanho " + lista.size());

		Conta cc3 = new ContaCorrente(25, 35);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(26, 36);
		lista.add(cc4);

		// para cada item (posição) imprimir uma lista com todoas as contas
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println("---------------------------------------------");

		// Foreach , forma mais facil de fazer for para iterar a ArrayList

		for (Object oRef : lista) {
			System.out.println(oRef);
		}

		System.out.println("---------------------------------------------");

		// agora que está especificado o tipo pode se usar a referecia tipo Conta

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}

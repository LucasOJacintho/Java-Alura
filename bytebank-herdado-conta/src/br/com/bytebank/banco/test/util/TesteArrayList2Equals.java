package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList2Equals {

	public static void main(String[] args) {
		
		/* 
		 * ArrayList<Conta> lista = new ArrayList<Conta>();
		 * quando usando Arraylist sem <> generics ele criar Warnins no codigo (em amalero) 
		 * eles servem para tipar (especificar) o que vai dentro da sua lsita exemplo 

		 * havera na array só tipo Conta e não aseitará Cliente.
		 */
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
//		Conta cc1 = new ContaCorrente(24, 34);
//		Conta cc2 = new ContaCorrente(24, 34);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1); // adicionando na lista de array
		
		Conta cc2 = new ContaCorrente(23, 33);
		lista.add(cc2);
		
		
		Conta cc3 = new ContaCorrente(23, 11);
		//lista.add(cc3);
		// O contains verifica se a referencia (nome dado) já existe  
		
		boolean existe = lista.contains(cc3);
		
		System.out.println("a conta já existe? " + existe);
		
		
		System.out.println("---------------------------------------------");
		
		
		// agora que está especificado o tipo pode se usar a referecia tipo Conta
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}

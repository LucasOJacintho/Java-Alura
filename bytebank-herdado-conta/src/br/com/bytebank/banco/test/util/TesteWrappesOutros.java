package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappesOutros {
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); // AUTOBOXING 
		System.out.println(idadeRef.intValue()); // UNBOXING
		
		
		Double RefDouble = Double.valueOf(2.3);// AUTOBOXING 
		System.out.println(RefDouble.doubleValue());// UNBOXING 
		
		Boolean BoolRef = Boolean.FALSE;
		System.out.println(BoolRef.booleanValue());
		
		
		Number reFNumero = Double.valueOf(3.9); // o numbem é a classe mae de integer, double, float etc.
		
		
		// A lista feita em Numbere aceta todos os tipos de numero na mesma lista.
		List<Number> lista = new  ArrayList<>(); 
		lista.add(10);
		lista.add(32.6);
		lista.add(25.4f);
		
	}

}

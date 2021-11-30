package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappersInteger {

	public static void main(String[] args) {
		
		int []idades = new int[5]; // primitivos
		String[] nomes = new String[5]; // referencias
		
		int idade = 29;// ele entende que não é um primitivo e que é um integer
		
		// AUTOBOXING E UNBOXING NA RAÇA
		Integer idadeRef = Integer.valueOf(29); // me dá o valor desse primitivo, criando o objeto apartir do primitivo, AUTOBOXING 
		int valor = idadeRef.intValue(); // aqui você tem o objeto e está pedindo o primitivo , UNBOXING
		
		String s = args[0]; //"10"
		
		///Integer numero = Integer.valueOf(s); | Isso é um objeto referencia
		int numero = Integer.parseInt(s); // aqui tem um método que pega a String e passa para primitivo
		System.out.println(numero);
		
//		Integer idadeRef = new Integer(29);  //é o que ele faz como o tipo primitivo um wrapper
		
		
		List numeros = new ArrayList<>(); 
		numeros.add(29); // autoboxing mesma coisa que a linha 16.
		

	}

}

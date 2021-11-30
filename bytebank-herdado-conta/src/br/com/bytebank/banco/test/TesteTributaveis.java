package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 2345);
		cc.deposita(100.0);
		
		SeguroVida sg = new SeguroVida();
		
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.regristra(cc);
		calc.regristra(sg);
		
		System.out.println(calc.getTotalImposto());
		

	}

}

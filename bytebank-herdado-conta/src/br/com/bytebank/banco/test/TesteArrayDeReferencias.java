package br.com.bytebank.banco.test;


import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Cliente;

public class TesteArrayDeReferencias {

	public static void main(String[] args) {

	    //Conta[] contas = new Conta[5]; // inicializando a array

		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(3345, 3435); // inicializando o obejto conta corrente
		referencias[0] = cc1; // colocando o obejto conta cc1 dentro da array

		ContaPoupanca cc2 = new ContaPoupanca(3456, 7889);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
	
//		Conta referenciaGenerica = contas[1];
//		 
//		System.out.println(referenciaGenerica.getNumero());
		
		//System.out.println(contas[1].getNumero());
		
		//System.out.println(referencias[0].getNumero());

		//Conta ref = contas[1]; assim é da forma generica 
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; // type cast forma masi especifica de apontar
		System.out.println(ref.getNumero()); 
		System.out.println(cc2.getNumero());
	}

}

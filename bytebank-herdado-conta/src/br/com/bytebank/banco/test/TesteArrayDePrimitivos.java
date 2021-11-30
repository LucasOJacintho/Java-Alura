package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {

		// estrutura de dados primitva ARRAY[], necessario colocar o tamanho da array
		// para inicializar

		int[] idades = new int[5];
		int[] pesos = new int[5];

		idades[0] = 35;
		idades[1] = 12;
		idades[2] = 32;
		idades[3] = 45;
		idades[4] = 67;

		// para acesar a posisção
		int idade1 = idades[0];

		System.out.println(idade1);
		
		//tamanho da Array[]
		
		System.out.println(idades.length);

//		// forma nada eficiente para guardar dados
//		int idade1 = 12;
//		int idade2 = 32;
//		int idade3 = 45;
//		int idade4 = 67;
//		int idade5 = 35;
//		
		// testando o array dentro do for
		
		for(int j= 0 ; j < pesos.length ; j++) {
			pesos[j] = j * j;
			System.out.println(pesos[j]);
		}
	}

}

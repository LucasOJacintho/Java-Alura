package br.com.bytebank.banco.test;

public class TesteString {
	public static void main(String[] args) {
		
		String vazio = "  Alura  ";
		String outrovazio = vazio.trim(); //retira os espaços
		
		
		System.out.println(vazio.isEmpty()); // analisa se a sitring está vazia ou não.
		System.out.println(vazio);
		System.out.println(vazio.contains("Alu"));// verifica se tem o que busca , mas tem que ser igual respeutando leras maiusculas 
		System.out.println(outrovazio);
		
		//Crinado um objeto de forma literal
		String nome = "Alura";
		
		//String outra = nome.replace('A', 'a');//tipo char , usa aspas simples, troca a primeira que aponta pela segunda 
		
		
		// uma String não pode ser alterada ela nasceu assim e ficara assim , é imutável, para altera a String precisa criar outra String e alterar
		
		// é a mesma coisa que: String sobrenome = new String("Alura");
		
		//nome.toLowerCase(); //não altera
		// para olterar necssario criar nova string
		
		//String nomeia = nome.toUpperCase();
		
		//System.out.println(nome);
		
		//System.out.println(nomeia);
		
		//char c = nome.charAt(2); //mostra o que está na posição
		//System.out.println(c);
		
		//int pos = nome.indexOf("ur");// devolve a prineira posição 
		//System.out.println(pos);
		
//		String sub = nome.substring(1, 4); // a substring voce diz por onde quer comceçar ou terminar, mostra
//		System.out.println(sub);
		
		System.out.println(nome.length());
		
		for(int i = 0; i < 5 ; i++) {
			System.out.println(nome.charAt(i));//Com o nome.chart imprime a letra e não o numero da posisção
		}
		
	}

}

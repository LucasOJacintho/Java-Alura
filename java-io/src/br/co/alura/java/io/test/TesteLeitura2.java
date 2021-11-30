package br.co.alura.java.io.test;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		while(scanner.hasNext()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US); // mesmo que o sistema operacional esteja configurado em PT vai converter em US
			
			linhaScanner.useDelimiter(";"); // delimitador retirado
			
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();
			
			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
			linhaScanner.close();
			
//			String[]  valores = linha.split(";");// retira o ponto e vrigula
//			System.out.println(valores[1]);
			//System.out.println(Arrays.toString(valores));
			 
		}
		scanner.close();
	}

}

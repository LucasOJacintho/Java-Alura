package br.co.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriterTimeMillis {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de saída com arquivo, ele cria um arquivo novo
		long ini = System.currentTimeMillis();
		
//		OutputStream fos = new FileOutputStream("Loren2.txt");
//		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(new FileWriter("Loren6.txt"));

		bw.write("The standard Lorem Ipsum passage, used since the 1500s");
		bw.newLine(); // coloca o curoos na linha abaixo
		bw.write("Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. mas pasarram");

		bw.close(); // fecha a instrução aberta
		
		long fim = System.currentTimeMillis(); // mostra o tempo de execução
		
		System.out.println("Passaram "+ (fim - ini) + " milisegundos");
	}

}

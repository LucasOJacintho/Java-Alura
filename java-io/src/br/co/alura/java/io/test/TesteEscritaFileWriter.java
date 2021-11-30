package br.co.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de saída com arquivo, ele cria um arquivo novo
		
//		OutputStream fos = new FileOutputStream("Loren2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		FileWriter fw = new FileWriter("loren4.txt"); // saída de um arquivo
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("loren4.txt"));// enxugnado mais ainda o código
		bw.write("The standard Lorem Ipsum passage, used since the 1500s");
		bw.newLine();
		//bw.write(System.lineSeparator());// faz a mesma coisa que "\r\n" se adequa ao sistema operacional
		//bw.write("\r\n"); // coloca o curoos na linha abaixo
		bw.write("Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");

		
		bw.close(); // fecha a instrução aberta
	}

}

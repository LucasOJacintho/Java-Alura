package br.co.alura.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscritaESaida {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de entra e saida de um arquivo, ele cria um arquivo novo
		
		InputStream fis = new FileInputStream("loren.txt"); // lê o arquivo
		Reader isr = new InputStreamReader(fis); // tranforma os bytes do aruivo (binarios) em caracter
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = new FileOutputStream("Loren2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();
		
		while(linha != null) {
			bw.write(linha);
			bw.newLine(); // coloca o curoos na linha abaixo
			linha = br.readLine();
		}
		
		br.close();
		bw.close(); // fecha a instrução aberta
	}

}

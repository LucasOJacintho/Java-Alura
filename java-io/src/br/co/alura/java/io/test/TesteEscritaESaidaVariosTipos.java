package br.co.alura.java.io.test;

/***
 * Fluxo de entra e saida de um arquivo, ele cria um arquivo novo
 * 
 * 		entrda de rede; 	teclado		Arquivo
 *  s.getInputStream(); //System.in;//new FileInputStream("loren.txt");
 *  
 *  	saída de rede		console			Arquivo
 *  s.getOutputStream(); //System.out;//new FileOutputStream("Loren3.txt");
 *  
 */

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
import java.net.Socket;



public class TesteEscritaESaidaVariosTipos {

	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket(); // etnrdda pela rede
		
		InputStream fis = s.getInputStream(); //System.in;//new FileInputStream("loren.txt");
		Reader isr = new InputStreamReader(fis); // tranforma os bytes do aruivo (binarios) em caracter
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = s.getOutputStream(); //System.out;//new FileOutputStream("Loren3.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine(); // coloca o curoos na linha abaixo
			bw.flush(); // já escreve logo em seguida
			linha = br.readLine();
		}
		
		br.close();
		bw.close(); // fecha a instrução aberta
	}

}

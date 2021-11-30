package br.co.alura.java.io.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de entrada com arquivo
		
		InputStream fis = new FileInputStream("loren.txt"); // lê o arquivo
		Reader isr = new InputStreamReader(fis); // tranforma os bytes do aruivo (binarios) em caracter
		BufferedReader br = new BufferedReader(isr); // guarda todos os caracteres de uma linha
		
		String linha = br.readLine(); //vai ler uma linha inteira
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		

		br.close(); // fecha a instrução aberta
	}

}


public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando escopo das variaveis");
		
	
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado; // … uma variavel local. È la sÛ funciona quando est· dentro das chaves.
		
		 if (quantidadePessoas >= 2) {
             acompanhado = true;
         }else {
             acompanhado = false;
         }

		if (idade >= 18 && acompanhado) {
			System.out.println("Bem vindo");
		} else {
			System.out.println("Infelizmente voc  n„o pode entrar");
		}
	}

}

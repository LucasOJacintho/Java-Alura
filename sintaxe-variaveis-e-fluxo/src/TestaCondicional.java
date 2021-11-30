
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		
		if(idade >= 18) {
			System.out.println("Você tem mais de 18 anos.");
			System.out.println("Bem vindo");
			// quando a somente uma instrução dentro do if
			// pode ser retirados as chaves do if 
		}
		else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 anos, "
						+ "mas está acompanhado então pode entrar");
			}
			else {
			System.out.println("Infelizmente vocÊ não pode entrar");
			}
		}
	}
}

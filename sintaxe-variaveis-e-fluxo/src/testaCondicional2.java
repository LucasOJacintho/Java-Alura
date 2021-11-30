
public class testaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2; // valores booleanos podem ser testados

		if (idade >= 18 && acompanhado) {
			System.out.println("Bem vindo");
		} else {
			System.out.println("Infelizmente voc  n„o pode entrar");
		}
	}
}

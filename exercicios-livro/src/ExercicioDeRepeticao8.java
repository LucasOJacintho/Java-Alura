
public class ExercicioDeRepeticao8 {
	public static void main(String[] args) {
		int numero = 15;
		for (int linha = 1; linha <= numero; linha++) {
			for (int coluna = 1; coluna <= linha; coluna++) {
				System.out.print(linha * coluna + " ");
			}
			System.out.println();
		}
	}

}

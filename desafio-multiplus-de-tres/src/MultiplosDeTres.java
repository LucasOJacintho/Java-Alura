
public class MultiplosDeTres {
	public static void main(String[] args) {
		for (int numero = 1; numero < 100; numero++) {
			if (numero % 3 == 0) {
				System.out.println(numero);
			}
		}
		// outra maneira direto no for

		for (int i = 3; i < 100; i += 3) {
			System.out.println(i);
		}
	}

}


public class ExercicioDeRepeticao6 {
	public static void main(String[] args) {
		int anterior = 0;
		int atual = 1;

		while (atual < 100) {
			System.out.println(atual);
			int fibonacci = anterior + atual;
			anterior = atual;
			atual = fibonacci;
		}
		System.out.println(atual);
	}
}

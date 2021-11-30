/*
 * IMPRIMA OS FATORIAS DE 1 A 10
 * */

public class ExercicioDeRepeticao4 {
	public static void main(String[] args) {
		int fatorial = 1;
		for (int n = 1; n <= 10; n++) {
			fatorial *= n;
			System.out.println(fatorial);
		}
		System.out.println(fatorial);
	}

}

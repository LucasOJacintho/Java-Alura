/*
 * IMPRIMA OS FATORIAS DE 1 A 20, 30 ,40.
 * */

public class ExercicioDeRepeticao5 {
	public static void main(String[] args) {
		long fatorial = 1;
		for (long n = 1; n <= 30; n++) {
			fatorial *= n;
			System.out.println(fatorial);
		}
	}

}
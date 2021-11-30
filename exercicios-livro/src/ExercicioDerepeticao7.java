
public class ExercicioDerepeticao7 {
	public static void main(String[] args) {
		int x = 29;
		while (x > 1) {
			if (x % 2 == 0) {
				x = x / 2;
				System.out.print(x + " -> ");
			} else {
				x = 3 * x + 1;
				System.out.print(x + " -> ");
			}
		}

	}

}

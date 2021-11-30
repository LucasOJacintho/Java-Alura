

public class teste {

	public static void main(String[] args) {

		int x = 3;
		int y = 3;
		int z = 0;
		int w = 0;

		// System.out.print(x);

		while (z < y) {
			System.out.print(x);
			while (w < z) {
				System.out.print(" + " + x);
				w++;
			}
			System.out.println();
			z++;
			w = 0;
		}
	}
}

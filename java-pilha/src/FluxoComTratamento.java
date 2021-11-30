
public class FluxoComTratamento {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Inicio do método 1");
		metodo2();
		System.out.println("fim do metodo 1");
	}

	private static void metodo2() {
		System.out.println("Inicio do metodo 2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				int a = i / 0;
			} catch (ArithmeticException ex){
				System.out.println("ArithmeticException");
			}
		}
		System.out.println("Fim do metodo 2");
	}
}


public class DesafioFibonacciRecursao {
	public static void main(String[] args) {

		Fibonacci2 fibonnaci = new Fibonacci2();
		for (int i = 0; i <= 6; i++) {
			int resultado = fibonnaci.calculaFibonacci(i);
			System.out.println(resultado);
		}
	}

}

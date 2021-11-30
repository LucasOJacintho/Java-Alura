
public class DesafioFibonacci {
	public static void main(String[] args) {
		int anterior = 0;
		int atual = 1;
		while(atual < 100) {
			System.out.println(atual);
			atual += anterior;
			anterior = atual - anterior;
		}
		System.out.println(atual);
	}

}


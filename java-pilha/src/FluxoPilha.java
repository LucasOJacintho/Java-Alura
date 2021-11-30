import javax.sound.midi.MidiUnavailableException;

public class FluxoPilha {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}

		System.out.println("Fim do main");
	}

	//Quando a excessao vem direto da classe Exception é necessario throws MinhaExcessaoChecked , pois esta excesção é verificada
	private static void metodo1() throws MinhaExcessaoChecked {
		System.out.println("Inicio do método 1");
		metodo2();
		System.out.println("fim do metodo 1");
	}

	private static void metodo2() throws MinhaExcessaoChecked {
		System.out.println("Inicio do metodo 2");
		throw new MinhaExcessaoChecked("Algo deu errado");

	}

}

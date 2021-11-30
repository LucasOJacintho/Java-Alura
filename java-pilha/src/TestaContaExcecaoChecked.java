
public class TestaContaExcecaoChecked {

	public static void main(String[] args) {

		Conta conta = new Conta();

		try {
			conta.deposita();
		} catch (MinhaExcessaoChecked ex) {
			System.out.println("Tratamento....");
		}

	}

}

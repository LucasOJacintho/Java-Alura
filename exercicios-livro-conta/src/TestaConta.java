
public class TestaConta {
	public static void main(String[] args) {

		ContaUm conta1 = new ContaUm();
		conta1.setTitular("Noemi");
		conta1.setAgencia(1234);
		conta1.setNumero(3456);
		conta1.setSaldo(200.0);
		
//		conta1.numero = 8143;
//		conta1.agencia = 234;
//		conta1.saldo = 500;
//		conta1.deposita(200.0);
		//Data data = new Data();
//		conta1.dataAbertura = data;
		
		conta1.setDataAbertura(new Data());
		conta1.getDataAbertura().preenchidaData(31, 02, 2021);

		System.out.println("O saldo atual é " + conta1.getSaldo());
		System.out.println("A sua conta renddeu " + conta1.calculaRendimento());

		System.out.println(conta1.recuperaParaImpressao());
		

		ContaUm conta2 = new ContaUm();
		//conta2.titular = "Noemi";
		//conta2.saldo = 700;
		
		conta1 = conta2;

		if (conta1 == conta2) {
			System.out.println("A contas são iguais");
		} else {
			System.out.println("As constas são difierentes");
		}

	}

}

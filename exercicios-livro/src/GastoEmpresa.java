
public class GastoEmpresa {
	public static void main(String[] args) {

		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		int totalTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
		int mediaTrimestre = totalTrimestre / 3;

		System.out.println("O total de gasto no trimestre é de R$ " + totalTrimestre);
		System.out.println("A média de gastos do trimestre é de R$ " + mediaTrimestre);

	}

}

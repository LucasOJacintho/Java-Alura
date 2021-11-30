
public class TestaConversao {
	public static void main(String[] args) {
		double salario  = 1270.50;
		
		float pontoFlutuante = 3.14f;
		
		int valor = (int) salario;
		// (int) chamado de casting
		// (int)ele força caber dentro de um inteiro algo que seja double
		System.out.println(valor);
		
		long numeroGrande = 343535564345l;
		short valorPequeno = 2131;
		byte baite = 127;
		
	}

}


public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);

		System.out.println(" e sua agencia é " + conta.getAgencia());

		/*
		 * Aqui a conta está incosistente com a regra de negócio usando do construtor
		 * padrão
		 * 
		 * Conta conta = new Conta(); conta.setAgencia(-50); conta.setNumero(-330);
		 */

		conta.setAgencia(1234);
		System.out.println(conta.getAgencia());

		Conta conta2 = new Conta(1337, 24227);
		Conta conta3 = new Conta(1337, 24228);

		System.out.println(Conta.getTotal());
	}

}
// o settter e getter é para a mudança
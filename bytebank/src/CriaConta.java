
public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta seguntaConta = new Conta();
		seguntaConta.saldo = 50;

		System.out.println("A primeira conta tem " + primeiraConta.saldo);
		System.out.println("A segunda conta tem " + seguntaConta.saldo);

		// Os valores vem zerados pois é o valor padrão a não ser que você coloque um
		// valor default
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);

	}

}

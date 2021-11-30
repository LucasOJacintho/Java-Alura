
public class TestaClienteSemConta {

	public static void main(String[] args) {

		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());

		// ele faz referencia a um novo cliente
		contaDaMarcela.titular = new Cliente();

		// ele irá printar a posição dos dados do novo ciente
		System.out.println(contaDaMarcela.titular);

		contaDaMarcela.titular.nome = "MArcela da Silva";
		System.out.println(contaDaMarcela.titular.nome);
	}

}

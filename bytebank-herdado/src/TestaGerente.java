
public class TestaGerente {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();

		gerente.setNome("Marcelo");
		gerente.setCpf("23423456730");
		gerente.setSalario(5000.0);

		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());

		gerente.setSenha(3453);
		boolean autenticou = gerente.autentica(3453);

		System.out.println(autenticou);

		System.out.println(gerente.getBonificacao());

	}

}


public class TestaBanco {

	public static void main(String[] args) {
		Cliente noemi = new Cliente();
		noemi.nome = "Noemi Oliveira Jacintho";
		noemi.cpf = "432.345.657-50";
		noemi.profissao = "desenvolvedora";

		Conta contaDaNoemi = new Conta();
		contaDaNoemi.deposita(150);
		
		contaDaNoemi.titular = noemi;
		System.out.println(contaDaNoemi.titular.nome);
		System.out.println(contaDaNoemi.titular);

	}

}

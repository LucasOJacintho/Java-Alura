
public class TesteReferencias {
	public static void main(String[] args) {

		Funcionario gerente = new Gerente();
		gerente.setNome("Marcos");
		gerente.setSalario(5000.0);

		Funcionario ev = new EditorVideo();
		ev.setNome("Maria");
		ev.setSalario(2500.0);

		// registrou variso tipos de funcionario no mesmo método.
		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(gerente);
		controle.registro(ev);

		System.out.println(controle.getSoma());

	}

}

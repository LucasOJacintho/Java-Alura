
public class TesteTipos {
	public static void main(String[] args) {
		FuncionarioTipos funcionario1 = new FuncionarioTipos();
		funcionario1.setSalario(3000.00);

		System.out.println(funcionario1.getTipo());
		System.out.println(funcionario1.getBonificacao());

		FuncionarioTipos funcionario2 = new FuncionarioTipos();
		funcionario2.setTipo(2);
		funcionario2.setSalario(5000.00);
		System.out.println(funcionario2.getTipo());
		System.out.println(funcionario2.getBonificacao());

	}

}
 
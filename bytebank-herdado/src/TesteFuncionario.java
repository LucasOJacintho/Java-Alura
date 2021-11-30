
public class TesteFuncionario {
	public static void main(String[] args) {

		Funcionario noemi = new EditorVideo();
		noemi.setNome("Noemi Oliveira Jacintho");
		noemi.setCpf("472345678-04");
		noemi.setSalario(2000.00);

		System.out.println(noemi.getNome());
		System.out.println("A sua bonificação é de " + noemi.getBonificacao() + " reais.");
		
		//noemi.salario = 400;

	}

}

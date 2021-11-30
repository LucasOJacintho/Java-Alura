
/* O protected é o publico somente para as classes filhos da classe mae 
 * protected double salario; o protected é muito pouco usado no dia a dia
 * o idela é usar os métodos para puxar os atribtos.
 * 
 * com o abstract não pode ser instanciado, mas os métodos são aproveitados 
 * */

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

//Método abstrato...não tem um corpo , não há implementação.
	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}

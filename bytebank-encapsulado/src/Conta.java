
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	// O static diz que o total( atributo) e da  conta( classe ) referece somente a classe
	private static int total;

	// Construtor
	// public Conta( ) {
	// construtor padrão
	// }

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("o total de conta é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;

		System.out.println("Estou criando uma conta " + this.numero);
	}

	// void não devolve nada

	public void deposita(double valor) {
		this.saldo += valor;

	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	// O this diz que será essa conta invocada que será feito.

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} // o else nesse caso é opcional pois o return já para a instrução
		return false;
	}

	// Retorna o saldo pelo metodo, pois o esmo é privado
	public double getSaldo() {
		return this.saldo;

	}

	// Voce mostra uma informação
	public int getNumero() {
		return this.numero;
	}

	// Você atribui uma informação., numero do lado esquerdo se refere a uma
	// variavel temporaria ela pode ter o mesmo nome do atributo

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("O numero não pode ser menor ou igual a 0. ");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode ser menor ou igual a 0. ");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
}

public class Conta {

	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

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
}
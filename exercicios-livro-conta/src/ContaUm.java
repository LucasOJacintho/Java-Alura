
public class ContaUm {

	private String titular;
	private double saldo;
	private int agencia;
	private int numero;
	private Data dataAbertura;
	private int identificador;
	private static int proximoID;

//	public Conta(int agencia, int numero) {
//		this.agencia = agencia;
//		this.numero = numero;
//
//	}
	public ContaUm(String titular) {
		this.titular = titular;
		this.identificador = proximoID++;
	}

	// void não devolve nada

	public ContaUm() {
		// TODO Auto-generated constructor stub
	}

	
	public int getIdentificador() {
		return this.identificador;
	}
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String recuperaParaImpressao() {

		String dados = "Titular " + this.titular;
		dados += "\nAgencia " + this.agencia;
		dados += "\nNúmero " + this.numero;
		dados += "\nData de Abertura de conta " + this.dataAbertura.dataFormatada();
//		dados += "\nDia " + this.dataAbertura.dia;
//		dados += "\nMês " + this.dataAbertura.mes;
//		dados += "\nAno " + this.dataAbertura.ano;
		dados += "\nSaldo R$ " + this.saldo;
		return dados;

		// System.out.println("O titular da conta é "+ titular + " sua agencia é "+
		// agencia +
		// " e o numero " + numero + ", a conta foi aberta em " + dataAbertura + " e
		// você possui " + saldo + " de saldo.");
	}

}
package br.com.bytebank.banco.modelo;

public class CalculadorImposto {

	private double TotalImposto;

	public void regristra(Tributavel t) {
		double valor = t.getvalorImposto();
		this.TotalImposto += valor;
	}

	public double getTotalImposto() {
		return TotalImposto;
	}

}

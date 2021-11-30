/* Polimorfismo udar um método generico que pode puxar o especifico e depois o padrão
 * 
 * */
public class ControleBonificacao {
	private double soma;
	
	public void  registro(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma = this.soma + bonificacao;
	}
		
	public double getSoma() {
		return soma;
	}

}
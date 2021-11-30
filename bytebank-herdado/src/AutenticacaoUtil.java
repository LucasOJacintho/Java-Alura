/*
 * Este é uma composição que é feita a partir da reutilização de códigos, onde a lógica fica em um lugar só.
 * */
public class AutenticacaoUtil {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}

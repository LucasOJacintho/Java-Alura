/*
 * Exceção do tipo unchecked , não precisa ser verificada, pois passa peolo runtime
 * */
public class MinhaExcecao extends RuntimeException {

	public MinhaExcecao(String msg) {
		super(msg);
	}

}


public class TestaConexao {

	public static void main(String[] args) {

		try (Conexao conect = new Conexao()) {
			conect.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexão ");
		}

		// ----------------

//		Conexao conecta = null;
//		try {
//			conecta = new Conexao();
//			conecta.leDados();
//			conecta.fecha();
//		}catch(IllegalStateException ex) {
//			System.out.println("Houve erro na conexão");
//		}finally {
//			conecta.fecha();
//		}

	}

}

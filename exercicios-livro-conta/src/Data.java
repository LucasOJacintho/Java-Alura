
public class Data {
	int dia;
	int mes;
	int ano;

	//public Data(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	//}

	public void preenchidaData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String dataFormatada() {
		if(this.dia >= 30 && this.mes == 2 && this.ano == 2021 ) {
			return "data inexistente";
		}else {
			return this.dia + "/" + this.mes + "/" + this.ano;
		}
		
	}
}
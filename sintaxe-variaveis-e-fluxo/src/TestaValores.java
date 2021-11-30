
public class TestaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		
		segundo = primeiro;
		primeiro = 10; // essa valor não será atribuido ao segundo 
		System.out.println(segundo);		
		
	}

}

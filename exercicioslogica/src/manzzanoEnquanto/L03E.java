package manzzanoEnquanto;

public class L03E {

	public static void main(String[] args){ 
		
		int contadora, expoente; 
		
		System.out.println("Verifique o resultado da potência de 3 usando o inspesionar.");
		contadora = 1;
		expoente = 0;
		
		while (contadora < 17) {
			
			System.out.println("3 ^ "+expoente+" = "+Math.pow(3, expoente));
		    contadora++;
		    expoente++;
		}
	}
	
}

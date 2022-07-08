package manzzanoEnquanto;

public class L03G {

	public static void main(String[] args) {
		int contadora = 0;
		int acumuladora = 1;
		
		while (contadora < 15) {
		  acumuladora = contadora - 1;
		 int soma = acumuladora + contadora;
		  System.out.println(acumuladora+" + "+contadora+" = "+soma);
		  contadora++;
		}
		
	}

}

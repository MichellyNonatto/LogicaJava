package manzzanoEnquanto;

public class L03C {

	public static void main(String[] args){
		System.out.println("Soma dos 500 primeiros números pares.");
		
		int cont = 1;
		int acum = 0;
		
		while(cont <= 500) {
			if(cont%2 == 0) {
				acum = cont + acum;
			}
			cont++;
		}
		
		System.out.println(acum);
	}
	
}

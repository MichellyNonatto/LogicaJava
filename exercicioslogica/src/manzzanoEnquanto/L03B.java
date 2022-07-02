package manzzanoEnquanto;

public class L03B {

	public static void main(String[] args) {
		System.out.println("Soma dos 100 primeiros números.");
		
		int cont = 1;
		int acum = 0;
		
		while(cont <= 100) {
			acum = cont + acum;
			cont++;
		}
		
		System.out.println(acum);
		
		}
}

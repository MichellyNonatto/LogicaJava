package manzzanoEnquanto;

import java.util.Scanner;

public class L03A {

	public static void main(String[] args) {
		System.out.println("Tabuada");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número : ");
		int number = sc.nextInt();
		int cont = 0;
		
		while(cont <= 10) {
			System.out.println(number+" x "+cont+" = "+(number*cont));
			cont++;
		}
		
		sc.close();
	}
	
}

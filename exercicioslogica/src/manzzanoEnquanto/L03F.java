package manzzanoEnquanto;

import java.util.Scanner;

public class L03F {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua base: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite o valor do expoente: ");
		int valor2 = sc.nextInt();
		
		System.out.println("O valor da exponenciação é de : "+Math.pow(valor1, valor2));
		
		sc.close();
	}
}

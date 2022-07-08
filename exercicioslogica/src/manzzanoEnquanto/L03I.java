package manzzanoEnquanto;

import java.util.Scanner;

public class L03I {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contadora = 0;
		float acumuladora = 0;
		
		while(contadora <= 10) {
		System.out.println("Digite 10 valores inteiros:");
		float valor = sc.nextFloat();
		
		float soma = valor + acumuladora;
		
		contadora++;
		
		float media = soma/10;
		System.out.println("O total somado é de: "+soma+". E a média é de: "+media);
		}
		
	
	}
	
}

package javabasico;

import java.util.Scanner;

public class QuintoPrograma {
	
	public static void main (String [] args) {
		
		Scanner valor = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		
		int numero = valor.nextInt();
		
		if ((numero%2)==0) {
			System.out.println("O valor � par.");
		}else {
			System.out.println("O valor � impar.");
		}
		
		valor.close();
	}

}

package faccat;

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] arg) {
		System.out.println("Maior valor é...");
		
		Scanner sc = new Scanner(System.in);
		
		int[] valor = new int[5];
		
		System.out.println("Digite o primeiro valor:");
		valor[0] = sc.nextInt();
		
		System.out.println("Digite o segundo valor:");
		valor[1] = sc.nextInt();
		
		System.out.println("Digite o terceiro valor:");
		valor[2] = sc.nextInt();
		
		//condição;
		
		if((valor[0]>valor[1]) && (valor[0]>valor[2])) {
			
			System.out.println("O maior valor é: "+valor[0]);
			
		}else if((valor[1]>valor[0]) && (valor[1]>valor[2])) {
			
			System.out.println("O maior valor é: "+valor[1]);
			
		}else {
			System.out.println("O maior valor é: "+valor[2]);
		}
	
		
		sc.close();
	}
}

package faccat;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] arg) {
		System.out.println("A soma dos 2 maiores valores");
		
		Scanner sc = new Scanner(System.in);
		
		int[] valor = new int[5];
		
		System.out.println("Digite o primeiro valor:");
		valor[0] = sc.nextInt();
		
		System.out.println("Digite o segundo valor:");
		valor[1] = sc.nextInt();
		
		System.out.println("Digite o terceiro valor:");
		valor[2] = sc.nextInt();


				// condição;
				// 1 2 3;
				// 1 3 2;
				// 2 3 1;
				// 2 1 3;
				// 3 2 1;
				// 3 1 2;

				if((valor[0]==valor[1]) && (valor[1]==valor[2]) && (valor[0]==valor[2])){
					System.out.println("Valores iguais");
					
				}else if ((valor[0] > valor[1]) && (valor[1] > valor[2])){
				   valor[3] = valor[0]+valor[1];
				   
				}else if ((valor[0] > valor[1]) && (valor[1] < valor[2])){
					 valor[3] = valor[0]+valor[2];
				    
				}else if ((valor[0] < valor[1]) && (valor[0] > valor[2])){
					 valor[3] = valor[1]+valor[0];
				    
				}else if ((valor[0] < valor[1]) && (valor[0] < valor[2])){
					 valor[3] = valor[1]+valor[2];
				    
				}else if ((valor[2] > valor[1]) && (valor[1]>valor[0])){
					 valor[3] = valor[2]+valor[1];
				   
				}else{
					 valor[3] = valor[2]+valor[0];
				}
				
				System.out.println("A soma dos valores iguais é de: "+valor[3]);
	
		
		sc.close();
	}
}

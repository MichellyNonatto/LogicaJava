package faccat;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		//Preecher a tabela com os seguintes valores
		// x    y   z   resposta
		// 3    2   11     B
		//150   3  455     C
		// 7   -1   -2     A
		//-2    5   -5     A
		//50    3   155    C
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		float x = sc.nextFloat();
		
		System.out.println("Digite um valor: ");
		float y = sc.nextFloat();

		float z = (x*y)+5;
		System.out.println("O valor de Z é: " + z);

		if (z <= 0){
			System.out.println("Resposta A");
			
		}else if(z<=100){
			System.out.println("Resposta B");
			
		}else{
			System.out.println("Resposta C");
		}
		
		sc.close();

	}

}

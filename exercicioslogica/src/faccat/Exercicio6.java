package faccat;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] asg) {
		
		System.out.println("Dimenções de um retângulo");
		
		Scanner valor = new Scanner (System.in);
		
		System.out.print("Digite o valor da altura do seu retângulo: ");
		int altura = valor.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o valor da largura do seu retângulo: ");
		int largura = valor.nextInt();
		
		int calculo = largura*altura;
		System.out.print("A área total do retângulo é de: "+calculo+" m²");
		
		valor.close();
		
	}
}

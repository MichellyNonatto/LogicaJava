package faccat;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] asg) {
		
		System.out.println("Dimen��es de um ret�ngulo");
		
		Scanner valor = new Scanner (System.in);
		
		System.out.print("Digite o valor da altura do seu ret�ngulo: ");
		int altura = valor.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o valor da largura do seu ret�ngulo: ");
		int largura = valor.nextInt();
		
		int calculo = largura*altura;
		System.out.print("A �rea total do ret�ngulo � de: "+calculo+" m�");
		
		valor.close();
		
	}
}

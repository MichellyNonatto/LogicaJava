package faccat;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main (String[] arg) {
		
		System.out.println("Sal�rio de um Funcion�rio");
		
		Scanner valor = new Scanner (System.in);
		
		float[] salario = new float[3];
		
		System.out.println("Digite o valor do seu sal�rio em real: ");
		salario[0] = valor.nextShort();
		
		System.out.println("Qual � o percentual de reajuste ? ");
		salario[1] = valor.nextShort();
		
		salario[2] = ((salario[1]/100) * salario[0]) + salario[0];
		System.out.println("O valor do sal�rio com reajuste � de : " + salario[2] + "R$");		
		
		valor.close();
	}

}

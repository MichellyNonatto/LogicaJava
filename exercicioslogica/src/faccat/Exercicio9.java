package faccat;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main (String[] arg) {
		
		System.out.println("Salário de um Funcionário");
		
		Scanner valor = new Scanner (System.in);
		
		float[] salario = new float[3];
		
		System.out.println("Digite o valor do seu salário em real: ");
		salario[0] = valor.nextShort();
		
		System.out.println("Qual é o percentual de reajuste ? ");
		salario[1] = valor.nextShort();
		
		salario[2] = ((salario[1]/100) * salario[0]) + salario[0];
		System.out.println("O valor do salário com reajuste é de : " + salario[2] + "R$");		
		
		valor.close();
	}

}

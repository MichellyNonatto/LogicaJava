package javabasico;

import java.util.Scanner;

public class CalculadoraComPassagemDePara {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor : ");
		float valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor : ");
		float valor2 = sc.nextInt();
		
		System.out.println("Digite o n�mero correspondente com o que voc� quer fazer :");
		
		System.out.println("1 - soma");
		
		System.out.println("2 - subtra��o");
		
		System.out.println("3 - multiplica��o");
		
		System.out.print("4 - divis�o : ");
		
		int escolha = sc.nextInt();
		 
		switch (escolha) {
		case 1:
			System.out.println("O valor da soma corresponde a : "+soma(valor1, valor2));
			break;
		
		case 2:
			System.out.println("O valor da subtra��o corresponde a : "+subtracao(valor1, valor2));
		break;
		
		case 3:
			System.out.println("O valor da multiplica��o corresponde a : "+multiplicacao(valor1, valor2));
		break;
		
		case 4:
			System.out.println("O valor da divis�o corresponde a : "+divisao(valor1, valor2));
		break;

		default:
			break;
		}
		
		
		
		sc.close();
	}
	
	static float soma(float numero1, float numero2) {
		return numero1 + numero2;
	}
	
	static float subtracao(float numero1, float numero2) {
		return numero1 - numero2;
	}
	
	static float multiplicacao(float numero1, float numero2) {
		return numero1 * numero2;
	}
	
	static float divisao(float numero1, float numero2) {
		return numero1 / numero2;
	}

}

package faccat;

import java.util.Scanner;

public class Exercicio7 {
	public static void main (String[] arg) {
		
		System.out.println("Quantos dias você está vivo");
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Digite o ano do seu nascimento: ");
		int ano = valor.nextInt();
		
		System.out.println("Digite o ano atual: ");
		int anoatual = valor.nextInt();
		
		int idade = anoatual  -ano;
		int diasdevida = idade * 365;
		
		System.out.print("Você tem "+diasdevida+" dias de vividos.");
		valor.close();
		}
}


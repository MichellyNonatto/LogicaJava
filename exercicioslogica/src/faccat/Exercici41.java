package faccat;

import java.util.Scanner;

public class Exercici41 {

	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor de 0 � 10 da nota obtida na atividade: ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Digite um valor de 0 � 10 da nota obtida na atividade: ");
		float nota2 = sc.nextFloat();
		
		System.out.println("Digite um valor de 0 � 10 da nota obtida na atividade: ");
		float nota3 = sc.nextFloat();

		float media = (nota1 + nota2 + nota3)/3;

		float media_de_aproveitamento = (nota1 + nota2*2 + nota3*3 + media)/7;

		if (media_de_aproveitamento >=9.0){
			System.out.println("Parab�ns! Voc� tirou um A.");
		    
		}else if(media_de_aproveitamento <9.0 && media_de_aproveitamento>=7.5){
			System.out.println("Muito bem. Voc� tirou um B.");

		}else if (media_de_aproveitamento<7.5 && media_de_aproveitamento>=6.0){
			System.out.println("Voc� tirou um C, se esforce mais na pr�xima vez.");

		}else{
			System.out.println("Infelizmente voc� tirou um D. Pare de ser bra�o curto e v� estudar.");
		}
		
		sc.close();
	}
}

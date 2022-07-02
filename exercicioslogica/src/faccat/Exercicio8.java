package faccat;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main (String[] arg) {
		
		System.out.println("Total de eleitores");
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Total de votos em branco: ");
		short branco = valor.nextShort();
		
		System.out.println("Total de votos em nulo: ");
		short nulo = valor.nextShort();
		
		System.out.println("Total de votos válidos: ");
		short valido = valor.nextShort();
		
		float totalvotos = branco+nulo+valido;
		float brancopercentual = (branco*100)/totalvotos;
		float nulopercentual = (nulo*100)/totalvotos;
		float validopercentual = (valido*100)/totalvotos;
		
		System.out.println("Total de votos é de: "+totalvotos);
		System.out.println("A porcentagem de votos é de: ");
		System.out.println("Votos em branco: "+brancopercentual+"%");
		System.out.println("Votos em nulo: "+nulopercentual+"%");
		System.out.println("Votos validos: "+validopercentual+"%");
		
		valor.close();
	}

}

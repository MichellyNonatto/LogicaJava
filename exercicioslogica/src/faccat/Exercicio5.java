package faccat;

import java.util.Scanner;

public class Exercicio5 {

	 public static void main (String[] args) {
		 
		 System.out.println("Número antecessor");
		 
		 Scanner valor = new Scanner (System.in);
		 
		 System.out.print("Digite um valor: ");
		 int numero = valor.nextInt();
		 
		 int antecessor = numero-1;
		 System.out.println("O número antecessor de "+numero+" é: "+antecessor);
		 
		 valor.close();
	 }
}

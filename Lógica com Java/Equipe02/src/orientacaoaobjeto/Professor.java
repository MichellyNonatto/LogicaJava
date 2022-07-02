package orientacaoaobjeto;

public class Professor {

	int idade = 37;
	String nome = "Jailson";
	String cidade = "Osasco";
	
	public static void main(String[] args) {

	Professor professor005 = new Professor();
	System.out.println("O professor selecionado é o "+professor005.nome+", ele tem "+professor005.idade+" anos e mora na cidade de "+professor005.cidade);
	
	}

}

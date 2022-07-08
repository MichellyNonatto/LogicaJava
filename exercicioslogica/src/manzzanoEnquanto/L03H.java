package manzzanoEnquanto;

public class L03H {

	public static void main(String[] args) {
		
		
		float celsius = 10;
		while (celsius < 110) {
		   float  fahrenheit = (9*celsius+160)/5;
		    System.out.println("Temperatura em Celsius: "+celsius+"°C"+". Temperatura em Fahrenheit: "+fahrenheit+"°F");
		    celsius = celsius+10;
		}

	}

}

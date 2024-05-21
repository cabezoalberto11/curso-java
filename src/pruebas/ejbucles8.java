package pruebas;
import java.util.Scanner;
public class ejbucles8 {

	public static void main(String[] args) {
		
		//Crea una clase con un método main que pida una entrada de teclado
		//Y muestre cada una de las letras que componen la entrada
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce una palabra");
		
		String palabra = scanner.nextLine();
		
		System.out.println("Las letras q componen la palabra son: ");
		
		for(int i=0; i<palabra.length(); i++) {
			
			System.out.println(palabra.charAt(i));
		}
		
		

	}

}

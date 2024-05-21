package pruebas;
import java.util.Scanner;
public class ejbucles4 {

	public static void main(String[] args) {
		
		// IMPRIMIR LA TABLA DE MULTIPLICAR DE UN NUMERO.
		
		Scanner Scanner = new Scanner ( System.in);
		System.out.println("Introduce un número");
		int numero = Scanner.nextInt();
		
		for(int i=0; i<=10; i++) {
			System.out.println(numero + " multiplicado por " + i + " = " + numero*i);
		}

	}

}

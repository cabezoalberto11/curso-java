package pruebas;
import java.util.Scanner;
public class adivinanum2 {

	public static void main(String[] args) {
		int aleatorio = (int)(Math.random()*100);
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		System.out.println("Introduce tu numero");
		
		while (numero != aleatorio ) {
			 numero = scanner.nextInt();
			intentos ++;
			 if ( numero < aleatorio ) {
				 System.out.println("MAS ALTO");
			 }else if ( numero > aleatorio ) {
				System.out.println("MAS BAJO");
			  }
		}
		System.out.println(" NUMERO ACERTADO, LO HAS ADIVINADO EN " + intentos + " INTENTOS" );
		

	}

}

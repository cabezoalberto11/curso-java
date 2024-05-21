package pruebas;
import java.util.Scanner;
public class ejbucles19 {

	public static void main(String[] args) {
		// PEDIR AL USUARIO QUE INTRODUZCA UN NUMERO PAR.
		// SI SE INTRODUCE UN NUMERO IMPAR, SE SEGUIRA SOLICITANDO EL NUMERO HASTA QUE SEA PAR
		// EL PROGRAMA FINALIZA CUANDO SE INTRODUCE EL NUMERO PAR
		
		Scanner scanner = new Scanner ( System.in);
		
		int numeroUsuario;
		
		do {
			System.out.println("Introduce un número par");
			numeroUsuario = scanner.nextInt();
			
			if ( numeroUsuario %2 != 0 ) {
				System.out.println("Número incorecto, introduce un número par");
			}
			
		} while (numeroUsuario %2 != 0);
		
		System.out.println("Gracias, has introducido el número " + numeroUsuario);

	}

}

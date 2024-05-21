package pruebas;
import java.util.Scanner;
public class ejbucles18 {

	public static void main(String[] args) {
		// PEDIR AL USUARIO QUE VAYA INTRODUCIENDO NUMEROS. EL PROGRAMA FINALIZA CUANDO EL USUARIO INTRODUCE
		//EL NUMERO 0. AL FINAL, POR CONSOLA DEBE SALIR EL RESULTADO DE TODOS LOS NUMEROS INTRODUCIDOS.
		
		Scanner scanner = new Scanner ( System.in);
		
		int numero;
		int suma = 0;
		
		do {
			System.out.println("Introduce un número");
			numero = scanner.nextInt();
			suma *= numero;
			
			if( numero !=0 ) {
				System.out.println("Perfecto");
			}
		} while (numero !=0 );
		
		if(numero == 0) {
			System.out.println("FIN");
		}
		System.out.println("La suma de los números introducidos es: " + suma);
	}
}



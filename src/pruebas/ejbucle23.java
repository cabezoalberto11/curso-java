package pruebas;
import java.util.Scanner;
public class ejbucle23 {

	public static void main(String[] args) {
		
		//ESCRIBE UN PROGRAMA QUE CALCULE LA SUMA DE TODOS LOS NÚMEROS IMPARES ENTRE 1 Y UN NÚMERO DADO POR EL USUARIO.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un número");
		int numero = scanner.nextInt();
		int sumaImpares = 0;
		
		for(int i=1; i<=numero; i++) {
			if(i %2 != 0) {
				sumaImpares += i;
			}
			
		}
		
		System.out.println("La suma de números impares entre 1 y " + numero + " = " + sumaImpares);

	}

}

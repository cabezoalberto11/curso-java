package pruebas;
import java.util.Scanner;
public class ejbucles6 {

	public static void main(String[] args) {
		
		//PROGRAMA QUE SOLICITE AL USUARIO INGRESAR UN NÚMERO ENTERO
		// EL PROGRAMA DEBE CALCULAR LA SUMA DE TODOS LOS NÚMEROS PARES DESDE 1 HASTA EL NÚMERO INGRESADO POR EL USUARIO
		// SI EL NÚMERO INGRESADO ES NEGATIVO O CERO, EL PROGRAMA DEBE MOSTRAR UN MENSAJE DE ERROR.
		
		Scanner Scanner = new Scanner (System.in);
		int numero=0;
		
		do {
			System.out.println("Introduce un número entero");
			int numeroEntero = Scanner.nextInt();
			
			if(numero <=0 ) {
				System.out.println("Error, introduce un número mayor que 0");
			}
		}while(numero<=0);
		int sumaPares = 0;
			for(int i=0; i<=numero; i++) {
				if (i % 2 == 0) {
	                sumaPares += i;
				}
			}
			System.out.println("La suma de todos los números pares desde 1 hasta " + numero + " es: " + sumaPares);
	}
}
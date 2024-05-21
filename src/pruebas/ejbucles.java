package pruebas;
import java.util.Scanner;
public class ejbucles {

	public static void main(String[] args) {
		
		//Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente)
		//saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número (base)");
		int base = scanner.nextInt();
		
		System.out.println("Introduce otro número (exponente)");
		int exponente = scanner.nextInt();
		
		int resultado = 1;
		
		for( int i=0; i<exponente; i++) {
			resultado *= base;
			}
		System.out.println(base + " elevado a " + exponente + " = " + resultado);
	
	}

}







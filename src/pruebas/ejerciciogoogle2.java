package pruebas;
import java.util.Scanner;
public class ejerciciogoogle2 {

	public static void main(String[] args) {
		//5. Mostrar la tabla de multiplicar de los números del 1 al 9.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = scanner.nextInt();
		
		for (int i=1; i<10; i++) {
			
			if ( numero <=0) {
				System.out.println("Número incorrecto, introduce un valor del 1 al 9");
				break;
			}else if(numero >0 && numero<10) {
				System.out.println(numero + " multiplicado por " + i + " = " + numero*i);
			 }
		}
		
			
	}

}

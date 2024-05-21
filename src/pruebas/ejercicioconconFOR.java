package pruebas;
import java.util.Scanner;
public class ejercicioconconFOR {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("introduce un número");
		int numero = scanner.nextInt();
		
		for(int i=0; i<10; i++) {
			System.out.println(numero + " multiplicado por " + i + " = " + numero*i);
		}
		

	}

}

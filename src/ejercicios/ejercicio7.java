package ejercicios;
import java.util.Scanner;
public class ejercicio7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce tu edad, por favor");
		int edad = scanner.nextInt();
		
		if(edad <4) {
			System.out.println("ACCESO GRATUITO");
		} else if(edad >=4 && edad <18) {
			System.out.println("DEBES PAGAR 5 EUROS");
		} else {
			System.out.println("DEBES PAGAR 10 EUROS");
		}
	}
}

package ejercicios;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		
		int edad = scanner.nextInt();
		
		System.out.println("Introduce tu nota");
		
		int nota = scanner.nextInt();
		
		System.out.println("Introduce tu sexo: masculino o femenino");
		
		String sexo = scanner.next();
		
		
		if(edad >= 18 && nota >= 5) {
			if(sexo.equalsIgnoreCase("masculino")) {
				System.out.println("posible");
			} else if(sexo.equalsIgnoreCase("femenino")) {
				System.out.println("aceptada");
			} else {
				System.out.println("no aceptada");
			}
		} else {
			System.out.println("no aceptada");
		}
	}
}

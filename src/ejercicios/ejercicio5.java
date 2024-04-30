package ejercicios;
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número entre 1 y 12");
		int número = scanner.nextInt();
		
		if(número == 1) {
			System.out.println("ENERO");
		}
		else if(número == 2) {
			System.out.println("FEBRERO");
		}
		else if(número == 3) {
			System.out.println("MARZO");
		}
		else if(número == 4) {
			System.out.println("ABRIL");
		}
		else if(número == 5) {
			System.out.println("MAYO");
		}
		else if(número == 6) {
			System.out.println("JUNIO");
		}
		else if(número == 7) {
			System.out.println("JULIO");
		}
		else if(número == 8) {
			System.out.println("AGOSTO");
		}
		else if(número == 9) {
			System.out.println("SEPTIEMBRE");
		}
		else if(número == 10) {
			System.out.println("OCTUBRE");
		}
		else if(número == 11) {
			System.out.println("NOVIEMBRE");
		}
		else if(número == 12) {
			System.out.println("DICIEMBRE");
		}
		else {
			System.out.println("ESE NUMERO NO CORRRESPONDE A NINGUN MES");
		}
		
		

	}

}

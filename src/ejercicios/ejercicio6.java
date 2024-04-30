package ejercicios;
import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce tu contraseña");
		
		String contraseña = scanner.nextLine(); 
		
		if(contraseña.equalsIgnoreCase("alberto")) {
			System.out.println("Contraseña correcta");
		}
		
		else {
			System.out.println("Contraseña incorrecta");
		}

	}

}

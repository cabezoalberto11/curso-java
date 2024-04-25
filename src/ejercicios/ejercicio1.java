package ejercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce la inicial de tu nombre");
		
		String inicial = scanner.nextLine();
		
		System.out.print("Introduce la inicial de tu sexo: M/F");
		
		String sexo = scanner.nextLine();
		
		if(inicial.equalsIgnoreCase("a") 
				|| inicial.equalsIgnoreCase("b") 
				|| inicial.equalsIgnoreCase("c") 
				&& sexo.equalsIgnoreCase("f")){
			System.out.println("grupo A");
		} else if(inicial.equalsIgnoreCase("h") 
				|| inicial.equalsIgnoreCase("i") 
				|| inicial.equalsIgnoreCase("j") 
				&& sexo.equalsIgnoreCase("m")) {
			System.out.println("grupo B");
		} else {
			System.out.println("No existes!");
		}
	}

}

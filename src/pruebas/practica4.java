package pruebas;
import java.util.Scanner;
public class practica4 {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
		
			while (true) {
				System.out.println("Introduce un caracter, o un espacio para salir");
				String caracter = scanner.nextLine();
			 
				if (caracter.equals(" ")) {
					System.out.println("PROGRAMA FINALIZADO");
					break; 
				}else if (caracter.equalsIgnoreCase("a")||
						caracter.equalsIgnoreCase("e")||
						caracter.equalsIgnoreCase("i")||
						caracter.equalsIgnoreCase("o")||
						caracter.equalsIgnoreCase("u")) {
					System.out.println("VOCAL");
				}else{
					System.out.println("NO VOCAL");
				} 
	               
			}
	}	
}



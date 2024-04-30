package pruebas;
import java.util.Scanner;
public class prueba1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce tu contraseña, por favor");
		
		String DatoUsuario = scanner.nextLine();
		String MiContraseña = "AlbertO";
		
		if( DatoUsuario.equalsIgnoreCase(MiContraseña)) {
			System.out.println("Contraseña corecta");
		} else {
			System.out.println("Contraseña incorrecta, intente de nuevo");}
		
		
		
		
		

	}

}

package pruebas;
import java.util.Scanner;
public class ejbucle22 {

	public static void main(String[] args) {
		// CREAR UNA CONTRASEÑA Y ALMACENARLA EN UNA VARIABLE. EL PROGRAMA DEBE PEDIRME QUE INTRODUZCA LA CONTRASEÑA.
		// SI COINCIDE, EL PROGRAMA DICE CONTRASEÑA CORRECTA Y FINALIZA
		// EN CASO CONTRARIO, SE SOLICITA LA CONTRASEÑA DE NUEVO UN MAXIMO DE 3 VECES
		
		Scanner Scanner = new Scanner(System.in);
		
		String clave = "Alberto123";
		int intentos=3;
		
		do {
			System.out.println("Introduce tu contraseña");
			String contraseña = Scanner.next(); 
			
			if(contraseña.equalsIgnoreCase(clave)) {
				System.out.println("Contraseña correcta");
				return;
			}else {
				intentos--;
			}if( ! contraseña.equalsIgnoreCase(clave)) {
				System.out.println("contraseña incorrecta, te quedan " + intentos + " intentos");
			}else {
				System.out.println("Contraseña correcta");
			}
				
		}while( intentos >0);
		System.out.println("Eres tonto o que te pasa");
	}
}

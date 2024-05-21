package pruebas;
import java.util.Scanner;
public class ejbucles17 {

	public static void main(String[] args) {
		
		//PEDIR AL USUARIO UN NUMERO PAR. SI INTRODUCE UN NUMERO IMPAR, LA CONSOLA DEBE MOSTRAR ERROR Y VOLVER 
		//A SOLICITAR EL NUMERO AL USUARIO HASTA QUE INGRESE UN NUMERO PAR.
		
		Scanner Scanner = new Scanner (System.in);
				
		boolean par = false;
		
		while(!par) {
			
			System.out.println("Introduce un número par, por favor");
			int numero = Scanner.nextInt();
			
			if (numero % 2 == 0) {
                par = true;
                System.out.println("Gracias.");
            }else{
            	System.out.println("El número debe ser par.");
            }

		}
	
	}

}

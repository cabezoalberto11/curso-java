package pruebas;
import java.util.Scanner;
public class ejbucles20 {

	public static void main(String[] args) {
		
		// PEDIR AL USUARIO QUE INTRODUZCA UN NUMERO PAR.
		// SI SE INTRODUCE UN NUMERO IMPAR, SE SEGUIRA SOLICITANDO EL NUMERO HASTA QUE SEA PAR
		// EL PROGRAMA FINALIZA CUANDO SE INTRODUCE EL NUMERO PAR
		
		Scanner Scanner = new Scanner(System.in);
		 int numeroUsuario;
		
		 do {
			 System.out.println("Introduce un número par, por favor");
			 numeroUsuario = Scanner.nextInt();
			 
			 if(numeroUsuario %2 !=0) {
				 System.out.println("Error");
			 } 
		 } while (numeroUsuario %2 !=0);
		 System.out.println("Genial, el número introducido ha sido el " + numeroUsuario);
	}

}

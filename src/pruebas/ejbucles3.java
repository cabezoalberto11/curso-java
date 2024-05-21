package pruebas;
import java.util.Scanner;
public class ejbucles3 {

	public static void main(String[] args) {
		
		//En este programa, utilizamos un bucle for para imprimir un contador regresivo del 10 al 1.
		//Luego, fuera del bucle, imprimimos un mensaje indicando "¡Despegue!" después de que el contador llega a 1.
		
		 Scanner scanner = new Scanner ( System.in);
		
		 for( int i=10; i>=1; i--) {
			 System.out.println(i);
		 }
		 
		 System.out.println("DESPEGUE");
	}

}

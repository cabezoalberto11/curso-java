package pruebas;
import java.util.Scanner;
public class ejbucles2 {

	public static void main(String[] args) {
		
		//Este programa calcula la suma de los primeros 10 números naturales utilizando un bucle for
		
		Scanner scanner = new Scanner (System.in);
		
		int suma=0;
		
		for(int i=1; i<=10; i++) {
			suma+=i;
		}
		System.out.println("La suma de todos los números desde el 0 hasta el 10 " + " = " + suma);

	}

}

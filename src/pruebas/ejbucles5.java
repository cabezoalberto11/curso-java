package pruebas;
import java.util.Scanner;
public class ejbucles5 {

	public static void main(String[] args) {
		// IMPRIMIR LOS NUMEROS PARES DEL o AL 30.
		
		Scanner scanner = new Scanner (System.in);
		
		for(int i=0; i<=30; i++) {
			
			if( i%2 == 0) {
				System.out.println(i);
			}
		}
		
	}

}

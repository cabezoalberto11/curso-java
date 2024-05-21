package pruebas;
import java.util.Scanner;
public class ejbucles10 {

	public static void main(String[] args) {
		
		//IMPRIME LOS PRIMEROS 100 NUMEROS PARES
		
		Scanner Scanner = new Scanner(System.in);
		
		
		System.out.println("Los números pares del 1 al 100 son: ");
		
		for(int i=1; i<=100; i++) {
			
			if(i %2 == 0 ) {
				System.out.println(i);
			}
		}

	}

}

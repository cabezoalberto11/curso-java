package pruebas;
import java.util.Scanner;
public class ejbucles14 {

	public static void main(String[] args) {
		
		//ESCRIBE UN PROGRAMA QUE PIDA DOS NUMEROS ENTEROS Y ESCRIBA QUE NUMEROS SON PARES Y CUALES IMPARES.
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Escribe un número entero");
		int numero = Scanner.nextInt();
		
		System.out.println("Escribe otro número entero");
		int numero2 = Scanner.nextInt();
		
		System.out.println("Los números pares entre " + numero + " y " + numero2 + " son: ");
		
		for(int i=numero; i<=numero2; i++) {	
			
			if( i %2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Los números impares entre " + numero + " y " + numero2 + " son: ");
		
		for(int i=numero; i<=numero2; i++) {
			
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
		
	}

}

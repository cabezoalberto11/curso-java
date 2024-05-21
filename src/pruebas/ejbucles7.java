package pruebas;
import java.util.Scanner;
public class ejbucles7 {

	public static void main(String[] args) {
		
		//CREAR UN PROGRAMA EN JAVA QUE IMPRIMA TODOS LOS NÚMEROS PARES DEL 1 AL 10.
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Los números pares son: ");
		
		for(int i=1; i<=10; i++) {
			
			if( i%2== 0) {
				System.out.println(i);
			}
		}
		
	}

}

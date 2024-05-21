package pruebas;
import java.util.Scanner;
public class practica3java {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ingrese el primer número");
		int numero1 = scanner.nextInt();
		
		System.out.println("Ingrese el segundo número");
		int numero2 = scanner.nextInt();
		
		System.out.println("Números pares entre " + numero1 + " y " + numero2 + " =");
		
		for(int i=numero1; i<=numero2; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		

	}

}

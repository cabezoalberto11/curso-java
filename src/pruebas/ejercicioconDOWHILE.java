package pruebas;
import java.util.Scanner;
public class ejercicioconDOWHILE {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Introduce un número del 1 al 9");
			numero=scanner.nextInt();
			
			if(numero<=0) {
				System.out.println("número incorrecto");
			}
		
		}while(numero<=0);
			
		for(int i=1; i<=10; i++) {
				System.out.println(numero + " por " + i + " = " + numero*i);
		}
			
	}
}

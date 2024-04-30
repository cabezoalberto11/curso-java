package ejercicios;
import java.util.Scanner;
public class adivinaNumero {

	public static void main(String[] args) {
		
		int aleatorio = (int)(Math.random()*100);
		
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		int intentos = 0;
		
		System.out.println("Introduce un numero, por favor");
		
		while (numero != aleatorio) {
			
			numero = scanner.nextInt();
			
			if(aleatorio<numero) {
				System.out.println("Mas bajo");
			}
			else if(aleatorio>numero) {
			System.out.println("Mas alto");
			}
		

		}
		System.out.println("Correcto");
	}
}
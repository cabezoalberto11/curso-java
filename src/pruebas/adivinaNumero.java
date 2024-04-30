package pruebas;
import java.util.Scanner;
public class adivinaNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int aleatorio = (int)(Math.random()*100);
		int numero = 0;
		int intentos = 0;
		System.out.println("Introduce un número, por favor");
		
		
		while (numero != aleatorio) {
			intentos ++;
			 numero = scanner.nextInt();
			
			if (numero < aleatorio) {
				System.out.println("MAS ALTO");
				}
			else if (numero > aleatorio) {
				System.out.println("MAS BAJO");
				}
		}
		System.out.println("CORRECTO, ERES UN CRACK, " + "LO HAS CONSEGUIDO EN " + intentos + " INTENTOS");
		
		

	}

}

package pruebas;
import java.util.Scanner;
public class ejercicioconWHILE {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número del 1 al 9");
		int numero = scanner.nextInt();
		
		int i=1;
		
		
		if(numero >= 1 && numero <= 9) {
            
            while (i <= 10) {
                System.out.println(numero + " multiplicado por " + i + " = " + numero * i);
                i++;
            }
        } else {
            System.out.println("Error, introduce un número entre 1 y 9");
          }
	    }

	}


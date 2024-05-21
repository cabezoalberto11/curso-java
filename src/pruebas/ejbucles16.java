package pruebas;
import java.util.Scanner;
public class ejbucles16 {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner (System.in);
		
		int numero;
        
        do {
            System.out.println("Introduce un número entre 1 y 8, por favor:");
            numero = Scanner.nextInt();
            
            if (numero < 1 || numero > 8) {
                System.out.println("Número no válido, por favor, introduce otro.");
            }
            
        } while (numero < 1 || numero > 8);
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
        
    }
}




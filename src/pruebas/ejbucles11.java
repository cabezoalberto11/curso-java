package pruebas;
import java.util.Scanner;
public class ejbucles11 {

	public static void main(String[] args) {
		
		//SUMA DE LOS PRIMEROS 100 NUMEROS PARES.
		
		Scanner Scanner = new Scanner(System.in);
		
		
		int suma =0;   //Variable para almacenar la suma de los primeros 100 números pares
		
		for (int i=0; i<=100; i+=2) {
			 suma = suma + i;
		}
			System.out.println("La suma de los primeros 100 números pares entre sí = " + suma);
		}

	}



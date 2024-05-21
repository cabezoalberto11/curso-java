package pruebas;
import java.util.Scanner;
public class ejbucles13 {

	public static void main(String[] args) {
		
		//ESCRIBE UN PROGRAMA QUE DADOS DOS NUMEROS (UNO BASE Y OTRO EXPONENTE)
		//SAQUE POR PANTALLA EL RESULTADO DE LA POTENCIA.NO SE PUEDE UTILIZAR EL OPERADOR DE POTENCIA.
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Introduce un número (base)");
		int base = Scanner.nextInt();
		
		System.out.println("Introduce otro número (exponente)");
		int exponente = Scanner.nextInt();
		
		int resultado = 1;
		
		for(int i=1; i<=exponente; i++) {
			
			resultado = resultado*base;
		}
		System.out.println("El resultado de " + base + " elevado a " + exponente + " = " + resultado);
	}

}

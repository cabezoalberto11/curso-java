package pruebas;
import java.util.Scanner;
public class ejbucles9 {

	public static void main(String[] args) {
		
		//UNA PERSONA ADQUIRIÓ UN PRODUCTO PARA PAGAR EN 20 MESES. EL PRIMER MES PAGÓ 10 €, EL SEGUNDO 20 €, EL TERCERO 40 € Y ASÍ SUCESIVAMENTE.
		//REALIZAR UN PROGRAMA PARA DETERMINAR CUÁNTO DEBE PAGAR MENSUALMENTE Y EL TOTAL DE LO QUE PAGARÁ DESPUÉS DE LOS 20 MESES.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el mes (en números), por ejemplo: ENERO = 1, FEBRERO = 2 ");
		
		int mes = scanner.nextInt();
		
		int pagoMensual = 10;  // Inicializar la cantidad a pagar en el primer mes
		int totalPagado=0;
		
		for ( int i=1; i<=mes; i++) {
			
			System.out.println("El mes número " + i + " pagarás " + pagoMensual+ " euros");
			
			totalPagado += pagoMensual;
			pagoMensual *= 2;
		}
		System.out.println("El total pagado hasta el mes número " + mes + " = " + totalPagado);
	}
}

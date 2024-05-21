package pruebas;
import java.util.Scanner;
public class condicional {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Introduce tu género");
		String genero = scanner.next();
		
		System.out.println("Introduce tu altura en centímetros");
		int altura = scanner.nextInt();
		
		
		if ( genero.equalsIgnoreCase("masculino") ) {
			
			System.out.println("TU PESO IDEAL ES " + (altura - 110) + " KILOS");
	   
		}else if( genero.equalsIgnoreCase("femenino") ) {
	    	
			System.out.println("TU PESO IDEAL ES " + (altura - 120) + " KILOS");
	    }
	}

}

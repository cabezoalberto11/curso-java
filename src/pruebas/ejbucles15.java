package pruebas;
import java.util.Scanner;
public class ejbucles15 {

	public static void main(String[] args) {
		
		//ESCRIBE UN PROGRAMA QUE PIDA UN NUMERO ENTERO MAYOR QUE CERO Y QUE ESCRIBA SUS DIVISORES.
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Introduce un número mayor que 0");
		
		int numero = Scanner.nextInt();
		
		if(numero <=0) {
			System.out.println("Número no válido, debe ser mayor que 0");
		}else {
			System.out.println("Los divisores de " + numero + " son: ");
		}
		
		for(int i=1; i<=numero; i++) {
			if (numero %i == 0) {
				System.out.println(i);
			}
		}

	}

}

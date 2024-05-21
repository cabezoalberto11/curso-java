package pruebas;
import java.util.Scanner;
public class practica1mejora {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Cuantos numeros vas a introducir¿");
		
		int cantidadNumeros = scanner.nextInt();
		
		int [] numero = new int [cantidadNumeros];
		
		int mayorcero=0;
		int menorcero=0;
		int igualcero=0;
		
		
		
		
		for (int i=0; i<cantidadNumeros; i++) {
			System.out.println("Ingrese numero " + (i+1) + ":");
			numero[i] = scanner.nextInt();
			
			if (numero[i] >0) {
				mayorcero++;
			}else if (numero[i] <0) {
				menorcero++;
			}else {
				igualcero++;
		     }
		
		 }
		System.out.println("Numeros mayores que cero = " + mayorcero++);
		System.out.println("Numeros menores que cero = " + menorcero++);
		System.out.println("Numeros iguales que cero = " + igualcero++);
		
		System.out.println("Números introducidos:");
        
		for (int i = 0; i < cantidadNumeros; i++) {
            
			System.out.println(numero[i]);
		
        }
		
		
	}
}



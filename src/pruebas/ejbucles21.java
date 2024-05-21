package pruebas;
import java.util.Scanner;
public class ejbucles21 {

	public static void main(String[] args) {
		//PROGRAMA QUE PIDA UN NUMERO E IMPRIMA SU CORRESPONDIENTE DIA DE LA SEMANA
		//EL PROGRAMA FINALIZA CUANDO SE INTRODUCE EL NUMERO 0 
		
		Scanner Scanner = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Introduce un número");
			numero = Scanner.nextInt();
			
			if(numero == 1) {
				System.out.println("LUNES");
			}else if(numero == 2) {
				System.out.println("MARTES");
			}else if(numero == 3) {
				System.out.println("MIERCOLES");
			}else if(numero == 4) {
				System.out.println("JUEVES");
			}else if(numero == 5) {
				System.out.println("VIERNES");
			}else if(numero == 6) {
				System.out.println("SABADO");
			}else if( numero == 7) {
				System.out.println("DOMINGO");
			}else if(numero == 0) {
				System.out.println("FIN");
			}else{
				System.out.println("Ese número no corresponde a ningún día de la semana");
			}
		
		}while(numero !=0);
		
	}

}


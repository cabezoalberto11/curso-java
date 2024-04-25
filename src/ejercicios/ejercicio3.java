package ejercicios;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Introduce tu edad");
		
		int Edad=scanner.nextInt();
		
		System.out.print("Introduce tu salario");
		
		int Salario=scanner.nextInt();
		
		if(Edad>=16 && Salario>=1000){
			
			System.out.print("Debes tributar");
		}
		
		else{
			
			System.out.print("No debes tributar");
		}
		

	}

}

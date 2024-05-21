package pruebas;
import java.util.Scanner;
public class ejerciciogooglemejora {

	public static void main(String[] args) {
		
		//ESCRIBE UN PROGRAMA QUE PERMITA GENERAR LA TABLA DE MULTIPLICAR DE UN NUMERO ENTERO POSITIVO, COMENZANDO DESDE 1
		//SI EL USUARIO ESCRIBE UN NUMERO INCORRECTO, EL PROGRAMA NO SE EJECUTA,PERO PREGUNTA DE NUEVO HASTA QUE EL DATO SEA CORRECTO.
		
		Scanner scanner = new Scanner(System.in);
		
		 int numero;
		
		do {
            System.out.println("Introduce un número entero positivo:");
            numero = scanner.nextInt();
           if (numero < 0) {
                System.out.println("Número incorrecto");
           }
        }while (numero < 0);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " multiplicado por " + i + " = " + numero * i);
        }

     }
}

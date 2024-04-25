package ejercicios;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Introduce el mes");
		
		String mes = scanner.nextLine();
		
		
		
		//if(mes.equalsIgnoreCase("marzo") || mes.equalsIgnoreCase("abril") || mes.equalsIgnoreCase("mayo")) {
			
		//	System.out.print("Es primavera");
		//} else if(mes.equalsIgnoreCase("junio") || mes.equalsIgnoreCase("julio") || mes.equalsIgnoreCase("agosto")) {
			
		//	System.out.println("Es verano");
		//	
		//} else if(mes.equalsIgnoreCase("septiembre") || mes.equalsIgnoreCase("octubre") || mes.equalsIgnoreCase("noviembre")) {
			
		//	System.out.println("Es otoño");
		//} else if(mes.equalsIgnoreCase("diciembre") || mes.equalsIgnoreCase("enero") || mes.equalsIgnoreCase("febrero")) {
			
		//	System.out.println("Es invierno");
		//} else {
		//	System.out.println("ERROR");
		//}
		
		switch (mes.toLowerCase()) {
			case "primavera":
				System.out.println("La sangre altera");
				break;
			case "verano":
				System.out.println("A la piscina");
				break;
			case "otoño":
				System.out.println("Las hojas se caen");
				break;
			case "invierno":
				System.out.println("En Murcia no existe");
				break;
			default:
				System.out.println("Error");
				
		}
	}

}

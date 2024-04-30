package pruebas;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.JOptionPane;
public class BucleWhile {

	public static void main(String[] args) {
	
		String clave = "Alberto";
		String ClaveUsuario = "";
		
		while(clave.equalsIgnoreCase(ClaveUsuario) == false) {
			
			ClaveUsuario = JOptionPane.showInputDialog("Introduce tu contraseña");
			
			if(clave.equalsIgnoreCase(ClaveUsuario) == false) {
				
				System.out.println("Contraseña incorrecta, intente de nuevo");
			}
		}
		
			System.out.println("Contraseña correcta, acceso permitido");
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		

	



package ejercicios;

public class arrays3 {

	public static void main(String[] args) {
		
		String [] paises = new String [8];
		
		paises [0] = "España";
		paises [1] = "Mexico";
		paises [2] = "Colombia";
		paises [3] = "Perú";
		paises [4] = "Chile";
		paises [5] = "Argentina";
		paises [6] = "Ecuador";
		paises [7] = "Venezuela";
		
		for ( int i=0; i<paises.length; i++) {
			System.out.println("País " + (i+1) + " " + paises[i]);
		}
		
	}

}

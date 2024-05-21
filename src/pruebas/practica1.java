package pruebas;

public class practica1 {

	public static void main(String[] args) {
		
		int [] numero = new int [20];
		
		numero [0] = 34;
		numero [1] = 234;
		numero [2] = 322;
		numero [3] = 0;
		numero [4] = -435;
		numero [5] = -3234;
		numero [6] = 436;
		numero [7] = 0;
		numero [8] = -45;
		numero [9] = 435;
		numero [10] = 87;
		numero [11] = 67;
		numero [12] = -954;
		numero [13] = -75;
		numero [14] = 54;
		numero [15] = 34;
		numero [16] = 3245;
		numero [17] = -976;
		numero [18] = 0;
		numero [19] = 22;
		
		int mayorcero = 0;		
		int menorcero = 0;
		int igualcero = 0;
		
		for(int i=0; i<numero.length; i++) {
			
			if(numero[i] <0) {
				menorcero++;
			}else if(numero[i] >0) {
				mayorcero++;
			}else {
				igualcero++;
			}
		}
		System.out.println("numeros menores que cero = " + menorcero++);
		System.out.println("numeros mayores que cero = " + mayorcero++);
		System.out.println("numeros iguales que cero = " + igualcero++);
	}

}

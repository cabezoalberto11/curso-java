package ejercicios;

public class arraybidimensional {

	public static void main(String[] args) {
		
		int [] [] mi_matriz = new int[4] [5];
		
		mi_matriz[0][0]=15;
		mi_matriz[0][1]=21;
		mi_matriz[0][2]=18;
		mi_matriz[0][3]=9;
		mi_matriz[0][4]=15;
		
		
		mi_matriz[1][0]=10;
		mi_matriz[1][1]=52;
		mi_matriz[1][2]=17;
		mi_matriz[1][3]=19;
		mi_matriz[1][4]=7;
		
		
		mi_matriz[2][0]=9;
		mi_matriz[2][1]=2;
		mi_matriz[2][2]=19;
		mi_matriz[2][3]=17;
		mi_matriz[2][4]=7;
		
		
		mi_matriz[3][0]=92;
		mi_matriz[3][1]=13;
		mi_matriz[3][2]=13;
		mi_matriz[3][3]=32;
		mi_matriz[3][4]=41;
		
		for ( int i=0; i<4; i++ ) {
			System.out.println();
			for ( int j=0; j<5; j++) {
				
				System.out.print(mi_matriz[i][j] +" ");
			}
		}

	}

}

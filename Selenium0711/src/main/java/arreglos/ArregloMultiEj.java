package arreglos;

public class ArregloMultiEj {

	public static void main(String[] args) {
		int arr[][] = {{2,7,9}, {3,6,1}, {7,4,2}};
		
		//La primera posicion es el array y la segunda posicion es dentro de nuestro array
//		System.out.println(arr[2][1]);
//		System.out.println(arr[0][0]);
//		System.out.println(arr[1][2]);
		
		//Imprimir arreglo de dos dimensiones
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " "); //print en la misma lineas
			}
			System.out.println();

		}
	}
}

package metodos;

public class MetodosEjemplo {

	public static void main(String[] args) {
		
		int resultado = suma(4,7);
		System.out.println(resultado);
		
		int resultado2 = suma(134,14,15);
		System.out.println(resultado2);
		
		String marca = carro(3);
		System.out.println(marca);

	}
	
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static int suma(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
	
	public static String carro(int a) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		return cars[a];
	}

}

package ejemplo_Java;

public class Ejemplo_Metodos {

	public static void main(String[] args) {
		int resultado = suma(80, 75);
		System.out.println(resultado);
		
		int resultado2 = suma(123, 6);
		System.out.println(resultado2);
		
		int resultado3 = suma(34, 56);
		System.out.println(resultado3);
		
		String marcaCarro = carro (1);
		System.out.println(marcaCarro);
		
		ejemplovoid();
	}
	
	public static int suma(int a, int b) {
		int c= a + b;
		return c;
	}
	
	public static String carro(int a) {
		String[] cars = {"volvo", "BMW", "Ford", "Mazda"};
		return cars [a];
				
	}
	public static void ejemplovoid() {
		System.out.println("Ejecucion dentro de metodo void");
	}
}

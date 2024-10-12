package ejemplo_Java;

public class Ejemplo_Arreglo {

	public static void main(String[] args) {
		int intArray[];
		int[] intArray2;
		
		// Declarando el arreglo
		String[] arr;
		
		//Asignando el tamaño del arreglo
		arr = new String[5];
		
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		//System.out.println("Elemento en el indice 1:" + arr[1]);
		
		//System.out.println("Elemento en el indice 1:" + arr[2]);
		
		for (int i =0; i < arr.length; i++) { //.length nos regresa la  capacidad del arreglo
			System.out.println("Elemendo en el indice " + i + " : " + arr[i]);
		}

	}

}

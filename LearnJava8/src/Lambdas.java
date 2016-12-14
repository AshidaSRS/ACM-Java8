import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Lambdas {

	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5,6,7,8};
		
		System.out.println("\n"
		+ "---------------------------------------------------\n"
		+ "Imprimir los elementos del array multiplicados por 2\n"
		+ "--------------------------------------------------\n");
		
		/*
		 * Con una función anónima (función lambda), 
		 * multipicamos cada elemento del stream por 2
		 * 
		 * Buscamos definir de forma anónima:
		 *   int doble(int n){
		 *      return 2*n;
		 *   }
		 * 
		 */
		
		Arrays.stream(array).map(i -> i)
			.forEach(System.out::println);
		
		/*
		 * Ahora imprimirmos solo los elementos pares.
		 * 
		 * Para ello, necesitamos pasar una función
		 * anónima a la función filter que devuelva un valor Booleano
		 * 
		 * Buscamos un funcionamiento similar a:
		 *      Boolean esPar(int n){
		 *        return n%2==0;
		 *      }
		 * 
		 */
		System.out.println("\n"
		+ "---------------------------------------------------\n"
		+ "Imprimir los elementos pares del array\n"
		+ "--------------------------------------------------\n");
		
		Arrays.stream(array)//.filter()
			.forEach(System.out::println);
		
		
		System.out.println("\n"
		+ "---------------------------------------------------\n"
		+ "Imprimir ordenado el array\n"
		+ "--------------------------------------------------\n");
		
		ArrayList<Integer> desordenado = new ArrayList<Integer>();
		Collections.addAll(desordenado, 100,9,5,1,0,35);
		
		//Collections.sort(desordenado, λ);
		
		System.out.println(desordenado);
		
	}

}

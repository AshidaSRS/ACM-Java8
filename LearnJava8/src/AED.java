
import java.util.Arrays;
import java.util.OptionalInt;

public class AED {

	public static void main(String[] args) {
		
		
		OptionalInt [] desordenado = {
				OptionalInt.of(99),
				OptionalInt.empty(),
				OptionalInt.of(8),
				OptionalInt.empty(),
				OptionalInt.of(93),
				OptionalInt.of(4),
				OptionalInt.of(3)
				};
		
		/*
		 * recibe como parámetro una lista cuyos elementos 
		 * pueden ser null (en este caso Optional)
		 * y devuelve una nueva lista donde únicamente se incluyen 
		 * los elementos impares contenidos en lista.
		 * 
		 */
		
		Arrays.stream(desordenado)
			.forEach(System.out::println);
		
		
	}

}

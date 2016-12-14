import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

class Quijote{
	
	public static void main(String[] args) throws IOException{
		
		String filename = "quijote.txt";
		System.out.println(Paths.get(".").toAbsolutePath().normalize().toString());
		
		/*
		 *   Este código será el que usaremos como plantilla para
		 * trabajar las herramientas presentadas. En principio solo
		 * tendremos que escribir solo funciones sobre el "stream".
		 */
		
		//Leer fichero Quijote
		
		System.out.println("\n"
		+ "---------------------------------------------------\n"
		+ "1- Primera prueba: Primeras 10 lineas -> Quijote\n"
		+ "--------------------------------------------------\n");
		
		try (Stream<String> stream = Files.lines(Paths.get(filename))) {
		    stream
		    	.forEach(System.out::println);
		}
		
		System.out.println("\n"
		+ "---------------------------------------------------\n"
		+ "2- Segunda prueba: Cuántas veces se escribe 'Cervantes'\n"
		+ "--------------------------------------------------\n");
				
		try (Stream<String> stream = Files.lines(Paths.get(filename))) {
		    stream
		        .forEach(System.out::println);
		}
		
		
		/*
		 * Ahora vamos a ver cuántas veces se dice "Sancho"
		 */
		
		System.out.println("\n"
		+ "---------------------------------------------------\n"
		+ "3- Tercera prueba: Número de lineas en las que se dice Sancho\n"
		+ "--------------------------------------------------\n");
						
		
		try (Stream<String> stream = Files.lines(Paths.get(filename))) {
		    //System.out.println(stream
		        //.filter()
		        //.map(l -> 1)
		        //.reduce()
		        //.get().intValue());
		}
		
		/*
		 * Número de palabras en "El Quijote"
		 */
		
		System.out.println("\n"
		+ "---------------------------------------------------\n"
		+ "4- Cuarta prueba: Número de palabras en 'El Quijote'\n"
		+ "--------------------------------------------------\n");
								
				
		try (Stream<String> stream = Files.lines(Paths.get(filename))) {
		//	System.out.println(stream
		}	
	}
}

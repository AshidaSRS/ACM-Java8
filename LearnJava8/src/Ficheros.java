import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Ficheros{
	public static void main(String[] args) throws IOException, InterruptedException{
		
		String filename = "/home/ignaciobll/";
		
		System.out.println(Paths.get(".").toAbsolutePath().normalize().toString());
		try (Stream<Path> stream = Files.list(Paths.get(filename))) {
		    String joined = stream
		        .map(String::valueOf)
		        .map(d -> d.replaceAll("/home/ignaciobll/", ""))
		        .filter(path -> !path.startsWith("."))
		        .sorted()
		        .collect(Collectors.joining("\n "));
		    System.out.println("List: " + joined);
		}
	}
}
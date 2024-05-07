import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class ListarArchivos {
    private static Map<String, String> archivos = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        indexarArchivos("C:/ruta/del/directorio");

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Buscar archivo por nombre");
            System.out.println("2. Listar todos los archivos ordenados alfabéticamente");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del archivo:");
                    String nombreArchivo = scanner.nextLine();
                    buscarArchivo(nombreArchivo);
                    break;
                case 2:
                    listarArchivosOrdenados();
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
    private static void indexarArchivos(String directorio) {
        try {
            Files.walk(Paths.get(directorio))
                    .filter(Files::isRegularFile)
                    .forEach(path -> archivos.put(path.getFileName().toString(), path.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void buscarArchivo(String nombreArchivo) {
        String ruta = archivos.get(nombreArchivo);
        if (ruta != null) {
            System.out.println("La ruta del archivo \"" + nombreArchivo + "\" es: " + ruta);
        } else {
            System.out.println("El archivo \"" + nombreArchivo + "\" no fue encontrado.");
        }
    }
    private static void listarArchivosOrdenados() {
        List<String> nombresOrdenados = new ArrayList<>(archivos.keySet());
        Collections.sort(nombresOrdenados);

        System.out.println("Lista de archivos ordenados alfabéticamente:");
        for (String nombre : nombresOrdenados) {
            System.out.println(nombre + ": " + archivos.get(nombre));
        }
    }
}

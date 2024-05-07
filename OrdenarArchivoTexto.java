import java.io.*;
import java.util.*;

public class OrdenarArchivoTexto {
    public static void main(String[] args) {
        // Archivo de entrada y salida
        String nombreArchivoEntrada = "entrada.txt";
        String nombreArchivoSalida = "salida_ordenada.txt";

        // Leer líneas del archivo de entrada
        List<String> lineas = leerLineasArchivo(nombreArchivoEntrada);

        // Ordenar las líneas
        Collections.sort(lineas);

        // Escribir las líneas ordenadas en el archivo de salida
        escribirLineasOrdenadas(nombreArchivoSalida, lineas);

        System.out.println("El archivo se ha ordenado correctamente.");
    }

    // Método para leer líneas de un archivo
    private static List<String> leerLineasArchivo(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineas;
    }

    // Método para escribir líneas ordenadas en un archivo
    private static void escribirLineasOrdenadas(String nombreArchivo, List<String> lineas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

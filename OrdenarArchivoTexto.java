import java.io.*;
import java.util.*;

public class OrdenarArchivoTexto {
    public static void main(String[] args) {
        String nombreArchivoEntrada = "entrada.txt";
        String nombreArchivoSalida = "salida_ordenada.txt";
        List<String> lineas = leerLineasArchivo(nombreArchivoEntrada);

        Collections.sort(lineas);
        escribirLineasOrdenadas(nombreArchivoSalida, lineas);

        System.out.println("El archivo se ha ordenado correctamente.");
    }

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

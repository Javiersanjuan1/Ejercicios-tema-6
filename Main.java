import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crear el mapa
        Map<String, Integer> mapaNumeros = new HashMap<>();

        // Agregar los números y sus representaciones en texto al mapa
        mapaNumeros.put("cero", 0);
        mapaNumeros.put("uno", 1);
        mapaNumeros.put("dos", 2);
        mapaNumeros.put("tres", 3);
        mapaNumeros.put("cuatro", 4);
        mapaNumeros.put("cinco", 5);
        mapaNumeros.put("seis", 6);
        mapaNumeros.put("siete", 7);
        mapaNumeros.put("ocho", 8);
        mapaNumeros.put("nueve", 9);
        mapaNumeros.put("diez", 10);

        // Listar el contenido del mapa
        System.out.println("Contenido del mapa:");
        for (Map.Entry<String, Integer> entry : mapaNumeros.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

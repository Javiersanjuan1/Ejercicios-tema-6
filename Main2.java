import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Character> mapaNumerosLetras = new HashMap<>();
        System.out.println("Introduzca conjuntos de pares número/letra (Ingrese -1 para salir):");
        int numero;
        char letra;
        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();
            if (numero != -1) {
                System.out.print("Letra: ");
                letra = scanner.next().charAt(0);
                mapaNumerosLetras.put(numero, letra);
            }
        } while (numero != -1);
        System.out.print("\nIntroduzca un número para recuperar su letra correspondiente (-1 para salir): ");
        int numeroRecuperar;
        do {
            numeroRecuperar = scanner.nextInt();
            if (numeroRecuperar != -1) {
                Character letraRecuperada = mapaNumerosLetras.get(numeroRecuperar);
                if (letraRecuperada != null) {
                    System.out.println("La letra correspondiente al número " + numeroRecuperar + " es: " + letraRecuperada);
                } else {
                    System.out.println("No se encontró ninguna letra correspondiente al número " + numeroRecuperar);
                }
            }
        } while (numeroRecuperar != -1);

        scanner.close();
    }
}

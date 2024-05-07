import java.util.Scanner;
import java.util.TreeSet;

class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        return this.apellido.compareTo(otraPersona.apellido);
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre;
    }
}

public class Main3 {
    public static void main(String[] args) {
        TreeSet<Persona> personas = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese pares nombre/apellido de personas (ingrese -1 para salir):");
        String nombre, apellido;
        do {
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            if (!nombre.equals("-1")) {
                System.out.print("Apellido: ");
                apellido = scanner.nextLine();
                Persona persona = new Persona(nombre, apellido);
                personas.add(persona);
            }
        } while (!nombre.equals("-1"));

        System.out.println("\nPersonas ordenadas alfabéticamente por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        scanner.close();
    }
}


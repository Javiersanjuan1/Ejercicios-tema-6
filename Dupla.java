public class Dupla {
    private Object primerDato;
    private Object segundoDato;

    // Constructor
    public Dupla(Object primerDato, Object segundoDato) {
        this.primerDato = primerDato;
        this.segundoDato = segundoDato;
    }

    // Método para obtener el primer dato
    public Object obtenerPrimerDato() {
        return primerDato;
    }

    // Método para obtener el segundo dato
    public Object obtenerSegundoDato() {
        return segundoDato;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Dupla dupla = new Dupla(10, "Hola");
        System.out.println("Primer dato: " + dupla.obtenerPrimerDato());
        System.out.println("Segundo dato: " + dupla.obtenerSegundoDato());
    }
}

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeSet;

class Venta implements Comparable<Venta> {
    private String nombreProducto;
    private String nombreCliente;
    private double precio;
    private LocalDate fecha;

    public Venta(String nombreProducto, String nombreCliente, double precio, LocalDate fecha) {
        this.nombreProducto = nombreProducto;
        this.nombreCliente = nombreCliente;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public int compareTo(Venta otraVenta) {
        int comparacionFecha = this.fecha.compareTo(otraVenta.fecha);
        if (comparacionFecha == 0) {
            int comparacionNombre = this.nombreCliente.compareTo(otraVenta.nombreCliente);
            if (comparacionNombre == 0) {
                return Double.compare(this.precio, otraVenta.precio);
            }
            return comparacionNombre;
        }
        return comparacionFecha;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", precio=" + precio +
                ", fecha=" + fecha +
                '}';
    }
}

public class Main5 {
    public static void main(String[] args) {
        TreeSet<Venta> ventas = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        System.out.println("Ingrese los datos de las ventas (Ingrese 'fin' para terminar):");
        String nombreProducto, nombreCliente, fecha;
        double precio;
        while (true) {
            System.out.print("Nombre del producto: ");
            nombreProducto = scanner.nextLine();
            if (nombreProducto.equalsIgnoreCase("fin")) {
                break;
            }
            System.out.print("Nombre del cliente: ");
            nombreCliente = scanner.nextLine();
            System.out.print("Precio: ");
            precio = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Fecha (d/m/yyyy): ");
            fecha = scanner.nextLine();
            ventas.add(new Venta(nombreProducto, nombreCliente, precio, LocalDate.parse(fecha, formatter)));
        }

        System.out.println("\nVentas ordenadas por fecha, nombre del cliente y precio:");
        for (Venta venta : ventas) {
            System.out.println(venta);
        }

        scanner.close();
    }
}
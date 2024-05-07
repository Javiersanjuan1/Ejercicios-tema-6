import java.util.*;

class Venta {
    String producto;
    String cliente;
    double precio;
    Date fecha;

    public Venta(String producto, String cliente, double precio, Date fecha) {
        this.producto = producto;
        this.cliente = cliente;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String toString() {
        return "Producto: " + producto + ", Cliente: " + cliente + ", Precio: " + precio + ", Fecha: " + fecha;
    }
}

public class RegistroVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Venta> ventas = new ArrayList<>();
        System.out.println("Ingrese los registros de ventas (producto cliente precio fecha):");
        while (scanner.hasNextLine()) {
            String[] datosVenta = scanner.nextLine().split(" ");
            if (datosVenta.length != 4) {
                break;
            }

            String producto = datosVenta[0];
            String cliente = datosVenta[1];
            double precio = Double.parseDouble(datosVenta[2]);
            String[] fechaSplit = datosVenta[3].split("/");
            int dia = Integer.parseInt(fechaSplit[0]);
            int mes = Integer.parseInt(fechaSplit[1]) - 1; // Los meses en Java son 0-indexados
            int año = Integer.parseInt(fechaSplit[2]);
            Date fecha = new Date(año - 1900, mes, dia);

            ventas.add(new Venta(producto, cliente, precio, fecha));
        }
        Collections.sort(ventas, new Comparator<Venta>() {
            public int compare(Venta v1, Venta v2) {
                int fechaComparison = v1.fecha.compareTo(v2.fecha);
                if (fechaComparison != 0) {
                    return fechaComparison;
                }
                int clienteComparison = v1.cliente.compareTo(v2.cliente);
                if (clienteComparison != 0) {
                    return clienteComparison;
                }
                return Double.compare(v1.precio, v2.precio);
            }
        });
        System.out.println("Registros de ventas ordenados:");
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }
}

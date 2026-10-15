import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int opcion;

        do{
            System.out.println("\n---Menú online MODASTYLE---");

            System.out.println("1. Registrar prendas de vestir en el catálogo de la empresa, evitando códigos duplicados.\n");
            System.out.println("2. Registrar clientes y vendedores, evitando documentos de identidad duplicados.\n");
            System.out.println("3. Registrar existencias de prendas en una sucursal, considerando su referencia, talla y color, y evitando registros de inventario duplicados para una misma combinación.\n");
            System.out.println("4. Consultar las prendas disponibles en una sucursal determinada, indicando sus tallas, colores y cantidades disponibles.\n");
            System.out.println("5. Registrar una venta de una o varias prendas, verificando que existan cantidades suficientes en el inventario de la sucursal y descontándolas una vez confirmada la venta.\n");
            System.out.println("6. Calcular el precio unitario final de cada prenda, considerando el recargo de su categoría y el descuento correspondiente a la categoría del cliente.\n");
            System.out.println("7. Calcular el valor total de una venta a partir de las cantidades compradas y los precios unitarios finales de las prendas adquiridas.\n");
            System.out.println("8. Consultar las prendas agotadas.\n");
            System.out.println("9. Consultar las ventas realizadas por un vendedor.\n");
            System.out.println("10. Consultar las compras realizadas por un cliente.\n");
            System.out.println("11. Calcular los ingresos totales generados por una sucursal.\n");
            System.out.println("12. Identificar la referencia de prenda con mayor cantidad de unidades vendidas en toda la empresa.\n");

            System.out.println("0. Salir del menú");
            System.out.print("Selecciona una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("--- REGISTRAR VENTA ---");
                    System.out.print("Ingrese el código único de la venta: ");
                    String codigoVenta = scanner.next();
                    System.out.print("Ingrese la fecha de realización (ej. DD/MM/AAAA): ");
                    String fechaActual = scanner.next();
                    System.out.print("Ingrese el ID o código de la sucursal: ");
                    Sucursal sucursalEncontrada = null; // Reemplaza esto con la búsqueda real en tu lista de sucursales
                    System.out.print("Ingrese el documento del vendedor: ");
                    Vendedor vendedorEncontrado = null; // Reemplaza esto con la búsqueda real en tu lista de vendedores
                    System.out.print("Ingrese el documento del cliente: ");
                    Cliente clienteEncontrado = null; // Reemplaza esto con la búsqueda real en tu lista de clientes
                    Venta nuevaVenta = new Venta(codigoVenta, fechaActual, sucursalEncontrada, vendedorEncontrado, clienteEncontrado);
                    boolean stockSuficiente = true;
                    List<DetalleVenta> detallesTemporal = new ArrayList<>();
                    String respuesta;
                    do {
                        System.out.print("Ingrese el código de la prenda en inventario: ");
                        Inventario inventarioSeleccionado = null; // Reemplaza esto con la búsqueda real del inventario
                        System.out.print("Ingrese la cantidad deseada: ");
                        int cantidadDeseada = scanner.nextInt();
                        if (inventarioSeleccionado != null && inventarioSeleccionado.verificarDisponibilidad(cantidadDeseada)) {
                            DetalleVenta detalle = new DetalleVenta(inventarioSeleccionado, cantidadDeseada);
                            detallesTemporal.add(detalle);
                            nuevaVenta.agregarDetalle(detalle);
                            System.out.println("¡Prenda agregada a la venta con éxito!");
                        } else {
                            System.out.println("¡Error: No hay suficiente stock o el inventario no existe!");
                            stockSuficiente = false;
                            break;
                        }
                        System.out.print("¿Desea agregar otra prenda? (s/n): ");
                        respuesta = scanner.next();
                    } while (respuesta.equalsIgnoreCase("s"));
                    if (stockSuficiente && !detallesTemporal.isEmpty()) {
                        for (DetalleVenta d : detallesTemporal) {
                            d.getInventario().descontarStock(d.getCantidadComprada());
                        }
                        nuevaVenta.confirmarVenta();
                        System.out.println("¡Venta registrada y stock descontado con éxito!");
                    } else {
                        System.out.println("La venta fue cancelada o no pudo ser procesada.");
                    }
                    break;
                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:
                    System.out.println("\n--- CONSULTAR VENTAS POR VENDEDOR ---");

                    break;

                case 10:

                    break;

                case 11:

                    break;

                case 12:

                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}

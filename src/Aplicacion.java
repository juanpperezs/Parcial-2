import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Empresa ModaStyle
        Empresa empresa= new Empresa("ModaStyle", "100000", "Carrera 17 #19-31, Armenia, Quindío", null);

        //Sucursales
        Sucursal sucursal1= new Sucursal("1021", "ModaStyle Armenia", "Av. Bolívar #19 Norte-46, Portal del Quindío", "Armenia, Quindío");
        Sucursal sucursal2= new Sucursal("1022", "ModaStyle Cali", "Calle 38N # 6N – 45, Centro Comercial Chipichape", "Cali, Valle del Cauca");

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
                    Sucursal sucursalEncontrada = null;
                    System.out.print("Ingrese el documento del vendedor: ");
                    Vendedor vendedorEncontrado = null;
                    System.out.print("Ingrese el documento del cliente: ");
                    Cliente clienteEncontrado = null;
                    Venta nuevaVenta = new Venta(codigoVenta, fechaActual, 0, vendedorEncontrado, sucursalEncontrada, clienteEncontrado);
                    boolean stockSuficiente = true;
                    List<DetalleVenta> detallesTemporal = new ArrayList<>();
                    String respuesta;
                    do {
                        System.out.print("Ingrese el código de la prenda en inventario: ");
                        Inventario inventarioSeleccionado = null;
                        System.out.print("Ingrese la cantidad deseada: ");
                        int cantidadDeseada = scanner.nextInt();
                        if (inventarioSeleccionado != null && inventarioSeleccionado.verificarDisponibilidad(cantidadDeseada)) {
                            DetalleVenta detalle = new DetalleVenta(cantidadDeseada, 0, 0, inventarioSeleccionado, nuevaVenta);
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
                    System.out.println("--- CALCULAR PRECIO UNITARIO FINAL ---");
                    System.out.print("Ingrese el código de la venta a procesar: ");
                    String codigoVentaBuscado = scanner.next();
                    Venta ventaEncontrada = null;
                    if (ventaEncontrada != null && ventaEncontrada.getListaDetalleVentas() != null) {
                        Cliente clienteActual = ventaEncontrada.getCliente();
                        System.out.println("Cliente: " + clienteActual.getNombreCompleto() + " | Categoría: " + clienteActual.getCategoriaCliente());
                        for (DetalleVenta detalle : ventaEncontrada.getListaDetalleVentas()) {
                            int precioFinal = detalle.calcularPrecioUnitarioFinal(clienteActual);
                            System.out.println("Prenda: " + detalle.getInventario().getPrenda().getNombrePrenda() +
                                    " | Precio Unitario Final: $" + precioFinal);
                        }
                    } else {
                        System.out.println("¡Error: No se encontró la venta especificada!");
                    }
                    break;
                case 7:
                    System.out.println("--- CALCULAR VALOR TOTAL DE LA VENTA ---");
                    System.out.print("Ingrese el código único de la venta a consultar: ");
                    String codigoVentaTotalBuscado = scanner.next();
                    Venta ventaParaTotal = null;
                    if (ventaParaTotal != null) {
                        double valorTotalVenta = 0;
                        if (ventaParaTotal.getListaDetalleVentas() != null) {
                            for (DetalleVenta detalleActual : ventaParaTotal.getListaDetalleVentas()) {
                                double subtotalDetalle = detalleActual.getSubtotal();
                                valorTotalVenta += subtotalDetalle;
                            }
                        }
                        System.out.println("El valor total de la venta (" + ventaParaTotal.getCodigoUnicoVenta() + ") es: $" + valorTotalVenta);
                    } else {
                        System.out.println("¡Error: No se encontró la venta con el código ingresado!");
                    }
                    break;
                case 8:
                    System.out.println("--- REPORTE DE INVENTARIO AGOTADO ---");
                    boolean hayAgotados = false;
                    for (Sucursal sucursalActual : empresa.getListaSucursales()) {
                        for (Inventario inv : sucursalActual.getListaInventarios()) {
                            if (inv.getCantidadDisponibleInventario() == 0) {
                                System.out.println("Sucursal: " + sucursalActual.getCiudad() +
                                        " | Prenda: " + inv.getPrenda().getNombrePrenda() +
                                        " | Color: " + inv.getColorInventario());
                                hayAgotados = true;
                            }
                        }
                    }
                    if (!hayAgotados) {
                        System.out.println("¡No hay inventario agotado registrado en las sucursales!");
                    }
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

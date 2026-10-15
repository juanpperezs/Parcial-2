import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Empresa ModaStyle
        Empresa empresa= new Empresa("ModaStyle", "100000", "Carrera 17 #19-31, Armenia, Quindío", null);

        //Sucursales
        Sucursal sucursalArmenia= new Sucursal("S01", "ModaStyle Armenia", "Avenida Bolívar #19 Norte-46, Portal del Quindío", "Armenia, Quindío");
        Sucursal sucursalCali = new Sucursal("S02", "ModaStyle Cali", "Calle 38N # 6N – 45, Centro Comercial Chipichape", "Cali, Valle del Cauca");
        Sucursal sucursalCartagena= new Sucursal("S03", "ModaStyle Cartagena", "Carrera. 11 #39-21, San Diego", "Cartagena de indias, Bolívar");
        empresa.agregarSucursal(sucursalArmenia);
        empresa.agregarSucursal(sucursalCali);
        empresa.agregarSucursal(sucursalCartagena);

        //Prendas
        Prenda camisa= new Prenda("P1", "Camisa Polo", "Polo Club", 135000, CategoriaPrenda.CAMISETA);
        Prenda pantalon= new Prenda("P2", "Pantalón carpintero", "KOAJ", 90000, CategoriaPrenda.PANTALON);
        Prenda vestido= new Prenda("P3", "Vestido de grado", "La lapita", 320000, CategoriaPrenda.VESTIDO);
        Prenda chaqueta= new Prenda("P4", "Chaqueta impermeable", "Decathlon", 350000, CategoriaPrenda.CHAQUETA);
        Prenda calzado= new Prenda("P5", "Guayos Mercurial Vapor 16", "Nike", 260000, CategoriaPrenda.CALZADO);

        //Inventario
        Inventario inventario1= new Inventario(sucursalArmenia, camisa, Talla.M, "Blanco", 99, null);


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
                    System.out.print("---REGISTRAR PRENDAS---"+ "\n");

                    System.out.print("Ingrese el código de la sucursal: ");
                    String codSucursal1 = scanner.nextLine();

                    Sucursal sucursalActual = empresa.buscarSucursalPorCodigo(codSucursal1);

                    if (sucursalActual == null) {
                        System.out.println("---Error: La sucursal con el código " + codSucursal1 + " no existe.");
                    } else {
                        // 4. Solicitar los datos para la nueva prenda
                        System.out.print("Ingrese el código único de la prenda: ");
                        String codigoPrenda = scanner.nextLine();

                        // Verificar si la prenda ya existe en esta sucursal
                        boolean existePrenda = sucursalActual.verificarPrenda(codigoPrenda);
                        if (existePrenda) {
                            System.out.println("---Error: La prenda ya existe en la sucursal " + sucursalActual.getNombre() + ".");
                        } else {
                            System.out.print("Ingrese el nombre de la prenda: ");
                            String nombre = scanner.nextLine();

                            System.out.print("Ingrese la marca: ");
                            String marca = scanner.nextLine();

                            System.out.print("Ingrese el precio base: ");
                            double precioBase = scanner.nextDouble();
                            scanner.nextLine(); // Limpiar el buffer del scanner

                            // Crear la prenda y agregarla a la sucursal seleccionada
                            Prenda nuevaPrenda = new Prenda(codigoPrenda, nombre, marca, calzado.getPrecioBasePrenda());
                            sucursalActual.agregarPrenda(nuevaPrenda);

                            System.out.println("-> Prenda agregada exitosamente a la sucursal: " + sucursalActual.getNombre());
                        }
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el documento de identidad: ");
                    String documento = scanner.nextLine();

                    /*if (Cliente.existeCliente(documento)) {
                        System.out.println("-> Error: Ya existe un cliente registrado con la cédula " + documento);
                    } else {
                        System.out.print("Ingrese el nombre completo del cliente: ");
                        String nombre = scanner.nextLine();

                        Cliente.registrarCliente(new Cliente(documento, nombre));
                        System.out.println("-> Cliente registrado exitosamente.");
                    }*/
                    break;

                case 3:
                    System.out.print("---REGISTRAR EXISTENCIAS DE PRENDAS---"+"\n");

                    System.out.print("Ingrese el código de la prenda: ");
                    String codigoIngresado = scanner.nextLine();

                    sucursalActual= empresa.buscarSucursalPorCodigo(codigoIngresado);

                    Prenda prendaBase = sucursalActual.buscarPrendaPorCodigo(codigoIngresado);

                    if (prendaBase == null) {
                        System.out.println("-> Error: El código no existe en el catálogo. Regístrela en la Opción 1.");
                    } else {
                        System.out.print("Ingrese la talla: ");
                        String talla = scanner.nextLine();

                        System.out.print("Ingrese el color: ");
                        String color = scanner.nextLine();

                        System.out.print("Ingrese la cantidad a registrar: ");
                        int cantidad = scanner.nextInt();
                        scanner.nextLine();

                        boolean existeCombinacion = sucursalActual.verificarInventarioCombinacion(codigoIngresado, talla, color);

                        if (existeCombinacion) {
                            Inventario invExistente = sucursalActual.buscarInventarioPorCombinacion(codigoIngresado, talla, color);
                            invExistente.setCantidadDisponibleInventario(invExistente.getCantidadDisponibleInventario() + cantidad);
                            System.out.println("--- Se sumaron las unidades al inventario existente.---");
                        } else { //talla da error al no pertenecer a String
                            Inventario nuevoInventario = new Inventario(prendaBase, talla, color, cantidad);
                            sucursalActual.getListaInventarios().add(nuevoInventario);
                            System.out.println("--- Nueva combinación registrada con éxito.---");
                        }
                    }
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

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Empresa ModaStyle
        Empresa empresa= new Empresa("ModaStyle", "100000", "Carrera 17 #19-31, Armenia, Quindío", null, null);

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

        //Inventario sucursal Armenia
        Inventario inventarioArmenia1= new Inventario(sucursalArmenia, camisa, Talla.M, "Blanco", 99, null);
        Inventario inventarioArmenia2 = new Inventario(sucursalArmenia, pantalon, Talla.S, "Blanco", 99, null);
        Inventario inventarioArmenia3 = new Inventario(sucursalArmenia, vestido, Talla.XL, "Blanco", 99, null);
        Inventario inventarioArmenia4 = new Inventario(sucursalArmenia, chaqueta, Talla.L, "Blanco", 99, null);
        Inventario inventarioArmenia5 = new Inventario(sucursalArmenia, calzado, Talla.TALLA_37, "Blanco", 99, null);
        sucursalArmenia.getListaInventarios().add(inventarioArmenia1);
        sucursalArmenia.getListaInventarios().add(inventarioArmenia2);
        sucursalArmenia.getListaInventarios().add(inventarioArmenia3);
        sucursalArmenia.getListaInventarios().add(inventarioArmenia4);
        sucursalArmenia.getListaInventarios().add(inventarioArmenia5);

        //Inventario sucursal Cali
        Inventario inventarioCali1 = new Inventario(sucursalCali, camisa, Talla.L, "Negro", 80, null);
        Inventario inventarioCali2 = new Inventario(sucursalCali, pantalon, Talla.L, "Negro", 80, null);
        Inventario inventarioCali3 = new Inventario(sucursalCali, vestido, Talla.M, "Negro", 80, null);
        Inventario inventarioCali4 = new Inventario(sucursalCali, chaqueta, Talla.S, "Negro", 80, null);
        Inventario inventarioCali5 = new Inventario(sucursalCali, calzado, Talla.TALLA_40, "Negro", 80, null);
        sucursalCali.getListaInventarios().add(inventarioCali1);
        sucursalCali.getListaInventarios().add(inventarioCali2);
        sucursalCali.getListaInventarios().add(inventarioCali3);
        sucursalCali.getListaInventarios().add(inventarioCali4);
        sucursalCali.getListaInventarios().add(inventarioCali5);

        //Inventario sucursal Cartagena
        Inventario inventarioCartagena1 = new Inventario(sucursalCartagena, camisa, Talla.S, "Azul", 60, null);
        Inventario inventarioCartagena2 = new Inventario(sucursalCartagena, pantalon, Talla.M, "Azul", 60, null);
        Inventario inventarioCartagena3 = new Inventario(sucursalCartagena, vestido, Talla.L, "Azul", 60, null);
        Inventario inventarioCartagena4 = new Inventario(sucursalCartagena, chaqueta, Talla.XL, "Azul", 60, null);
        Inventario inventarioCartagena5 = new Inventario(sucursalCartagena, calzado, Talla.TALLA_38, "Azul", 60, null);
        sucursalCartagena.getListaInventarios().add(inventarioCartagena1);
        sucursalCartagena.getListaInventarios().add(inventarioCartagena2);
        sucursalCartagena.getListaInventarios().add(inventarioCartagena3);
        sucursalCartagena.getListaInventarios().add(inventarioCartagena4);
        sucursalCartagena.getListaInventarios().add(inventarioCartagena5);

        //Vendedores de las 3 sucursales
        Vendedor Camilo= new Vendedor("1001", "Camilo Pulgarin Machuca", "camilin123@gmail.com", "31301", "V001", "06/Octubre/2020", 1500000, sucursalArmenia, null);
        Vendedor Cristina= new Vendedor("1002", "Cristina Pulido Juarez", "Cristi1602@gmail.com", "31302", "V002", "10/Febrero/2021", 1500000, sucursalArmenia, null);
        sucursalArmenia.getListaVendedores().add(Camilo);
        sucursalArmenia.getListaVendedores().add(Cristina);

        Vendedor Sergio= new Vendedor("1003", "Sergio Castañeda Benavidez", "Sergio10@gmail.com", "31303", "V003", "24/Agosto/2019",  1500000, sucursalCali, null);
        Vendedor Valentina = new Vendedor("1004", "Valentina Gomez Restrepo", "ValenGomez20@gmail.com", "31304", "V004", "15/Marzo/2021", 1500000, sucursalCali, null);
        sucursalCali.getListaVendedores().add(Sergio);
        sucursalCali.getListaVendedores().add(Valentina);

        Vendedor Mateo = new Vendedor("1005", "Mateo Rios Cardona", "MateoRios05@gmail.com", "31305", "V005", "02/Enero/2020", 1500000, sucursalCartagena, null);
        Vendedor Juliana = new Vendedor("1006", "Juliana Marin Lopez", "JulianaMarin@gmail.com", "31306", "V006", "18/Julio/2022", 1500000, sucursalCartagena, null);
        sucursalCartagena.getListaVendedores().add(Mateo);
        sucursalCartagena.getListaVendedores().add(Juliana);

        //Clientes
        Cliente cliente1= new Cliente("2001", "Julio Encizo Perez", "Encizo43@gmail.com", "31401", "C001", CategoriaCliente.BRONCE, null);
        Cliente cliente2 = new Cliente("2002", "Francisco Rodriguez Mendez", "FranciscoRM@gmail.com", "31402", "C002", CategoriaCliente.PLATA, null);
        Cliente cliente3 = new Cliente("2003", "Victoria Suarez Lopez", "VictoriaGanadora@gmail.com", "31403", "C003", CategoriaCliente.ORO, null);
        empresa.getListaClientes().add(cliente1);
        empresa.getListaClientes().add(cliente2);
        empresa.getListaClientes().add(cliente3);

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

            switch (opcion) {
                case 1:
                    System.out.println("--- REGISTRAR PRENDAS ---");
                    System.out.print("Ingrese el código de la sucursal: ");
                    String codigoSucursalIngresado = scanner.nextLine();
                    Sucursal sucursalEncontrada = empresa.buscarSucursalPorCodigo(codigoSucursalIngresado);
                    if (sucursalEncontrada == null) {
                        System.out.println("---Error: La sucursal con el código " + codigoSucursalIngresado + " no existe.");
                    } else {
                        System.out.print("Ingrese el código único de la prenda: ");
                        String codigoPrendaIngresado = scanner.nextLine();
                        boolean laPrendaYaExiste = false;
                        for (Prenda prendaActual : empresa.getListaPrendas()) {
                            if (prendaActual.getCodigoUnicoPrenda().equalsIgnoreCase(codigoPrendaIngresado)) {
                                laPrendaYaExiste = true;
                                break;
                            }
                        }
                        if (laPrendaYaExiste) {
                            System.out.println("---Error: La prenda ya existe en el sistema.");
                        } else {
                            System.out.print("Ingrese el nombre de la prenda: ");
                            String nombrePrendaIngresado = scanner.nextLine();
                            System.out.print("Ingrese la marca: ");
                            String marcaPrendaIngresado = scanner.nextLine();
                            System.out.print("Ingrese el precio base: ");
                            int precioBaseIngresado = scanner.nextInt();
                            scanner.nextLine();
                            Prenda nuevaPrendaCreada = new Prenda(codigoPrendaIngresado, nombrePrendaIngresado, marcaPrendaIngresado, precioBaseIngresado, null);
                            empresa.getListaPrendas().add(nuevaPrendaCreada);
                            System.out.println("-> Prenda agregada exitosamente a la empresa.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("--- REGISTRAR CLIENTES ---");
                    System.out.print("Ingrese el documento de identidad del cliente: ");
                    String documentoIdentidadIngresado = scanner.nextLine();
                    boolean elClienteYaExiste = false;
                    for (Cliente clienteActual : empresa.getListaClientes()) {
                        if (clienteActual.getDocumentoIdentidad().equalsIgnoreCase(documentoIdentidadIngresado)) {
                            elClienteYaExiste = true;
                            break;
                        }
                    }
                    if (elClienteYaExiste) {
                        System.out.println("---Error: Ya existe un cliente registrado con la cédula " + documentoIdentidadIngresado + ".");
                    } else {
                        System.out.print("Ingrese el nombre completo del cliente: ");
                        String nombreCompletoIngresado = scanner.nextLine();
                        System.out.print("Ingrese el correo electrónico del cliente: ");
                        String correoElectronicoIngresado = scanner.nextLine();
                        System.out.print("Ingrese el número de teléfono del cliente: ");
                        String numeroTelefonoIngresado = scanner.nextLine();
                        System.out.print("Ingrese el código de afiliación del cliente: ");
                        String codigoAfiliacionIngresado = scanner.nextLine();
                        Cliente nuevoClienteCreado = new Cliente(
                                documentoIdentidadIngresado,
                                nombreCompletoIngresado,
                                correoElectronicoIngresado,
                                numeroTelefonoIngresado,
                                codigoAfiliacionIngresado,
                                null,
                                null
                        );

                        empresa.getListaClientes().add(nuevoClienteCreado);
                        System.out.println("-> Cliente registrado exitosamente en el sistema.");
                    }
                    break;
                case 3:
                    System.out.println("--- REGISTRAR EXISTENCIAS DE PRENDAS ---");
                    System.out.print("Ingrese el código de la sucursal: ");
                    codigoSucursalIngresado = scanner.nextLine();
                    sucursalEncontrada = empresa.buscarSucursalPorCodigo(codigoSucursalIngresado);
                    if (sucursalEncontrada == null) {
                        System.out.println("---Error: La sucursal con el código " + codigoSucursalIngresado + " no existe.");
                    } else {
                        System.out.print("Ingrese el código único de la prenda: ");
                        String codigoPrendaIngresado = scanner.nextLine();
                        Prenda prendaEncontrada = null;
                        for (Prenda prendaActual : empresa.getListaPrendas()) {
                            if (prendaActual.getCodigoUnicoPrenda().equalsIgnoreCase(codigoPrendaIngresado)) {
                                prendaEncontrada = prendaActual;
                                break;
                            }
                        }
                        if (prendaEncontrada == null) {
                            System.out.println("-> Error: El código no existe en el catálogo. Regístrala en la Opción 1.");
                        } else {
                            System.out.print("Ingrese la talla (ej: S, M, L): ");
                            String textoTallaIngresada = scanner.nextLine();
                            System.out.print("Ingrese el color: ");
                            String colorIngresado = scanner.nextLine();
                            System.out.print("Ingrese la cantidad a registrar: ");
                            int cantidadIngresada = scanner.nextInt();
                            scanner.nextLine();
                            boolean existeCombinacionInventario = sucursalEncontrada.verificarInventarioCombinacion(codigoPrendaIngresado, textoTallaIngresada, colorIngresado);
                            if (existeCombinacionInventario) {
                                Inventario inventarioExistente = sucursalEncontrada.buscarInventarioPorCombinacion(codigoPrendaIngresado, textoTallaIngresada, colorIngresado);
                                inventarioExistente.setCantidadDisponibleInventario(inventarioExistente.getCantidadDisponibleInventario() + cantidadIngresada);
                                System.out.println("--- Se sumaron las unidades al inventario existente. ---");
                            } else {
                                Talla tallaSeleccionada = Talla.valueOf(textoTallaIngresada.toUpperCase());
                                Inventario nuevoInventarioCreado = new Inventario(
                                        sucursalEncontrada,
                                        prendaEncontrada,
                                        tallaSeleccionada,
                                        colorIngresado,
                                        cantidadIngresada,
                                        null
                                );
                                sucursalEncontrada.getListaInventarios().add(nuevoInventarioCreado);
                                System.out.println("--- Nueva combinación registrada con éxito. ---");
                            }
                        }
                    }
                    break;
                case 4: {
                    System.out.print("Ingrese el código único de la sucursal: ");
                    String codSucursal4 = scanner.nextLine();
                    Sucursal sucursalActual = empresa.buscarSucursalPorCodigo(codSucursal4);
                    if (sucursalActual == null) {
                        System.out.println("-> Error: La sucursal con el código " + codSucursal4 + " no existe.");
                    } else {
                        System.out.println("\n--- CONSULTA PRENDAS DISPONIBLES EN: " + sucursalActual.getNombre() + " ---");
                        if (sucursalActual.getListaInventarios().isEmpty()) {
                            System.out.println("-> No hay registro de inventario en esta sucursal.");
                        } else {
                            for (Inventario inv : sucursalActual.getListaInventarios()) {
                                if (inv.getCantidadDisponibleInventario() > 0) {
                                    System.out.println("Prenda: " + inv.getPrenda().getNombrePrenda() +
                                            " | Talla: " + inv.getTalla() +
                                            " | Color: " + inv.getColorInventario() +
                                            " | Unidades: " + inv.getCantidadDisponibleInventario());
                                }
                            }
                        }
                    }
                    break;
                }
                case 5:
                    System.out.println("--- REGISTRAR VENTA ---");
                    System.out.print("Cree el código único de la venta: ");
                    String codigoVenta = scanner.next();
                    System.out.print("ingrese el ID o código de la sucursal: ");
                    String codigoSucS = scanner.next();
                    Sucursal sucursalEncontradaRegistro = empresa.buscarSucursalPorCodigo(codigoSucS);
                    if (sucursalEncontradaRegistro == null) {
                        System.out.println("¡Error: La sucursal ingresada no existe!");
                        break;
                    }
                    boolean codigoVentaDuplicado = false;
                    for (Venta v : sucursalEncontradaRegistro.getListaVentas()) {
                        if (v.getCodigoUnicoVenta().equalsIgnoreCase(codigoVenta)) {
                            codigoVentaDuplicado = true;
                            break;
                        }
                    }
                    if (codigoVentaDuplicado) {
                        System.out.println("¡Error: Ya existe una venta registrada con ese código único en esta sucursal!");
                        break;
                    }
                    System.out.print("Ingrese la fecha de realización (ej. DD/MM/AAAA): ");
                    String fechaActual = scanner.next();
                    System.out.print("Ingrese el documento del vendedor: ");
                    String docVendedor = scanner.next();
                    Vendedor vendedorEncontrado = null;
                    for (Vendedor v : sucursalEncontradaRegistro.getListaVendedores()) {
                        if (v.getDocumentoIdentidad().equalsIgnoreCase(docVendedor)) {
                            vendedorEncontrado = v;
                            break;
                        }
                    }
                    if (vendedorEncontrado == null) {
                        System.out.println("¡Error: El vendedor no existe en esta sucursal!");
                        break;
                    }
                    System.out.print("Ingrese el documento del cliente: ");
                    String docCliente = scanner.next();
                    Cliente clienteEncontrado = null;
                    for (Cliente c : empresa.getListaClientes()) {
                        if (c.getDocumentoIdentidad().equalsIgnoreCase(docCliente)) {
                            clienteEncontrado = c;
                            break;
                        }
                    }
                    if (clienteEncontrado == null) {
                        System.out.println("¡Error: El cliente no existe en la empresa!");
                        break;
                    }
                    Venta nuevaVenta = new Venta(codigoVenta, fechaActual, 0, vendedorEncontrado, sucursalEncontradaRegistro, clienteEncontrado);
                    boolean stockSuficiente = true;
                    List<DetalleVenta> detallesTemporal = new ArrayList<>();
                    String respuesta;
                    do {
                        System.out.print("Ingrese el código de la prenda en inventario: ");
                        String codPrenda = scanner.next();
                        System.out.print("Ingrese la talla: ");
                        String tallaPrenda = scanner.next();
                        System.out.print("Ingrese el color: ");
                        String colorPrenda = scanner.next();
                        Inventario inventarioSeleccionado = sucursalEncontradaRegistro.buscarInventarioPorCombinacion(codPrenda, tallaPrenda, colorPrenda);
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
                        sucursalEncontradaRegistro.getListaVentas().add(nuevaVenta);
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
                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        for (Venta v : sucursal.getListaVentas()) {
                            if (v.getCodigoUnicoVenta().equalsIgnoreCase(codigoVentaBuscado)) {
                                ventaEncontrada = v;
                                break;
                            }
                        }
                        if (ventaEncontrada != null) {
                            break;
                        }
                    }
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
                    for (Sucursal sucursal : empresa.getListaSucursales()) {
                        for (Venta v : sucursal.getListaVentas()) {
                            if (v.getCodigoUnicoVenta().equalsIgnoreCase(codigoVentaTotalBuscado)) {
                                ventaParaTotal = v;
                                break;
                            }
                        }
                        if (ventaParaTotal != null) {
                            break;
                        }
                    }
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
                    if (empresa != null && empresa.getListaSucursales() != null) {
                        for (Sucursal sucursalItem : empresa.getListaSucursales()) {
                            if (sucursalItem.getListaInventarios() != null) {
                                for (Inventario inv : sucursalItem.getListaInventarios()) {
                                    if (inv.getCantidadDisponibleInventario() == 0) {
                                        System.out.println("Sucursal: " + sucursalItem.getCiudad() +
                                                " | Prenda: " + inv.getPrenda().getNombrePrenda() +
                                                " | Color: " + inv.getColorInventario());
                                        hayAgotados = true;
                                    }
                                }
                            }
                        }
                    }
                    if (!hayAgotados) {
                        System.out.println("¡No hay inventario agotado registrado en las sucursales!");
                    }
                    break;
                case 9:

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
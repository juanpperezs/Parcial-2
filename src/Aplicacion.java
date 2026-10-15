import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int opcion;

        do{
            System.out.println("\n---Menú online MODASTYLE---");

            System.out.println("1. Registrar prendas de vestir en el catálogo de la empresa, evitando códigos duplicados.");
            System.out.println("2. Registrar clientes y vendedores, evitando documentos de identidad duplicados.\n");
            System.out.println("3. Registrar existencias de prendas en una sucursal, considerando su referencia, talla y color, y evitando registros de inventario duplicados para una misma combinación.\n");
            System.out.println("4. Consultar las prendas disponibles en una sucursal determinada, indicando sus tallas, colores y cantidades disponibles.\n");
            System.out.println("5. Registrar una venta de una o varias prendas, verificando que existan cantidades suficientes en el inventario de la sucursal y descontándolas una vez confirmada la venta.\n");
            System.out.println("6. Calcular el precio unitario final de cada prenda, considerando el recargo de su categoría y el descuento correspondiente a la categoría del cliente.\n");
            System.out.println("7. Calcular el valor total de una venta a partir de las cantidades compradas y los precios unitarios finales de las prendas adquiridas.\n");
            System.out.println("8. Consultar las prendas agotadas.\n");
            System.out.println("9. Consultar las ventas realizadas por un vendedor.\n");
            System.out.println("10. Consultar las compras realizadas por un cliente.");
            System.out.println("11. Calcular los ingresos totales generados por una sucursal.");
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

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

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

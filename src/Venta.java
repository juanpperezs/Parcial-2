public class Venta {

    //Atributos
    private String codigoUnicoVenta;
    private String fechaCRealizacionVenta;
    private int valorTotal;


    //Relaciones
    private Vendedor vendedor;
    private Sucursal sucursal;
    private Cliente cliente;

    private List<DetalleVenta> listaVentas;
}

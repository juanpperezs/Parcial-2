public class DetalleVenta {

    private int cantidadComprada;
    private int precioUnitarioFinal;
    private int subtotal;
    private Inventario inventario;
    private Venta venta;

    public DetalleVenta(int cantidadComprada, int precioUnitarioFinal, int subtotal, Inventario inventario, Venta venta) {
        this.cantidadComprada = cantidadComprada;
        this.precioUnitarioFinal = precioUnitarioFinal;
        this.subtotal = subtotal;
        this.inventario = inventario;
        this.venta = venta;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public int getPrecioUnitarioFinal() {
        return precioUnitarioFinal;
    }

    public void setPrecioUnitarioFinal(int precioUnitarioFinal) {
        this.precioUnitarioFinal = precioUnitarioFinal;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public int calcularPrecioUnitarioFinal(Cliente cliente) {

        int precioBase = this.inventario.getPrenda().getPrecioBasePrenda();
        double descuento = cliente.getCategoriaCliente().getDescuento();
        int precioFinal = (int) (precioBase * (1 - descuento));
        this.precioUnitarioFinal = precioFinal;
        return precioFinal;
    }
}
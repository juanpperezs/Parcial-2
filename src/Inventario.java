import java.util.List;

public class Inventario {
    private Sucursal sucursal;
    private Prenda prenda;
    private Talla talla;
    private String colorInventario;
    private int cantidadDisponibleInventario;

    private List<DetalleVenta> detallesVenta;

    public Inventario(Sucursal sucursal, Prenda prenda, Talla talla, String colorInventario, int cantidadDisponibleInventario, List<DetalleVenta> detallesVenta) {
        this.sucursal = sucursal;
        this.prenda = prenda;
        this.talla = talla;
        this.colorInventario = colorInventario;
        this.cantidadDisponibleInventario = cantidadDisponibleInventario;
        this.detallesVenta = detallesVenta;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public String getColorInventario() {
        return colorInventario;
    }

    public void setColorInventario(String colorInventario) {
        this.colorInventario = colorInventario;
    }

    public int getCantidadDisponibleInventario() {
        return cantidadDisponibleInventario;
    }

    public void setCantidadDisponibleInventario(int cantidadDisponibleInventario) {
        this.cantidadDisponibleInventario = cantidadDisponibleInventario;
    }

    public List<DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }
    //metodo para verificar la disponibilidad
    public boolean verificarDisponibilidad(int cantidadSolicitada) {
        return this.cantidadDisponibleInventario >= cantidadSolicitada;
    }
    //metodo para descontar el stock
    public void descontarStock(int cantidadVendida) {
        if (verificarDisponibilidad(cantidadVendida)) {
            this.cantidadDisponibleInventario -= cantidadVendida;
        }
    }
    //metodo para identificar si una prenda esta agotada
    public boolean estaAgotado() {
        return this.cantidadDisponibleInventario <= 0;
    }
}
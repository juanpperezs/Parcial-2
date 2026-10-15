import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {


    private String codigoVendedor;
    private String fechaContratacionVendedor;
    private int salarioBasicoVendedor;
    private Sucursal sucursal;
    private List<DetalleVenta> listaDetalleVentas;
    private List<Venta> historialVentas;

    public Vendedor(String codigoVendedor, String fechaContratacionVendedor, int salarioBasicoVendedor, String sucursalVendedor, String historialVentasVendedor) {
        this.codigoVendedor = codigoVendedor;
        this.fechaContratacionVendedor = fechaContratacionVendedor;
        this.salarioBasicoVendedor = salarioBasicoVendedor;
        this.sucursal = sucursal;
        this.listaDetalleVentas = new ArrayList<DetalleVenta>();
    }
    public boolean verificarVenta(String codigoVenta) {
        boolean existe = false;
        for (Venta venta : historialVentas) {
            if (venta.getCodigoUnicoVenta().equals(codigoVenta)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public boolean registrarVenta(Venta venta) {
        boolean agregado = false;
        boolean existe = verificarVenta(venta.getCodigoUnicoVenta());
        if (existe == false) {
            historialVentas.add(venta);
            agregado = true;
        }
        return agregado;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public String getFechaContratacionVendedor() {
        return fechaContratacionVendedor;
    }

    public void setFechaContratacionVendedor(String fechaContratacionVendedor) {
        this.fechaContratacionVendedor = fechaContratacionVendedor;
    }

    public int getSalarioBasicoVendedor() {
        return salarioBasicoVendedor;
    }

    public void setSalarioBasicoVendedor(int salarioBasicoVendedor) {
        this.salarioBasicoVendedor = salarioBasicoVendedor;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public List<DetalleVenta> getListaDetalleVentas() {
        return listaDetalleVentas;
    }

    public void setListaDetalleVentas(List<DetalleVenta> listaDetalleVentas) {
        this.listaDetalleVentas = listaDetalleVentas;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "codigoVendedor='" + codigoVendedor + '\'' +
                ", fechaContratacionVendedor='" + fechaContratacionVendedor + '\'' +
                ", salarioBasicoVendedor=" + salarioBasicoVendedor +
                ", sucursal=" + sucursal +
                ", listaDetalleVentas=" + listaDetalleVentas +
                '}';
    }
}
import java.util.ArrayList;
import java.util.List;
public class Venta {

    //Atributos
    private String codigoUnicoVenta;
    private String fechaCRealizacionVenta;
    private int valorTotal;


    //Relaciones
    private Vendedor vendedor;
    private Sucursal sucursal;
    private Cliente cliente;

    private List<Venta> listaVentas;

    public Venta(String codigoUnicoVenta, String fechaCRealizacionVenta, int valorTotal, Vendedor vendedor, Sucursal sucursal, Cliente cliente) {
        this.codigoUnicoVenta = codigoUnicoVenta;
        this.fechaCRealizacionVenta = fechaCRealizacionVenta;
        this.valorTotal = valorTotal;
        this.vendedor = vendedor;
        this.sucursal = sucursal;
        this.cliente = cliente;

        listaVentas= new ArrayList<>();
    }

    public String getCodigoUnicoVenta() {
        return codigoUnicoVenta;
    }

    public void setCodigoUnicoVenta(String codigoUnicoVenta) {
        this.codigoUnicoVenta = codigoUnicoVenta;
    }

    public String getFechaCRealizacionVenta() {
        return fechaCRealizacionVenta;
    }

    public void setFechaCRealizacionVenta(String fechaCRealizacionVenta) {
        this.fechaCRealizacionVenta = fechaCRealizacionVenta;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }
}

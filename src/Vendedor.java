import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {


    private String codigoVendedor;
    private String fechaContratacionVendedor;
    private int salarioBasicoVendedor;
    private Sucursal sucursal;
    private List<Venta> historialVentas;

    public Vendedor(String documentoIdentidad, String nombreCompleto, String correoElectronico, String numeroTelefono, String codigoVendedor, String fechaContratacionVendedor, int salarioBasicoVendedor, Sucursal sucursal, List<Venta> historialVentas) {
        super(documentoIdentidad, nombreCompleto, correoElectronico, numeroTelefono);
        this.codigoVendedor = codigoVendedor;
        this.fechaContratacionVendedor = fechaContratacionVendedor;
        this.salarioBasicoVendedor = salarioBasicoVendedor;
        this.sucursal = sucursal;

        if (historialVentas == null) {
            this.historialVentas = new ArrayList<>();
        } else {
            this.historialVentas = historialVentas;
        }
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

    public List<Venta> getHistorialVentas() {
        return historialVentas;
    }
    public void setHistorialVentas(List<Venta> historialVentas) {
        this.historialVentas = historialVentas;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "codigoVendedor='" + codigoVendedor + '\'' +
                ", fechaContratacionVendedor='" + fechaContratacionVendedor + '\'' +
                ", salarioBasicoVendedor=" + salarioBasicoVendedor +
                ", sucursal=" + sucursal +
                ", historialVentas=" + historialVentas +
                '}';
    }
}
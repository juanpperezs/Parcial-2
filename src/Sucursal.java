import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String codigoUnico;
    private String nombre;
    private String direccion;
    private String ciudad;

    private List<Inventario> listaInventarios;
    private List<Vendedor> listaVendedores;
    private List<Venta> listaVentas;

    public Sucursal(String codigoUnico, String nombre, String direccion, String ciudad) {
        this.codigoUnico = codigoUnico;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.listaInventarios = new ArrayList<Inventario>();
        this.listaVendedores = new ArrayList<Vendedor>();
        this.listaVentas = new ArrayList<Venta>();
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }
    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Inventario> getListaInventarios() { return listaInventarios; }
    public void setListaInventarios(List<Inventario> listaInventarios) { this.listaInventarios = listaInventarios; }

    public List<Vendedor> getListaVendedores() { return listaVendedores; }
    public void setListaVendedores(List<Vendedor> listaVendedores) { this.listaVendedores = listaVendedores; }

    public List<Venta> getListaVentas() { return listaVentas; }
    public void setListaVentas(List<Venta> listaVentas) { this.listaVentas = listaVentas; }

    public boolean siExistePrendaEnSucursal(String codigoPrendaBuscada) {
        for (Inventario inventarioActual : listaInventarios) {
            if (inventarioActual.getPrenda().getCodigoUnicoPrenda().equalsIgnoreCase(codigoPrendaBuscada)) {
                return true;
            }
        }
        return false;
    }
}
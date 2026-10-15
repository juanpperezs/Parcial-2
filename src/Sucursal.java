import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String codigoUnico;
    private String nombre;
    private String direccion;
    private String ciudad;

    private List<Inventario> ListaInventarios;
    private List<Vendedor> ListaVendedores;
    private List<Venta> ListaVentas;

    public Sucursal(String codigoUnico, String nombre, String direccion, String ciudad) {
        this.codigoUnico = codigoUnico;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.ListaInventarios = new ArrayList<Inventario>();
        this.ListaVendedores = new ArrayList<Vendedor>();
        this.ListaVentas = new ArrayList<Venta>();
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

    public List<Inventario> getListaInventarios() { return ListaInventarios; }
    public void setListaInventarios(List<Inventario> listaInventarios) { ListaInventarios = listaInventarios; }

    public List<Vendedor> getListaVendedores() { return ListaVendedores; }
    public void setListaVendedores(List<Vendedor> listaVendedores) { ListaVendedores = listaVendedores; }

    public List<Venta> getListaVentas() { return ListaVentas; }
    public void setListaVentas(List<Venta> listaVentas) { ListaVentas = listaVentas; }
}

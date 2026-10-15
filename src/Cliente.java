import java.util.List;

public class Cliente extends Persona{
    private String codigoAfiliacion;

    //Relación con categoriaCliente
    private CategoriaCliente categoriaCliente;

    //Relación con lista de ventas
    private List<Venta> listaVentas;

    //Constructor
    public Cliente(String documentoIdentidad, String nombreCompleto, String correoElectronico, String numeroTelefono, String codigoAfiliacion, CategoriaCliente categoriaCliente, List<Venta> listaVentas) {
        super(documentoIdentidad, nombreCompleto, correoElectronico, numeroTelefono);
        this.codigoAfiliacion = codigoAfiliacion;
        this.categoriaCliente = categoriaCliente;
        this.listaVentas = listaVentas;
    }
    //metodo para verificar compras
    public boolean verificarCompra(String codigoVenta) {
        boolean existe = false;
        for (Venta venta : listaVentas) {
            if (venta.getCodigoUnicoVenta().equals(codigoVenta)) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    //metodo para agregar compras
    public boolean agregarCompra(Venta venta) {
        boolean agregado = false;
        boolean existe = verificarCompra(venta.getCodigoUnicoVenta());
        if (!existe) {
            listaVentas.add(venta);
            agregado = true;
        }
        return agregado;
    }

    public String getCodigoAfiliacion() {
        return codigoAfiliacion;
    }
    public void setCodigoAfiliacion(String codigoAfiliacion) {
        this.codigoAfiliacion = codigoAfiliacion;
    }

    public CategoriaCliente getCategoriaCliente() {
        return categoriaCliente;
    }
    public void setCategoriaCliente(CategoriaCliente categoriaCliente) {
        this.categoriaCliente = categoriaCliente;
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }
    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

}

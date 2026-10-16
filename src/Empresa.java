import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombreComercial;
    private String nit;
    private String direccionPrincipal;
    private List<Sucursal> listaSucursales;
    private List<Cliente> listaClientes;
    private List<Prenda> listaPrendas;

    public Empresa(String nombreComercial, String nit, String direccionPrincipal, List<Sucursal> listaSucursales, List<Cliente> listaClientes) {
        this.nombreComercial = nombreComercial;
        this.nit = nit;
        this.direccionPrincipal = direccionPrincipal;
        this.listaPrendas = new ArrayList<>();

        //Condición que identifica si existe lista de ventas, si no la existe, la crea
        if (listaSucursales != null){
            this.listaSucursales = listaSucursales;
        } else  {
            this.listaSucursales = new ArrayList<>();
        }

        if (listaClientes != null){
            this.listaClientes = listaClientes;
        } else   {
            this.listaClientes = new ArrayList<>();
        }
    }


    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccionPrincipal() {
        return direccionPrincipal;
    }

    public void setDireccionPrincipal(String direccionPrincipal) {
        this.direccionPrincipal = direccionPrincipal;
    }

    public List<Sucursal> getListaSucursales() {
        return listaSucursales;
    }
    public void setListaSucursales(List<Sucursal> listaSucursales) {
        this.listaSucursales = listaSucursales;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Prenda> getListaPrendas() {
        return listaPrendas;
    }
    public void setListaPrendas(List<Prenda> listaPrendas) {
        this.listaPrendas = listaPrendas;
    }
    //metodo para verificar sucursales
    public boolean verificarSucursal(String codigoUnicoSucursal) {
        boolean existe = false;
        for (Sucursal sucursal : listaSucursales) {
            if (sucursal.getCodigoUnico().equals(codigoUnicoSucursal)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    //metodo para agregar sucursales
    public boolean agregarSucursal(Sucursal sucursal) {
        boolean agregado = false;
        boolean existe = verificarSucursal(sucursal.getCodigoUnico());
        if (!existe) {
            listaSucursales.add(sucursal);
            agregado = true;
        }
        return agregado;
    }

    //metodo para obtener la prenda mas vendida
    public Prenda obtenerPrendaMasVendida() {
        if (listaSucursales == null || listaSucursales.isEmpty()) {
            return null;
        }
        Prenda prendaMasVendida = null;
        int mayorCantidadVendida = 0;
        for (Sucursal sucursal : listaSucursales) {
            for (Venta venta : sucursal.getListaVentas()) {
                for (DetalleVenta detalle : venta.getListaDetalleVentas()) {
                    Prenda prendaActual = detalle.getInventario().getPrenda();
                    int totalVentasDeEstaPrenda = 0;

                    for (Sucursal sucursalComparacion : listaSucursales) {
                        for (Venta ventaComparacion : sucursalComparacion.getListaVentas()) {
                            for (DetalleVenta detalleComparacion : ventaComparacion.getListaDetalleVentas()) {
                                if (detalleComparacion.getInventario().getPrenda().equals(prendaActual)) {
                                    totalVentasDeEstaPrenda += detalleComparacion.getCantidadComprada();
                                }
                            }
                        }
                    }

                    if (totalVentasDeEstaPrenda > mayorCantidadVendida) {
                        mayorCantidadVendida = totalVentasDeEstaPrenda;
                        prendaMasVendida = prendaActual;
                    }
                }
            }
        }
        return prendaMasVendida;
    }
    //Metodo para buscar sucursales (codigo de scursal encontrado o no encontrado)
    public Sucursal buscarSucursalPorCodigo(String codigoBuscado) {
        boolean existe = false;
        Sucursal sucursalEncontrada = null;

        for (Sucursal sucursal : listaSucursales) {
            if (sucursal.getCodigoUnico().equalsIgnoreCase(codigoBuscado)) {
                existe = true;
                sucursalEncontrada = sucursal;
                break;
            }
        }

        return sucursalEncontrada;
    }
    public boolean verificarPrenda(String codigoBuscado) {
        for (Prenda prendaActual : listaPrendas) {
            if (prendaActual.getCodigoUnicoPrenda().equalsIgnoreCase(codigoBuscado)) {
                return true;
            }
        }
        return false;
    }
    public boolean agregarPrenda(Prenda prendaNueva) {
        boolean existe = verificarPrenda(prendaNueva.getCodigoUnicoPrenda());
        if (!existe) {
            listaPrendas.add(prendaNueva);
            return true;
        }
        return false;
    }
}
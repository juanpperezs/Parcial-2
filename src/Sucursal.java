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


    //Metodo  para verificar si existe prenda
    public boolean verificarPrenda(String codigoBuscado) {
    boolean existe = false;
        for (Prenda prendaActual : listaPrendas) {
            if (prendaActual.getCodigoUnicoPrenda().equalsIgnoreCase(codigoBuscado)) {
                existe = true;
            }
        }
        return existe;
    }


    //Metodo para agregar prenda
    public boolean agregarPrenda(Prenda prenda) {
    boolean agregado = false;
    boolean existe = verificarPrenda(prenda.getCodigoUnicoPrenda());
        if (!existe) {
            listaPrendas.add(prenda);
            agregado = true;
        }
        return agregado;
    }

    //Metodo para verificar si existe vendedor
    public boolean verificarVendedor(String documentoBuscado) {
        boolean existe = false;
        for (Vendedor vendedorActual : listaVendedores) {
            if (vendedorActual.getDocumentoIdentidad().equalsIgnoreCase(documentoBuscado)) {
                existe = true;
            }
        }
        return existe;
    }

    //Metodo para verificar si existe cliente
    public boolean verificarCliente(String documentoBuscado) {
        boolean existe = false;
        for (Cliente clienteActual : listaClientes) {
            if (clienteActual.getDocumentoIdentidad().equalsIgnoreCase(documentoBuscado)) {
                existe = true;
            }
        }
        return existe;
    }

    //Metodo para agregar cliente
    public boolean agregarCliente(Cliente cliente) {
    boolean agregado = false;
    boolean existe = verificarCliente(cliente.getDocumentoIdentidad());
        if (!existe) {
        listaClientes.add(cliente);
        agregado = true;
    }
    return agregado;
}

    //Metodo para agregar vendedor
    public boolean agregarVendedor(Vendedor vendedor) {
        boolean agregado = false;
    boolean existe = verificarVendedor(vendedor.getDocumentoIdentidad());
        if (!existe) {
            listaVendedores.add(vendedor);
            agregado = true;
        }
        return agregado;
    }

    //Metodo para verificar si existe codigo de prenda
    public boolean verificarCodigoPrenda(String codigoBuscado) {
    boolean existe = false;
    for (Prenda prendaActual : listaPrendas) {
        if (prendaActual.getCodigoUnicoPrenda().equalsIgnoreCase(codigoBuscado)) {
            existe = true;
        }
    }
    return existe;
}

    //Metodo para buscar prenda con código
    public Prenda buscarPrendaPorCodigo(String codigoBuscado) {
        Prenda prendaEncontrada = null;
        for (Prenda prendaActual : listaPrendas) {
            if (prendaActual.getCodigoUnicoPrenda().equalsIgnoreCase(codigoBuscado)) {
                prendaEncontrada = prendaActual;
            }
        }
        return prendaEncontrada;
    }

    //Metodo para verificar si la combinacio existe
    public boolean verificarInventarioCombinacion(String codigo, String talla, String color) {
        boolean existe = false;
        for (Inventario inv : listaInventarios) {
            if (inv.getPrenda().getCodigoUnicoPrenda().equalsIgnoreCase(codigo) && inv.getTalla().equalsIgnoreCase(talla) && inv.getColorInventario().equalsIgnoreCase(color)) {
                existe = true;
            }
        }
        return existe;
    }

    //Metodo para buscar la combinacion en inventario
    public Inventario buscarInventarioPorCombinacion(String codigo, String talla, String color) {
        Inventario inventarioEncontrado = null;
        for (Inventario inv : listaInventarios) {
            if (inv.getPrenda().getCodigoUnicoPrenda().equalsIgnoreCase(codigo) && inv.getTalla().equalsIgnoreCase(talla) && inv.getColorInventario().equalsIgnoreCase(color)) {
                inventarioEncontrado = inv;
            }
        }
        return inventarioEncontrado;
    }
    //Metodo




}
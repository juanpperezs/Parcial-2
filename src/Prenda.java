import java.util.List;

public class Prenda {
    private String codigoUnicoPrenda;
    private String nombrePrenda;
    private String marcaPrenda;
    private int precioBasePrenda;
    private CategoriaPrenda categoriaPrenda;

    public Prenda(String codigoUnicoPrenda, String nombrePrenda, String marcaPrenda, int precioBasePrenda, CategoriaPrenda categoriaPrenda) {
        this.codigoUnicoPrenda = codigoUnicoPrenda;
        this.nombrePrenda = nombrePrenda;
        this.marcaPrenda = marcaPrenda;
        this.precioBasePrenda = precioBasePrenda;
        this.categoriaPrenda = categoriaPrenda;
    }

    public String getCodigoUnicoPrenda() {
        return codigoUnicoPrenda;
    }

    public void setCodigoUnicoPrenda(String codigoUnicoPrenda) {
        this.codigoUnicoPrenda = codigoUnicoPrenda;
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    public String getMarcaPrenda() {
        return marcaPrenda;
    }

    public void setMarcaPrenda(String marcaPrenda) {
        this.marcaPrenda = marcaPrenda;
    }

    public int getPrecioBasePrenda() {
        return precioBasePrenda;
    }

    public void setPrecioBasePrenda(int precioBasePrenda) {
        this.precioBasePrenda = precioBasePrenda;
    }

    public CategoriaPrenda getCategoriaPrenda() {
        return categoriaPrenda;
    }

    public void setCategoriaPrenda(CategoriaPrenda categoriaPrenda) {
        this.categoriaPrenda = categoriaPrenda;
    }
}

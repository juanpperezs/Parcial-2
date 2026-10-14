public enum CategoriaPrenda {
    CAMISETA(0),
    PANTALON(0),
    VESTIDO(0.10),
    CHAQUETA(0.15),
    CALZADO(0.05);

    //Creación atributo recargo
    private double recargo;

    //Constructor y getter del atributo recargo
    CategoriaPrenda(double recargo) {
        this.recargo = recargo;
    }

    public double getRecargo() {
        return recargo;
    }
}
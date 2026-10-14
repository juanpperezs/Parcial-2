public enum CategoriaCliente {
    BRONCE(0.05),
    PLATA(0.10),
    ORO(0.15);

    //Atributo descuento
    private double descuento;

    //Constructor y getter de atributo descuento
    CategoriaCliente(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }
}

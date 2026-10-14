public class Vendedor extends Persona{


        private String codigoVendedor;
        private String fechaContratacionVendedor;
        private int salarioBasicoVendedor;
        private String sucursalVendedor;
        private String historialVentasVendedor;

        public Vendedor(String codigoVendedor, String fechaContratacionVendedor, int salarioBasicoVendedor, String sucursalVendedor, String historialVentasVendedor) {
            this.codigoVendedor = codigoVendedor;
            this.fechaContratacionVendedor = fechaContratacionVendedor;
            this.salarioBasicoVendedor = salarioBasicoVendedor;
            this.sucursalVendedor = sucursalVendedor;
            this.historialVentasVendedor = historialVentasVendedor;
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

        public String getSucursalVendedor() {
            return sucursalVendedor;
        }

        public void setSucursalVendedor(String sucursalVendedor) {
            this.sucursalVendedor = sucursalVendedor;
        }

        public String getHistorialVentasVendedor() {
            return historialVentasVendedor;
        }

        public void setHistorialVentasVendedor(String historialVentasVendedor) {
            this.historialVentasVendedor = historialVentasVendedor;
        }

        @Override
        public String toString() {
            return "Vendedor{" +
                    "codigoVendedor='" + codigoVendedor + '\'' +
                    ", fechaContratacionVendedor='" + fechaContratacionVendedor + '\'' +
                    ", salarioBasicoVendedor=" + salarioBasicoVendedor +
                    ", sucursalVendedor='" + sucursalVendedor + '\'' +
                    ", historialVentasVendedor='" + historialVentasVendedor + '\'' +
                    '}';
        }
    }


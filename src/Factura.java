public class Factura {

    private String numeroPieza;

    private String descripcionPieza;

    private double precioPieza;

    private int cantidadPiezas;


    //metodos


    // Setter
    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public void setPrecioPieza(double precioPieza) {
        this.precioPieza = precioPieza;
    }

    public void setCantidadPiezas(int cantidadPiezas) {
        this.cantidadPiezas = cantidadPiezas;
    }

    //Getter


    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public double getPrecioPieza() {
        return precioPieza;
    }

    public int getCantidadPiezas() {
        return cantidadPiezas;
    }

    public double montoFactura(){
        return cantidadPiezas*precioPieza;

    }
}

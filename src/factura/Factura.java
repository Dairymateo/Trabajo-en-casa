package factura;

public class Factura {

    private String numeroPieza;

    private String descripcionPieza;

    private double precioPieza;

    private int cantidadPiezas;


   //constructores
    public Factura(String numeroPieza, String descripcionPieza, double precioPieza, int cantidadPiezas) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.precioPieza = precioPieza;
        this.cantidadPiezas = cantidadPiezas;
        if (precioPieza<0){
            precioPieza=0.0;
        }
        this.precioPieza=precioPieza;

        if(cantidadPiezas<0){
            cantidadPiezas=0;
        }
        this.cantidadPiezas=cantidadPiezas;
    }

    public Factura(){

    }




    // Setter
    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public void setPrecioPieza(double precioPieza) {
        if (precioPieza<0){
            precioPieza=0.0;
        }
        this.precioPieza=precioPieza;
    }
    public void setCantidadPiezas(int cantidadPiezas) {
        if(cantidadPiezas<0){
            cantidadPiezas=0;
        }
        this.cantidadPiezas=cantidadPiezas;
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

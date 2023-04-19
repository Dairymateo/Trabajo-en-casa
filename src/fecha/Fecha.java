package fecha;

public class Fecha {
    private int mes;

    private int dia;

    private int año;

    //constructor


    public Fecha(int mes, int dia, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    public Fecha(){

    }

    //Setter
    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setAnio(int anio) {
        this.año = año;
    }

    //getter
    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getAño() {
        return año;
    }


    //metodos
    public String mostrarFecha() {
        return mes+"/"+dia+"/"+año;
    }
}

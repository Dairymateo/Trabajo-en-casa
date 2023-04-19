package fecha;

public class Fecha {
    private int mes;

    private int dia;

    private int año;


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

    public String mostrarFecha() {
        return mes+"/"+dia+"/"+año;
    }
}

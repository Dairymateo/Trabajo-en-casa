package empleado;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;

    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;
    }
    public Empleado(){

    }

    //setter


    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    //Getter


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalarioMensual() {
        if(salarioMensual<0){
            salarioMensual=0;
        }
        return salarioMensual;

    }
}






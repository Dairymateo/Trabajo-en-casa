package frecuencia;

import java.time.LocalDate;
import java.time.Period;


public class FrecuenciasCardiacas {
    String nombre;
    String apellido;
    int dia;
    int mes;
    int año;

    //setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    //getter


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }


    public int calcularEdad(){
        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        int edad = Period.between(fechaNacimiento, fechaActual).getYears();
        return edad;
    }

    public double frecuenciaCardiacaMaxima(){
        return 220-calcularEdad();
    }


}


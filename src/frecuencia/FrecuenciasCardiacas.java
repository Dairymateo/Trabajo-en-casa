package frecuencia;

import java.time.LocalDate;
import java.time.Period;


public class FrecuenciasCardiacas {
    String nombre;
    String apellido;
    String sexo;
    int dia;
    int mes;
    int año;
    double altura;
    double peso;

    //constructor


    public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int año, String sexo, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.altura=altura;
        this.peso=peso;




    }

    public FrecuenciasCardiacas(){

    }



    //setter


    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

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

    public String getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    //metodos
    public int calcularEdad(){
        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        int edad = Period.between(fechaNacimiento, fechaActual).getYears();
        return edad;
    }

    public double frecuenciaCardiacaMaxima(){
        return 220-calcularEdad();
    }

    public String frecuenciaDeseada(){
        double v=frecuenciaCardiacaMaxima()*0.50;
        double v1=frecuenciaCardiacaMaxima()*0.80;
        return v+" - "+v1;
    }

    public double obtenerIndiceDeMasaCorporal(){
        double a2=altura*altura;
        return peso/a2*10000;
    }


}


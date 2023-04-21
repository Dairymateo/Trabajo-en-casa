package frecuencia;

import javax.sound.midi.Soundbank;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        FrecuenciasCardiacas f1 =new FrecuenciasCardiacas();
        FrecuenciasCardiacas f2;
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese su Nombre");
        String nombre = sc.nextLine();
        f1.setNombre(nombre);
        System.out.println("Ingrese su Apellido");
        String apellido = sc.nextLine();
        f1.setApellido(apellido);
        System.out.println("Ingrese su sexo");
        String sexo = sc.nextLine();
        f1.setSexo(sexo);
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Ingrese el dia (1-31)");
        int dia = Integer.parseInt(sc.nextLine());
        f1.setDia(dia);
        System.out.println("Ingrese el mes (1-12)");
        int mes = Integer.parseInt(sc.nextLine());
        f1.setMes(mes);
        System.out.println("Ingrese el año (0000)");
        int año = Integer.parseInt(sc.nextLine());
        f1.setAño(año);
        System.out.println("Ingrese su altura en cm (ej: 180): ");
        double altura = Double.parseDouble(sc.nextLine());
        f1.setAltura(altura);
        System.out.println("Ingrese su peso en Kg(ej: 88)");
        double peso = Double.parseDouble(sc.nextLine());
        f1.setPeso(peso);


        f2=new FrecuenciasCardiacas(nombre, apellido, dia, mes, año, sexo, altura, peso);





        System.out.println("========================");
        System.out.println("La persona: "+f2.getNombre()+" "+f2.getApellido());
        System.out.println("Su edad es: " +f2.calcularEdad());
        System.out.println("Su frecuencia cardiaca maxima es: " +f2.frecuenciaCardiacaMaxima());
        System.out.println("Su frecuencia cardiaca esperada debería estar entre: " +f2.frecuenciaDeseada());
        System.out.println("Su sexo es: "+f2.getSexo());
        System.out.printf("Fecha de nacimiento: " +f2.getDia()+"/"+f2.getMes()+"/"+ f1.getAño());

        System.out.println("========================");

        System.out.println("Su Estatura es: "+f2.getAltura());
        System.out.println("Su peso es: "+f2.getPeso());
        System.out.println("Su IBM es: "+f2.obtenerIndiceDeMasaCorporal());


        System.out.println("============= Tabla IBM ===========");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: Entre 18.5 y 24.9");
        System.out.println("Sobre peso: entre 25 y 29.9");
        System.out.println("Obesidad 30 o mas");













    }
}
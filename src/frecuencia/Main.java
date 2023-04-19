package frecuencia;

import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        FrecuenciasCardiacas f1 =new FrecuenciasCardiacas();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su Nombre");
        String nombre = sc.nextLine();
        f1.setNombre(nombre);
        System.out.println("Ingrese su Apellido");
        String apellido = sc.nextLine();
        f1.setApellido(apellido);
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Ingrese el dia (1-31)");
        int dia = Integer.parseInt(sc.next());
        f1.setDia(dia);
        System.out.println("Ingrese el mes (1-12)");
        int mes = Integer.parseInt(sc.next());
        f1.setMes(mes);
        System.out.println("Ingrese el año (0000)");
        int año = Integer.parseInt(sc.next());
        f1.setAño(año);

        System.out.println("========================");
        System.out.println("La persona: "+f1.getNombre()+" "+f1.getApellido());
        System.out.println("Su edad es: " +f1.calcularEdad());
        System.out.println("Su frecuencia cardiaca maxima es: " +f1.frecuenciaCardiacaMaxima());
        System.out.println("Su frecuencia cardiaca esperada debería estar entre: ");












    }
}
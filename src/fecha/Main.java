package fecha;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Fecha f1 = new Fecha();
        Fecha f2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el mes: ");
        int mes = Integer.parseInt(sc.next());
        System.out.println("Ingrese el dia: ");
        int dia = Integer.parseInt(sc.next());;
        System.out.println("Ingrese el año");
        int año = Integer.parseInt(sc.next());

        f1.setMes(mes);
        f1.setDia(dia);
        f1.setAnio(año);

        f2=new Fecha(dia, mes, año);


        System.out.println("La fecha ingresada es: " +f2.mostrarFecha());

    }
}
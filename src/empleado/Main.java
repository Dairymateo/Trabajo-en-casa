package empleado;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del primer Empleado: ");
        String Pnombre = sc.nextLine();
        System.out.println("Ingrese el nombre del segundo Empleado: ");
        String Pnombre2 = sc.nextLine();
        System.out.println("Ingrese el apellido del primer Empleado: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese el apellido del segundo Empleado: ");
        String apellido2 = sc.nextLine();
        System.out.println("Ingrese el salario mensual del primer Empleado");
        double salarioMensual = Double.parseDouble(sc.next());
        System.out.println("Ingrese el salario mensual del segundo Empleado");
        double salarioMensual2 = Double.parseDouble(sc.next());

        e1.setPnombre(Pnombre);
        e1.setApellido(apellido);
        e1.setSalarioMensual(salarioMensual);
        e2.setPnombre(Pnombre2);
        e2.setApellido(apellido2);
        e2.setSalarioMensual(salarioMensual2);


            //Empleado 1
            System.out.println("EMPLEADO 1");
            System.out.println("El nombre del empleado uno es: " +e1.getPnombre());
            System.out.println("El nombre del Apellido uno es: " +e1.getApellido());
            System.out.println("salario Mensual = " +e1.getSalarioMensual());
            System.out.println("El salario anual del empleado uno es: " +e1.salarioAnual());
            System.out.println("El salario anual con aumento del 10% es: " +e1.salarioFinal());
            System.out.println("=================================================================");

            //Empleado 2
            System.out.println("Empleado 2");
            System.out.println("El nombre del empleado dos es: " +e2.getPnombre());
            System.out.println("El nombre del Apellido dos es: " +e2.getApellido());
            System.out.println("salario Mensual = " +e2.getSalarioMensual());
            System.out.println("El salario anual del empleado dos es: " +e2.salarioAnual());
            System.out.println("El salario anual con aumento del 10% es: " +e2.salarioFinal());



        }






    }


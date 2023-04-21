package empleado;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado();
        Empleado e3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del primer Empleado: ");
        String nombre = sc.next();
        System.out.println("Ingrese el apellido del primer Empleado: ");
        String apellido = sc.next();
        System.out.println("Ingrese el salario mensual del primer Empleado");
        double salarioMensual = Double.parseDouble(sc.next());

        e1.setnombre(nombre);
        e1.setApellido(apellido);
        e1.setSalarioMensual(salarioMensual);

        System.out.println("Ingrese el nombre del segundo Empleado: ");
        nombre = sc.next();
        System.out.println("Ingrese el apellido del segundo Empleado: ");
        apellido = sc.next();
        System.out.println("Ingrese el salario mensual del primer Empleado");
        salarioMensual = Double.parseDouble(sc.next());
        e2.setnombre(nombre);
        e2.setApellido(apellido);
        e2.setSalarioMensual(salarioMensual);

        System.out.println("Ingrese el nombre del Tercer Empleado: ");
        nombre = sc.next();
        System.out.println("Ingrese el apellido del Tercer Empleado: ");
        apellido = sc.next();
        System.out.println("Ingrese el salario mensual del Tercer Empleado");
        salarioMensual = Double.parseDouble(sc.next());
        e3 = new Empleado(nombre, apellido, salarioMensual);


            //Empleado 3
            System.out.println("EMPLEADO 1");
            System.out.println("El nombre del empleado uno es: " +e3.getNombre());
            System.out.println("El nombre del Apellido uno es: " +e3.getApellido());
            System.out.println("salario Mensual = " +e3.getSalarioMensual());
            System.out.println("El salario anual del empleado uno es: " +e3.getSalarioMensual()*12);
            System.out.println("El salario anual con aumento del 10% es: " +(e3.getSalarioMensual()*12)*1.10);
            System.out.println("=================================================================");

            //Empleado 2
            System.out.println("Empleado 2");
            System.out.println("El nombre del empleado dos es: " +e2.getNombre());
            System.out.println("El nombre del Apellido dos es: " +e2.getApellido());
            System.out.println("salario Mensual = " +e2.getSalarioMensual());
            System.out.println("El salario anual del empleado dos es: " +e2.getSalarioMensual()*12);
            System.out.println("El salario anual con aumento del 10% es: " +(e2.getSalarioMensual()*12)*1.10);

            //Empleado 1
            System.out.println("Empleado 2");
            System.out.println("El nombre del empleado dos es: " +e1.getNombre());
            System.out.println("El nombre del Apellido dos es: " +e1.getApellido());
            System.out.println("salario Mensual = " +e1.getSalarioMensual());
            System.out.println("El salario anual del empleado dos es: " +e1.getSalarioMensual()*12);
            System.out.println("El salario anual con aumento del 10% es: " +(e1.getSalarioMensual()*12)*1.10);



        }






    }


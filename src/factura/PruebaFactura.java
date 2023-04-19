package factura;// en teoría ya está listo xd

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PruebaFactura {
    public static void main(String[] args) {
        Factura f1 = new Factura();
        Factura f2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Numero de pieza");
        String numeroDePieza=sc.nextLine();
        System.out.println("Ingrese la descirpcion de la pieza");
        String DescripcionDePieza=sc.nextLine();
        System.out.println("Ingrese la cantidad de piezas que va a comprar");
        int cantidad= Integer.parseInt(sc.next());
        System.out.println("Ingrese el precio de la pieza en dolares");
        double precioPieza = Double.parseDouble(sc.next());
        f1.setNumeroPieza(numeroDePieza);
        f1.setCantidadPiezas(cantidad);
        f1.setDescripcionPieza(DescripcionDePieza);
        f1.setPrecioPieza(precioPieza);


        f2=new Factura(numeroDePieza, DescripcionDePieza, (double) cantidad, (int) precioPieza);



            System.out.println("El valor unitario de la pieza es: " +f2.getPrecioPieza());
            System.out.println("La cantidad de piezas son: " +f2.getCantidadPiezas());
            System.out.println("El total es: "+f2.montoFactura());



            //System.out.println("El valor unitario de la pieza es: " +f1.getPrecioPieza());
            //System.out.println("La cantidad de piezas son: " +f1.getCantidadPiezas());
            //System.out.println("El total es: "+f1.montoFactura());;









    }
}
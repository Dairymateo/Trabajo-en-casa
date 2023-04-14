import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Factura f1 = new Factura();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Numero de pieza");
        String numeroDePieza=sc.nextLine();
        System.out.println("Ingrese la descirpcion de la pieza");
        String DescripcionDePieza=sc.nextLine();
        System.out.println("Ingrese la cantidad de piezas que va a comprar");
        int cantidad=sc.nextInt();
        System.out.println("Ingrese el precio de la pieza en dolares");
        double precio=sc.nextDouble();
        f1.setNumeroPieza(numeroDePieza);
        f1.setCantidadPiezas(cantidad);
        f1.setDescripcionPieza(DescripcionDePieza);
        f1.setPrecioPieza(precio);

        if(cantidad<0){
            f1.setCantidadPiezas(0);
            System.out.println("El valor unitario de la pieza es: " +f1.getPrecioPieza());
            System.out.println("La cantidad de piezas son: " +f1.getCantidadPiezas());
            System.out.println("El total es: "+f1.montoFactura());
        }else{
            System.out.println("El valor unitario de la pieza es: " +f1.getPrecioPieza());
            System.out.println("La cantidad de piezas son: " +f1.getCantidadPiezas());
            System.out.println("El total es: "+f1.montoFactura());
        }

        if(precio<0){
            f1.setPrecioPieza(0.0);
            System.out.println("El valor unitario de la pieza es: " +f1.getPrecioPieza());
            System.out.println("La cantidad de piezas son: " +f1.getCantidadPiezas());
            System.out.println("El total es: "+f1.montoFactura());;
        }else{
            System.out.println("El valor unitario de la pieza es: " +f1.getPrecioPieza());
            System.out.println("La cantidad de piezas son: " +f1.getCantidadPiezas());
            System.out.println("El total es: "+f1.montoFactura());
        }







    }
}
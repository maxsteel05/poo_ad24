package p103_ClienteFactura;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static Factura Llenar() {
        Factura f = new Factura();
        Cliente c = new Cliente();
        Scanner Sebas = new Scanner(System.in);
        System.out.println("Dame los datos de la Factura y el Cliente");
        System.out.print("Id Factura     : "); f.setId(Sebas.nextInt());
        System.out.print("Monto          : "); f.setMonto(Sebas.nextDouble());
        System.out.print("Cliente Id     : "); c.setId(Sebas.nextInt()); Sebas.nextLine();
        System.out.print("Cliente Nombre : "); c.setNombre(Sebas.nextLine()); 
        System.out.print("Cliente Desc   : "); c.setDescuento(Sebas.nextFloat());
        f.setCliente(c);
        return f;
    }
    public static void main(String[] args) {
        ArrayList<Factura> facturas = new ArrayList<>();

        Factura f1 = new Factura(1, 1500, new Cliente(1, "Juan Perez", 0.03f));
        Factura f2 = new Factura(2, 2300, new Cliente(2, "Maria Lopez", 0.01f));
        facturas.add(f1);
        facturas.add(f2);


        System.out.print("\033[H\033[2J");

        Factura f3 = new Factura();
        f3 = Llenar();
        System.out.println("Mi factura es : " + f3.toString());
        facturas.add(f3);
        
        Factura f4 = new Factura();
        f4 = Llenar();
        System.out.println("Mi otra factura es : " + f4.toString());
        facturas.add(f4);
        
        System.out.println("\n\nTodas las facturas :");
        double grantotal = 0;
        for (Factura factura : facturas) {
            System.out.println("Id Factura     : " + factura.getId());
            System.out.println("Monto          : " + factura.getMonto());
            System.out.println("Cliente Id     : " + factura.getCliente().getId());
            System.out.println("Cliente Nombre : " + factura.getCliente().getNombre());
            System.out.println("Cliente Desc   : " + factura.getCliente().getDescuento());
            System.out.println("Total con Desc : " + factura.getTotal());
            grantotal = grantotal + factura.getTotal();
            System.out.println();
        }
        System.out.println("\nTotal ventas :" + grantotal);
    }
}

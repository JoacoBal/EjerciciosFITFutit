package FutitEjTecnicos.main;

import FutitEjTecnicos.documents.Factura;
import FutitEjTecnicos.documents.Pedido;
import FutitEjTecnicos.documents.PedidoUrgente;
import FutitEjTecnicos.documents.recursosHumanos.CV;

public class MainPrincipal {
    public static void main(String[] args) {
        
        Factura factura1 = new Factura(1, 42697446, 78451, "Claro");
        Factura factura2 = new Factura(2, 21697845, 10560, "Sony");

        Pedido pedido1 = new Pedido(1, 5, "Pepitos", 350);
        Pedido pedido2 = new Pedido(2, 9, "Papas Lays", 600);

        PedidoUrgente pedidoUrgente1 = new PedidoUrgente(3, 5, "Ibuprofeno", 4200, true);

        CV cv1 = new CV(11111, "Pedro Rufo", 358, "UNRC", "Supermercado");

        System.out.println("Informacion de las facturas: ");
        System.out.println(factura1.toString());
        System.out.println(factura2.toString());

        System.out.println("Informacion de los pedidos: ");
        System.out.println(pedido1.toString());
        System.out.println(pedido2.toString());

        if(pedidoUrgente1.getPedidoUrgente() == true){
            System.out.print("El pedido es urgente: ");
            System.out.println("\nURGENTE"+pedidoUrgente1.toString());
        }

        cv1.mostrarDocumento();

        

    }
}

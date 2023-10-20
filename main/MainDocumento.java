package FutitEjTecnicos.main;

import java.util.Scanner;

import FutitEjTecnicos.documents.Factura;
import FutitEjTecnicos.documents.Pedido;
import FutitEjTecnicos.documents.PedidoUrgente;
import FutitEjTecnicos.documents.recursosHumanos.CV;
import FutitEjTecnicos.documents.recursosHumanos.Contrato;

public class MainDocumento {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); //Entrada por teclado

        System.out.println("Seleccione el tipo de documento que desea crear");
        System.out.println("1- Factura.");
        System.out.println("2- Pedido.");
        System.out.println("3- Pedido Urgente.");
        System.out.println("4- Curriculum Vitae.");
        System.out.println("5- Contrato.");
        int opcion = teclado.nextInt();

        if(opcion >= 1 && opcion <= 5){
            System.out.println("El documento se creo correctamente.");
        }else{
            throw new IllegalArgumentException("Opcion ingresada no valida");
        }

        if(opcion == 1){
            Factura factura1 = new Factura(1, 42697446, 78451, "Claro");
            factura1.mostrarDocumento();
        }else if(opcion == 2){
            Pedido pedido1 = new Pedido(1, 5, "Pepitos", 350);
            pedido1.mostrarDocumento();
        }else if(opcion == 3){
            PedidoUrgente pedidoUrgente1 = new PedidoUrgente(3, 5, "Ibuprofeno", 4200, true);
            System.out.println("URGENTE!");
            pedidoUrgente1.mostrarDocumento();
        }else if(opcion == 4){
            CV cv1 = new CV(11111, "Pedro Rufo", 358, "UNRC", "Supermercado");
            cv1.mostrarDocumento();
        }else if(opcion == 5){
            Contrato contrato1 = new Contrato(45788124, "Secretario", 280000, "Garro");
            contrato1.mostrarDocumento();
        }

    }

}

package FutitEjTecnicos.documents;

import FutitEjTecnicos.documents.recursosHumanos.Documento;

public class Factura implements Documento{ //Creamos los atributos que va a poseer factura

    private int nroFactura;
    private int dniCliente;
    private float montoFactura;
    private String nombreEmpresa;


    //Definimos el constructor
    public Factura (int nroFactura, int dniCliente, float montoFactura, String nombreEmpresa){
        this.nroFactura = nroFactura;
        this.dniCliente = dniCliente;
        this.montoFactura = montoFactura;
        this.nombreEmpresa = nombreEmpresa;
    }

    //Definimos los getters

    public int getNroFactura(){
        return nroFactura;
    }

    public int getDniCliente(){
        return dniCliente;
    }

    public float getMontoFactura(){
        return montoFactura;
    }

    public String getNombreEmpresa(){
        return nombreEmpresa;
    }

    @Override
    public String toString(){ //Sobreescribimo el metodo toString para que nos muestre la factura por consola
        return ("\nEl numero de factura "+this.nroFactura+" del cliente con DNI "+this.dniCliente+" de la empresa "+this.nombreEmpresa+", su factura tiene un monto de $"+this.montoFactura);
    }

    @Override //Sobreescribimos el metodo de mostrarDocumento para que nos muestre lo que corresponde
    public void mostrarDocumento(){
        System.out.println("Mostrar Factura: "+"\nNumero de factura: "+getNroFactura()+"\nDNI cliente: "+getDniCliente()+
        "\nNombre empresa: "+getNombreEmpresa()+"\nMonto factura: "+getMontoFactura());
    }

}

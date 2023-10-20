package FutitEjTecnicos.documents;

import FutitEjTecnicos.documents.recursosHumanos.Documento;

public class Pedido implements Documento{ //Creamos los atributos que va a tener Pedido

    private int nroPedido;
    private int cantidadProducto;
    private String nombreProducto;
    private float precioProducto;

    //Definimos el constructor
    public Pedido(int nroPedido, int cantidadProducto, String nombreProducto, float precioProducto){
        this.nroPedido = nroPedido;
        this.cantidadProducto = cantidadProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    //Definimos los getters
    public int getNroPedido(){
        return nroPedido;
    }

    public int getCantidadProducto(){
        return cantidadProducto;
    }

    public String getNombreProducto(){
        return nombreProducto;
    }

    public float getPrecioProducto(){
        return precioProducto;
    }

    @Override
    public String toString(){ //Sobreescribimos el método toString para mostrar los datos del pedido
        return("\n El numero de pedido "+this.nroPedido+" del producto "+this.nombreProducto+" se solicito la cantidad de "+this.cantidadProducto+" con un precio unitario de $"+this.precioProducto);
    }

    @Override //Sobreescribimos el metodo mostrarDocumento para que nos muestre lo que corresponde.
    public void mostrarDocumento(){
        System.out.println("Mostrar pedido: "+"\nNumero de pedido: "+getNroPedido()+"\nNombre producto: "+getNombreProducto()+
        "\nCantidad producto: "+getCantidadProducto()+"\nPrecio unitario: "+getPrecioProducto());
    }

}

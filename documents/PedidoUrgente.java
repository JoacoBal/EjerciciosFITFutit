package FutitEjTecnicos.documents;


public class PedidoUrgente extends Pedido{
    private Boolean esUrgente;

    //Definimos el constructor que hereda de Pedido
    public PedidoUrgente(int numeroPedido, int cantidadProducto, String nombreProducto, float precioProducto, Boolean esUrgente){
        super(numeroPedido, cantidadProducto, nombreProducto, precioProducto);
        this.esUrgente = esUrgente;
    }

    //Definimos su getter

    public Boolean getPedidoUrgente(){
        return esUrgente;
    }
}

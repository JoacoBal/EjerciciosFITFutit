package FutitEjTecnicos;


/*
 * Recorrer la matriz una sola vez nos permite una buena complejidad, además de utilizar solo dos indices
 * nos permite minimizar la cantidad de escritura de la matriz, podemos ver que la complejidad es lineal
 * ya que se recorre solo una vez. El tiempo va a depender del tamaño de la matriz.
 */

public class MatrizDistCero {
    public static void main(String[] args) {
        
        int[] arreglo = {1,0,-2,0,0,3,4,0,0};
        int largo = cerosIzquierda(arreglo);

        //Imprimimos la matriz con los elementos distintos de cero a la izquierda de la matriz.
        System.out.print("[");
        for(int i=0;i<largo;i++){ //Ciclamos hasta largo, es decir la cantidad de elementos distintos de cero, ya que nos interesa el resto de numeros sean ceros.
            System.out.print(+arreglo[i]+ " ");
        }
        System.out.print("]");
        System.out.println("\nLa cantidad de numeros distintos de ceros son: "+largo);
    }

    public static int cerosIzquierda(int[] arreglo){

        int izquierda = 0; //Se utiliza para contar la cantidad de numeros distintos de cero.

        for(int i = 0; i < arreglo.length;i++){ //Recorremos el arreglo
            if(arreglo[i] != 0) {
                if(i != izquierda){
                int aux = arreglo[i]; //Guardamos el valor del arreglo de esa posicion en aux
                arreglo[i] = arreglo[izquierda]; //Movemos el valor hacia la posicion i 
                arreglo[izquierda] = aux; //Movemos el valor de aux hacia la posicion izquierda
                }
                izquierda++;
            }
        }
        return izquierda; //Devuelve la cantidad de numeros distintos de cero.
    }

}

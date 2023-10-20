package FutitEjTecnicos;

//Cuadrado magico de numeros impares

public class CuadradoMagico { 
    
    public static void main(String[] args) {
        
        int n = 3; // El tamaño del cuadrado mágico. Este programa funciona para numeros impares

        int numIni = n/2; // Este numero, debe ubicarse la mitad de la parte superior del cuadrado

        int [][] cuadradoMagico = new int [n][n]; //Creamos el cuadrado de n x n

        int contAux = 1; //Se inicializa el contador para saber hasta donde va a contar, depende del tamaño del cuadrado
                         // Si es 3x3 recorrerá 9 veces.
        
        //Llenamos la matriz con 0, esto para evitar que quede algún lugar nulo.
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                cuadradoMagico[i][j] = 0;
            }
        }

        int i = 0; // Variable i, para poder recorrer
        int j = numIni; // Se le asigna numIni para colocar el primer valor en la mitad de la parte superior del cuadrado
        int i_previo = 0; //Lo usamos para movernos en caso de que el lugar de la matriz esté ocupado
        int j_previo = 0; //Lo usamos para movernos en caso de que el lugar de la matriz esté ocupado

        while (contAux <= ((n*n))){
            if(cuadradoMagico[i][j] == 0){ //Corroboramos que en dicha posicion se encuentre vacia
                cuadradoMagico[i][j] = contAux; //Cambiamos el valor por el que se encuentra en contAux
            }else{ //En el caso de que dicho lugar esté ocupado, nos movemos hacia un lugar vacío
                i = i_previo + 1; //nos movemos hacia abajo ya que estaría ocupado dicho lugar
                j = j_previo; //Nos movemos hacia la izquierda ya que estaría ocuapado dicho lugar
                cuadradoMagico[i][j] = contAux; //Agregamos el numero en dicha posicion
            }
            i_previo = i;
            j_previo = j;
            contAux++;
            j++;//Esto nos permite posicionarnos en la diagonal
            i--;//Esto nos permite posicionarnos en la diagonal
            if(i<0 && j == n){ //Nos encontramos parados en la esquina superior
                i = n - 1;
                j = 0; //Nos movemos a la esquina inferior
            }else if(i<0) { //En el caso de que se encuentra afuera
                i = i + n;
            }else if(j==n){
                j = 0;  // En el caso que se encuentre afuera
            }
        }

        //Imprimimos por consola el cuadrado magico
        for(int k = 0;k<n;k++){
            String cuadradoMag = "";
            for(int l = 0;l<n;l++){
                cuadradoMag = cuadradoMag + "  " + cuadradoMagico[k][l];
            }
            System.out.println(""+cuadradoMag);
        }
    }

}

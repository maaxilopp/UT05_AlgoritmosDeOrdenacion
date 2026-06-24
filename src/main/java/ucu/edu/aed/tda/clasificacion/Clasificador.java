package ucu.edu.aed.tda.clasificacion;

public class Clasificador extends TClasificador{
    @Override
    void insercionDirecta(int[] datos) {

    }

    @Override
    void shell(int[] datos, Integer[] incrementos) {

    }

    @Override
    void burbuja(int[] datos) {
    }

    /**
     * Obtiene el pivote para hacer quicksort; devuelve el índice del elemento
     * ubicado en la mitad del subarreglo. Es O(1) ya que solo hace una
     * operación aritmética.
     * @param datos arreglo sobre el que se busca el pivote
     * @param i índice inicial
     * @param j índice final
     * @return el índice del elemento central del subarreglo
     */
    @Override
    protected int obtenerPivote(int[] datos, int i, int j) {
        return (i + j) / 2;
    }

    /**
     * Dado un pivote definido por el metodo realizado anteriormente y una coleccion de datos,
     * particiona el subarreglo [i..j] en dos partes; una con los elementos cuyos valores son menores al del pivote
     * y otra con los elementos cuyos valores son mayores o iguales al pivote. El orden de ejecución es O(n), siendo n el
     * tamaño del subarreglo (j - i + 1); ya que los punteros l y r recorren el rango en una
     * sola dirección hasta cruzarse, comparando cada elemento con el pivote una sola vez.
     * @param datos  el arreglo sobre el que se realiza la partición
     * @param i indice inicial
     * @param j indice final
     * @param pivote  valor de referencia; los menores quedan a la izquierda y los mayores o iguales a la derecha
     * @return el índice de la primera posición de la mitad derecha, o sea el punto de corte que separa los menores
     * de los mayores o iguales al pivote.
     */
    @Override
    protected int particion(int[] datos, int i, int j, int pivote) {
        int l = i;
        int r = j;
        do {
            intercambiar(datos, l, r);
            while(datos[l] < pivote){l ++;}
            while(datos[r] >= pivote){r --;}
        }
        while(l  <= r);
        return l;
    }

    @Override
    public void clasificacionDirecta(int[] datos) {

    }

    @Override
    public void heapsort(int[] datos) {

    }

    @Override
    protected void desplazaElemento(int[] datos, int primero, int ultimo) {

    }
}

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
        for (int i=1; N-1){
            for (int j=N; i+1){
                if (datos[j] < datos[j-1]) {
                    intercambiar(datos[j], datos[j-1])
                }
            }
        }
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

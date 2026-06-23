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
     * Obtiene el pivote para hacer quicksort; que es el elemento ubicado en la mitad
     * de la coleccion de datos; es O(1) ya que solo hace una operación aritmética y
     * un acceso a la coleccion
     * @param datos arreglo sobre el que se busca el pivote
     * @param i índice inicial
     * @param j índice final
     * @return el pivote; el elemento en el centro de la coleccion
     */
    @Override
    protected int obtenerPivote(int[] datos, int i, int j) {
        return datos[(i + j) / 2];
    }

    @Override
    protected int particion(int[] datos, int i, int j, int pivote) {
        return 0;
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

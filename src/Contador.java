public class Contador {

    //Tiempo transcurrido en segundos
    private long transcurrido;
    private static long DEFAULT = 0;

    public Contador() {
        //El contador comienza en 5 minutos
        this.transcurrido = DEFAULT;
    }

    /**
     * @param minutos minutos a agregar a transcurrido.
     * Valores negativos restan a transcurrido
     * @return verdadero si no sobrepasa Long#MAX_VALUE.
     * Falso en caso contrario
     */
    public boolean agregar(int minutos){
        long nuevo = transcurrido + ((long)minutos * 60);
        if (nuevo > 0) {
            transcurrido = nuevo;
            return true;
        } else {
            transcurrido = DEFAULT;
            return false;
        }
    }

    /**
     * @return tiempo transcurrido en segundos
     */
    public long transcurrido() {
        return transcurrido;
    }
}
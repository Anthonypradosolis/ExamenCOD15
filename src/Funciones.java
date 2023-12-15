public class Funciones {
    /**
     * Genera un numero aleatorio para el jugador
     * @param numero aleatorio
     * @return numero generado
     */
    public static int generarNumero(int numero){
        return numero;
    }
    /**
     * Genera los intentos maximos para las partidas
     * @param intentosmax por cada ronda
     * @return intentosmax para saber los intentos totales
     */
    public static int generarIntentosmax(int intentosmax){
        return intentosmax;
    }
    /**
     * Generamos las partidas que queremos jugar
     * @param ronda numero de rondas
     * @return ronda en la que estamos
     */
    public static Partida rondasJugar(Partida ronda){
        return ronda;
    }
    /**
     * Visualizamos el numero que acertamos
     * @param numeroAdivinado numero que acertamos
     * @return numero adivinado por el jugador
     */
    public static int numeroAcertado(int numeroAdivinado){
        return numeroAdivinado;
    }
    /**
     * Visualizamos el contador de intentos que nos queda
     * @param contadorIntentos restantes
     * @return contador de intentos
     */
    public static int contadorIntentos( int contadorIntentos){
        return contadorIntentos;
    }
    /**
     * Visualizamos el numero de aciertos
     * @param aciertos de los numeros adivinados
     * @return aciertos por el jugador
     */
    public static int aciertos(int aciertos){
        return aciertos;
    }
    /**
     * Visualizamos el numero de fallos
     * @param fallos de los numeros no adivinados
     * @return fallos por el jugador
     */
    public static int fallos(int fallos){
        return fallos;
    }
    /**
     * Visualizamos el record del juego
     * @param record de aquel jugador que supere el record anterior
     * @return record nuevo
     */
    public static Record record(Record record){
        return record;
    }
}
public class Singleton {
    /**
     * numero generado para adivinar
     */
    private int numero;
    /**
     * numero introduccido por el usuario
     */
    private int numeroAdivinado;
    /**
     * numero de intentos maximos
     */
    private int intentosMax;
    /**
     * contador de intentos restantes
     */
    private int contadorIntentos;
    /**
     * numero de aciertos por partida
     */
    private int aciertos;
    /**
     * alias del jugador
     */
    private String alias;
    /**
     * numero de fallos
     */
    private int fallos;

    /**
     * record del juego
     */
    private static Record record;
    /**
     * rondas del juego
     */
    private static Partida ronda;

    private static Singleton instance = null;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }
    public void setNumeroAdivinado(int numeroAdivinado) {
        this.numeroAdivinado = numeroAdivinado;
    }
    public void setContadorIntentos(int contadorIntentos) {
        this.contadorIntentos = contadorIntentos;
    }
    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    public int getNumero() {
        return numero;
    }
    public int getNumeroAdivinado() {
        return numeroAdivinado;
    }
    public int getIntentosMax() {
        return intentosMax;
    }
    public int getContadorIntentos() {
        return contadorIntentos;
    }
    public int getAciertos() {
        return aciertos;
    }
    public String getAlias() {
        return alias;
    }
    public int getFallos() {
        return fallos;
    }
}

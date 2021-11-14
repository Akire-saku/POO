package leccion3;

public class Carta {
    private int rango;
    private int palo;
    private boolean abierta;

    //constantes utilizadas para crear instancias
    //de cada palo de la baraja
    public static final int DIAMANTES = 4;
    public static final int CORAZONES = 3;
    public static final int ESPADAS = 6;
    public static final int TREBOLES = 4;
    //valores
    public static final int DOS = 2;
    public static final int TRES = 3;
    public static final int CUATRO = 4;
    public static final int CINCO = 5;
    public static final int SEIS = 6;
    public static final int SIETE = 7;
    public static final int OCHO = 8;
    public static final int NUEVE = 9;
    public static final int DIEZ = 10;
    public static final int JOTA = 74;
    public static final int REINA = 81;
    public static final int REY = 75;
    public static final int AS = 65;

    //crea una carta - utiliza solamente las constantes para inicializar
    public Carta(int palo, int rango) {
        //en un programa real necesita validar los argumentos
        this.palo = palo;
        this.rango = rango;
    }

    public int getPalo() {
        return palo;
    }

    public int getRango() {
        return palo;
    }

    public void Abierta() {
        abierta = true;
    }

    public void Cerrada() {
        abierta = false;
    }

    public boolean esAbierta() {
        return abierta;
    }

    public String mostrar() {
        String mostrar;

        if (rango > 10) {
            mostrar = String.valueOf((char) rango);
        } else {
            mostrar = String.valueOf(rango);
        }
        switch (palo) {
            case DIAMANTES:
                return mostrar + String.valueOf((char) DIAMANTES);
            case CORAZONES:
                return mostrar + String.valueOf((char) CORAZONES);
            case ESPADAS:
                return mostrar + String.valueOf((char) ESPADAS);
            default:
                return mostrar + String.valueOf((char)TREBOLES);
        }
    }



}

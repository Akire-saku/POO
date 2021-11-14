package leccion3;

public class Repartidor {
    private Baraja baraja;
    public Repartidor(Baraja b){
        baraja = b;
    }
    public void barajar(){
        // vuelve aleatorio el arreglo de cartas
        int num_cartas = baraja.size();
        for (int i = 0; i< num_cartas; i++){
            int indice = (int) (Math.random() * num_cartas);
            Carta i_carta = (Carta) baraja.get(i);
            Carta indice_carta = (Carta) baraja.get(indice);
            baraja.replace(i, indice_carta);
            baraja.replace(indice, i_carta);
        }
    }
    public Carta repartirCarta(){
        if(baraja.size() > 0){
            return baraja.quitarDeArriba();
        }
        return null;
    }
}

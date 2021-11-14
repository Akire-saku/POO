package leccion3;

public class Baraja {
    private java.util.LinkedList baraja;

    public Baraja(){
        generarCartas();
    }
    public Carta get(int indice) {
        if(indice < baraja.size()){
            return (Carta) baraja.get(indice);
        }
        return null;
    }
    public void replace (int indice, Carta carta){
        baraja.set(indice, carta);
    }
    public int size(){
        return baraja.size();
    }
    public Carta quitarDeArriba(){
        if(baraja.size() > 0){
            Carta carta = (Carta) baraja.quitarPrimero();
            return carta;
        }
        return null;
    }
    public void regresarABaraja(Carta carta){
        baraja.add(carta);
    }
    public void generarCartas(){
        baraja = new java.util.LinkedList();

        baraja.add(new Carta(Carta.TREBOLES, Carta.DOS));
        baraja.add(new Carta(Carta.TREBOLES, Carta.TRES));
        baraja.add(new Carta(Carta.TREBOLES, Carta.CUATRO));
        baraja.add(new Carta(Carta.TREBOLES, Carta.CINCO));
    }
}

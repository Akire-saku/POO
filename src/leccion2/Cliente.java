package leccion2;

import leccion1.Articulo;

public class Cliente {
    public Articulo[] articulos;

    public static void main (String [] args){
        Cliente cliente = new Cliente();

        double total = 0.0;
        for (int i = 0; i < cliente.articulos.length; i++){
            Articulo articulo = cliente.articulos[i];
            total = total + articulo.getTotalAjustado();
        }
    }
}

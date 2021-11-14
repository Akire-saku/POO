package leccion1;

public class Articulo {

     private double precio_unitario;
     private double descuento;

     private int cantidad;
     private String descripcion;
     private String id;

     public Articulo(String id, String descripcion, int cantidad, double precio){
          this.id = id;
          this.descripcion = descripcion;

          if(cantidad >= 0){
               this.cantidad = cantidad;
          }else{
               this.cantidad = 0;
          }

          this.precio_unitario = precio;
     }

     public double getTotalAjustado(){
          double total = precio_unitario * cantidad;
          double descuento_total = total * descuento;
          double total_ajustado = total - descuento_total;

          return total_ajustado;
     }

     public void setDescuento(double descuento){
          if(descuento <= 1.00){
               this.descuento = descuento;
          }
          else{
               this.descuento = 0.0;
          }

     }
     public double getDescuento(){
          return descuento;
     }
     public double getCantidad(){
          return cantidad;
     }
     public void setCantidad(int cantidad){
          if(cantidad >= 0){
               this.cantidad = cantidad;
          }
     }
     public String getIDProducto() {
          return id;
     }
     public String getDescripcion() {
          return descripcion;
     }

     public static void main(String[] args) {
          Articulo leche = new Articulo("lacteos-011", "1 galon de leche", 2, 2.50);
          Articulo leche1 = new Articulo("lacteos-011", "1 galon de leche", 2, 2.50);

          double precio_leche = leche.getTotalAjustado();
          System.out.println("Precio total " + precio_leche);
     }
}

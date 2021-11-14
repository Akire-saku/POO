package leccion3;

public class ClaveDoble {
    private String clave1, clave2;

    //constructor sin argumentos
    public ClaveDoble() {
        clave1 = "clave1";
        clave2 = "clave2";
    }
    //constructor con argumentos
    public ClaveDoble(String clave1, String clave2){
        this.clave1 = clave1;
        this.clave2 = clave2;
    }

    //accesor
    public String getClave1(){
        return clave1;
    }

    //mutador
    public void setClave1(String clave1){
        this.clave1 = clave1;
    }

    //accesor
    public String getClave2(){
        return clave2;
    }

    //mutador
    public void setClave2(String clave2){
        this.clave1 = clave2;
    }

}

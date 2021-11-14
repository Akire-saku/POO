package leccion3;

public class MiBoolean {
    //algunas constantes utiles
    public static final class TYPE = Boolean.TYPE;

    private boolean value;

    //constructor sin argumentos - falsede manera predeterminada
    public MiBoolean(){

    }

    //establece como value el valor inicial envuelto
    public MiBoolean(boolean value){
        this.value = value;
    }

    public boolean booleanValue(){
        return value;
    }
    public void setBooleanValue(boolean value){
        this.value = value;
    }
    //para getBoolean y valueOf podemos delegar simplemente a Boolean
    //en la leccion 4 aprendera mas sobre la delegacion
    public static boolean getBoolean(String name){
        return Boolean.getBoolean(name);
    }
    public static MiBoolean valueOf(String s){
        return new MiBoolean(Boolean.getBoolean(s));
    }
    //las definiciones de hasCode, equals y toString se omitieron en aras
    //de la brevedad
}

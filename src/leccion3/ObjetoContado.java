package leccion3;

public class ObjetoContado {
    private static int instancias;

    public ObjetoContado(){
        instancias++;
    }
    public static int getNumeroInstancias(){
        return instancias;
    }
    public static void main(String [] args){
        ObjetoContado obj = null;
        for(int i = 0; i < 10; i++){
            obj = new ObjetoContado();
        }
        System.out.println("Instancias creadas:" +obj.getNumeroInstancias());
        System.out.println("Instancias creadas:" +ObjetoContado.getNumeroInstancias());
    }
}

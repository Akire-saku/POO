package leccion3;

public class Cuenta {
    //datos privados
    private double saldo;

    //constructor
    public Cuenta(double deposito_inicial){
        saldo = deposito_inicial;
    }

    public Cuenta(){

    }

    //deposita dinero en la cuenta
    public void depositaFondos(double cantidad){
        saldo = saldo + cantidad;
    }

    //consulta el saldo
    public double getSaldo(){
        return saldo;
    }

    //retira fondos de la cuenta
    public double retirarFondos(double cantidad){
        if(cantidad > saldo){
            cantidad = saldo;
        }
        saldo = saldo - cantidad;

        return cantidad;
    }
}

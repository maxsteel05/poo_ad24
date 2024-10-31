package p131_ExcepcionTemperatura;

public class TemperaturaExcesiva extends Exception {
    public TemperaturaExcesiva(String mensaje_error) {
        super(mensaje_error);
    }
}

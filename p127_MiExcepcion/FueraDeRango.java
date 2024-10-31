package p127_MiExcepcion;

// Para crear nuestra propia excepcion, heredamos de la clase Exception
// Creamos un constructor que pase el mensaje de error a la clase base

public class FueraDeRango extends Exception {
    public FueraDeRango(String error) {
        super(error);
    }
}

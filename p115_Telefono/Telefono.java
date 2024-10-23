package p115_Telefono;

public class Telefono implements Gps, Radio {

    @Override
    public void ObtenerCoordenadas() {
        System.out.println("Obteniendo coordenadas (0,0)... estás en casa");
        
    }
    @Override
    public void IniciarRadio() {
        System.out.println("Iniciando radio en la super G....");
        
    }
    @Override
    public void detenerRadio() {
        System.out.println(" Deteniendo radio ....");
        
    }
}

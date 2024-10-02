package Práctica_08_p99_Rectangulo;

public class Rectangulo {
    private float Largo;
    private float Ancho;

    public Rectangulo() {}
    public Rectangulo(float largo, float ancho) {
        Largo = largo;
        Ancho = ancho;
    }
    public float getLargo() {
        return Largo;
    }
    public void setLargo(float largo) {
        Largo = largo;
    }
    public float getAncho() {
        return Ancho;
    }
    public void setAncho(float ancho) {
        Ancho = ancho;
    }

    public float getArea() {
        return (Largo * Ancho);
    }

    public float getPerimetro() {
        return (2 * (Largo + Ancho));
    }
    @Override
    public String toString() {
        return "Rectangulo [Largo=" + Largo + ", Ancho=" + Ancho + "]";
    }
}

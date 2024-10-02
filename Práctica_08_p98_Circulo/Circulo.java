package Práctica_08_p98_Circulo;

public class Circulo {
    private double Radio;
 

    public Circulo() {}
    public Circulo(double radio) {
        Radio = radio;
    }


    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }

    public double getArea() {
        return (Radio * Radio * Math.PI);
    }
    public double getCircunferencia() {
        return (2 * Math.PI * Radio);
    }
    @Override
    public String toString() {
        return "Circulo [Radio=" + Radio + "]";
    }
}

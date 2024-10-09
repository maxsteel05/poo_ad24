package p109_FormaV2;

public class Circulo extends Forma {
    private double radio;

    public Circulo() {
    }

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);  // Llama al constructor de la clase base
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo [" + super.toString() + ", Radio=" + radio + "]";
    }
}


package p113_SegundoExamenParcial;

public abstract class Deportista {
    private String nombreJugador;
    private char genero;
    private String detalles;
    private double sueldo;
    protected double ingresosTotales;

    public Deportista(String nombreJugador, char genero, String detalles, double sueldo) {
        this.nombreJugador = nombreJugador;
        this.genero = genero;
        this.detalles = detalles;
        this.sueldo = sueldo;
    }

    public abstract double calcularBono();

    @Override
    public String toString() {
        return "Deportista [Nombre: " + nombreJugador + ", Género: " + genero + 
               ", Descripción: " + detalles + ", Sueldo Base: " + sueldo + "]";
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public double obtenerIngresosTotales() {
        return ingresosTotales;
    }
}


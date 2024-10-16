package p113_SegundoExamenParcial;

public class JugadorEntrenador extends Deportista {
    private int personalACargo;
    private int proyectosDirigidos;

    public JugadorEntrenador(String nombreCompleto, char genero, String detallesAdicionales, double remuneracion, int personalACargo, int proyectosDirigidos) {
        super(nombreCompleto, genero, detallesAdicionales, remuneracion);
        this.personalACargo = personalACargo;
        this.proyectosDirigidos = proyectosDirigidos;
        this.ingresosFinales = remuneracion + calcularBono(); 
    }
    @Override
    public double calcularBono() {
        return (obtenerRemuneracion() * 0.15) + (proyectosDirigidos * 100) + (personalACargo * 10);
    }

    @Override
    public String toString() {
        return "JugadorEntrenador [" + super.toString() + ", Personal a Cargo=" + personalACargo + ", Proyectos Dirigidos=" + proyectosDirigidos + 
               ", Bono Obtenido=" + calcularBono() + ", Ingresos Finales=" + ingresosFinales + "]";
    }
}


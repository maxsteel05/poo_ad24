package p113_SegundoExamenParcial;
public class FutbolistaEnJuego extends Deportista {
    private int juegosDisputados;
    private int golesMarcados;

    public FutbolistaEnJuego(String nombreJugador, char genero, String detalles, double sueldo, int juegosDisputados, int golesMarcados) {
        super(nombreJugador, genero, detalles, sueldo);
        this.juegosDisputados = juegosDisputados;
        this.golesMarcados = golesMarcados;
        this.ingresosTotales = sueldo + calcularBono();
    }

    @Override
    public double calcularBono() {
        return (obtenerSueldo() * 0.10) + (juegosDisputados * 50) + (golesMarcados * 5);
    }
    @Override
    public String toString() {
        return "FutbolistaEnJuego [" + super.toString() + ", Juegos Disputados=" + juegosDisputados + 
               ", Goles Marcados=" + golesMarcados + ", Bono Calculado=" + calcularBono() + 
               ", Ingresos Totales=" + ingresosTotales + "]";
    }
}

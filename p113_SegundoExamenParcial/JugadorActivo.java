public class JugadorActivo extends Jugador {
    private int partidos;
    private int goles;

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        this.partidos = partidos;
        this.goles = goles;
        this.total = salario + getBono();
    }

    @Override
    public double getBono() {
        return (getSalario() * 0.10) + (partidos * 50) + (goles * 5);
    }

    @Override
    public String toString() {
        return super.toString() + ", Partidos=" + partidos + 
               ", Goles=" + goles + ", Bono=" + getBono() + ", Total=" + total;
    }

    public double getSalario() {
        return super.salario;
    }
}

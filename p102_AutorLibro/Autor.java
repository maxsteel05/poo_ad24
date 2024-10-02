package p102_AutorLibro;

public class Autor {
    private String Nombre;
    private int Edad;
    private String Correo;
    public Autor() {
    }
    public Autor(String nombre, int edad, String correo) {
        Nombre = nombre;
        Edad = edad;
        Correo = correo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String correo) {
        Correo = correo;
    }
    @Override
    public String toString() {
        return "Autor [Nombre=" + Nombre + ", Edad=" + Edad + ", Correo=" + Correo + "]";
    }
}

package p102_AutorLibro;

public class Libro {
    private String Isbn;
    private String Nombre;
    private double Precio;
    private Autor Autor;
    public Libro () {
    }
    public Libro(String isbn, String nombre, int precio, p102_AutorLibro.Autor autor) {
        Isbn = isbn;
        Nombre = nombre;
        Precio = precio;
        Autor = autor;
    }
    public String getIsbn() {
        return Isbn;
    }
    public void setIsbn(String isbn) {
        Isbn = isbn;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(int precio) {
        Precio = precio;
    }
    public Autor getAutor() {
        return Autor;
    }
    public void setAutor(Autor autor) {
        Autor = autor;
    }
    @Override
    public String toString() {
        return "Libro [Isbn=" + Isbn + ", Nombre=" + Nombre + ", Precio=" + Precio + ", Autor=" + Autor + "]";
    }
}

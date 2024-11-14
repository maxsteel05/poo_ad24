package p147_TercerExamenParcial;

import java.io.Serializable;

public class Jugador implements Serializable {

    
    private String nombre; // Nombre completo
    private int edad; 
    private char sexo; // Sexo ('M' o 'F')
    private String estadocivil; 
    private String descripcion; // Puesto o rol en el equipo
    private double salario; // Salario mensual

    public Jugador() {}

    public Jugador(String nombre, int edad, char sexo, String estadocivil, String descripcion, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estadocivil = estadocivil;
        this.descripcion = descripcion;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEstadocivil() {
        return estadocivil;
    }
    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", estadocivil='" + estadocivil + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", salario=" + salario +
                '}';
    }
}


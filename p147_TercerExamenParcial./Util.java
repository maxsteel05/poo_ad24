package p147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;

public class Util {

    public static ArrayList<Jugador> inicializarDatos() {
        return new ArrayList<>();
    }
    public static void grabarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        try (ObjectOutputStream fdatos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            fdatos.writeObject(datos);
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Jugador> leerDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Jugador> datos;
        try (ObjectInputStream fdatos = new ObjectInputStream(new FileInputStream(archivo))) {
            datos = (ArrayList<Jugador>) fdatos.readObject();
        }
        return datos;
    }
}

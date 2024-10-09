package p109_FormaV2;

public class App {
    public static void main(String[] args) {
        // Crear un arreglo de formas
        Forma[] formas = new Forma[4];
        formas[0] = new Circulo("Rojo", true, 10.23);
        formas[1] = new Circulo("Verde", false, 99.12);
        formas[2] = new Rectangulo("Amarillo", false, 10.0, 20.0);
        formas[3] = new Rectangulo("Azul", true, 15.0, 44.0);

        // Mostrar todas las formas
        System.out.println("Todas las formas :");
        for (Forma forma : formas) {
            System.out.println(forma);
        }

        // Calcular y mostrar áreas y perímetros
        System.out.println("Calculando áreas y perimetros de las figuras:");
        for (Forma forma : formas) {
            if (forma instanceof Circulo) {
                System.out.println("La forma es un Circulo");
            } else if (forma instanceof Rectangulo) {
                System.out.println("La forma es un Rectangulo");
            }
            System.out.println("El área es : " + forma.getArea());
            System.out.println("El perimetro es : " + forma.getPerimetro());
        }
    }
}


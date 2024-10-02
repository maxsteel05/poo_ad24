package p94_Empleado01;

// Programa principal

public class App {
    public static void main(String[] args) {
        
    
        Empleado empleado1 = new Empleado(); // Inicializar
        Empleado empleado2 = new Empleado(); // Instanciar

        // Asignar valores a las propiedades
        empleado1.Nombre = "Juan Perez";
        empleado1.Edad = 45;
        empleado2.Nombre = "María Lopez";
        empleado2.Edad = 25;

        Empleado empleado3;
        empleado3 = new Empleado();
        // Asignar valores a las propiedades
        empleado3.Nombre = "Jorge";
        empleado3.Edad = 15;

        System.out.print("\033[H\033[2J");
        System.out.println("Empleado 1 nombre " + empleado1.Nombre);
        System.out.println("Empleado 1 edad " + empleado1.Edad);
        System.out.println(empleado1.toString()); //Invocar metodo toString() del objeto
        System.out.println("Empleado 2 nombre " + empleado2.Nombre);
        System.out.println("Empleado 2 edad " + empleado2.Edad);
        System.out.println(empleado2.toString()); //Invocar metodo toString() del objeto
        System.out.println("\nEmpleado 3 ");
        System.out.println(empleado3.toString()); //Invocar metodo toString() del objeto
    }
}

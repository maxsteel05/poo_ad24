package p97_Empleado04;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        int m=0,f=0,c=0,s=0;

        Empleado empleado1 = new Empleado("Pepito", 23, 'H', true);
        Empleado empleado2 = new Empleado();

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(new Empleado("Dario", 22, 'H', false));
        empleados.add(new Empleado("Pepe", 32, 'H', false));

        empleado2.setNombre("Juana");
        empleado2.setEdad(20);
        empleado2.setSexo('M');
        empleado2.setCasado(false);

        System.out.print("\033[H\033[2J");

        System.out.println("Todos los empleados: ");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
            if(empleado.getSexo()=='H') m++;
            if(empleado.getSexo()=='M') f++;

            if(empleado.isCasado()) c++; else s++;
        }
        System.out.println("Hombres: "+m);
        System.out.println("Mujeres: "+f);
        System.out.println("Casados: "+c);
        System.out.println("Solteros: "+s);
    }
    
}

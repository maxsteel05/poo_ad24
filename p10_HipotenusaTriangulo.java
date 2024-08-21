// p10_HipotenusaTriangulo - Se desea calcular la hipotenusa de un triángulo rectángulo dadas las longitudes de sus lados, usando la siguiente formula
    
import java.util.scanner;

public class p10_CalcularHipotenusa {
    public static void main(string[]args) {
        Scanner scanner = new Scanner(system.in):

        System.out.ptint("Ingrese el valor del cateto a: ");
        double catetoA = scanner.nextDouble();

        System.out.print("Ingrese el valor del cateto b: ");
        double catetoB = Scanner.nextDouble();
        double hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);

        System.out.println("la hipotenusa es: " + hipotenusa);

    }
}

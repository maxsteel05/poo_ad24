// p87_ArregloTemperaturas - Mostrar Mayor, Menor, Buscar en un arreglo

public class p87_ArregloTemperaturas {

    public static void Mostrar (double[] x){
        for (int  i=0; i < x.length; i++)
            System.out.print(x[i] + " ");
    System.out.println();
    }
    
    public static double Mayor(double[] x){
        double m = x[0];
        for(int i = 1; i<x.length;i++)
            if ( x[i] > m) m = x[i];
        return m;
    }
    public static double Menor(double[] x){
        double m = x[0];
        for(int i = 1; i<x.length;i++)
            if ( x[i] < m) m = x[i];
        return m;
    }
    public static int Buscar(double[] x,double bus){
        int pos = -1;
        for(int i = 0; i<x.length;i++)
            if ( x[i] == bus){
                pos = i;
                break;
            }
        return pos;
    }

    
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        double [] temps = {4.39, 15.67, 21.40, 33.92, 3.6, 22.35, 9.00, 43.5};
        System.out.println("Arreglo de temperaturas:");
        Mostrar(temps);
        System.out.println("El mayor es " + Mayor(temps));
        System.out.println("El menor es " + Menor(temps));
        int bus=10;
        int pos = Buscar(temps, bus);
        if (pos != -1)
            System.out.println("Elemento encontrado en la posicion " + pos);
        else
            System.out.println("I Still Haven't Found What I'm Looking For");
         
    }
}

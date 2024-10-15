package p111_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        CuentaBancaria c1 = new CuentaBancaria(5000);
        System.out.println("Saldo inicial: " + c1.getSaldo());
        c1.deposita(10000);
        System.out.println("Saldo después del primer depósito " + c1.getSaldo());
        double cr = 400;
        boolean rsn = c1.retira(cr);
        if
    }
}

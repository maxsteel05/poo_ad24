package p111_CuentaBancariaV1;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private String domicilio;
    private ArrayList<Cliente> clientes;

    public Banco(){
        clientes = new ArrayList<>();   
    }
    public Banco(String nombre, String domicilio){
        this(); //Invoca al constructor vacío de la misma clase
        this.nombre = nombre;
        this.domicilio = domicilio;
    }
    public void agregarCliente(Cliente cliente) {
        cliente.add(cliente);
    }
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    @Override
    public String toString() {
        return "Banco [Nombre=" + nombre + ", Domicilio=" + domicilio + ", Clientes=" + clientes.size()"]";
    }
    
}   

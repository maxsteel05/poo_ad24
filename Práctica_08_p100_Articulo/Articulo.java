package Práctica_08_p100_Articulo;

public class Articulo {
    private String Id;
    private String Desc;
    private int Cant;
    private double PrecioUnit;


    public Articulo() {}
    public Articulo(String id, String desc, int cant, double precioUnit) {
        Id = id;
        Desc = desc;
        Cant = cant;
        PrecioUnit = precioUnit;
    }
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getDesc() {
        return Desc;
    }
    public void setDesc(String desc) {
        Desc = desc;
    }
    public int getCant() {
        return Cant;
    }
    public void setCant(int cant) {
        Cant = cant;
    }
    public double getPrecioUnit() {
        return PrecioUnit;
    }
    public void setPrecioUnit(double precioUnit) {
        PrecioUnit = precioUnit;
    }
    
    public double getTotal(){
        return (Cant * PrecioUnit);
    }
    @Override
    public String toString() {
        return "Articulo [Id=" + Id + ", Desc=" + Desc + ", Cant=" + Cant + ", PrecioUnit=" + PrecioUnit + "]";
    }
}

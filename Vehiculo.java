public class Vehiculo{
    private String marca;
    private String modelo;
    private Double precio;

    //constructor
    public Vehiculo(String marca, String modelo,Double precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }

    public Double getPrecio(){
        return precio;
    }


    public String mostrarDatos(){
        return "Marca: "+marca +",Modelo: "+modelo+ "Precio: "+precio +"\n";
    }

}
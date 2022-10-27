import java.util.Scanner;

public class Main {

    public static Integer indiceCarroBarato(Vehiculo carros[]){
        double precio;
        Integer indice =0;

        precio = carros[0].getPrecio();
        for(Integer i=1; i<carros.length; i++){
            if(carros[i].getPrecio()<precio){
                precio = carros[i].getPrecio();
                indice=i;
            }
        }
        return indice;
    }

    public static void main(String args[]){


        Scanner teclado = new Scanner(System.in);
        String marca,modelo;
        Double precio;
        Integer numeroVehiculos,indiceBarato;

        System.out.println("Digite cantidad de vehiculos a ingresar ");
        numeroVehiculos = teclado.nextInt();
        
        // se crean los objetos para los carros
        Vehiculo carros[] = new Vehiculo[numeroVehiculos];

        for(Integer i=0; i< carros.length; i++){
            teclado.nextLine();
            System.out.println("Digite las caracteristicas del carro "+(i+1)+":");
            System.out.println("Digita la marca");
            marca= teclado.nextLine();
            System.out.println("Digita el modelo");
            modelo= teclado.nextLine();
            System.out.println("Digita el precio");
            precio= teclado.nextDouble();

            carros[i]= new Vehiculo(marca,modelo,precio);
        }

        indiceBarato= indiceCarroBarato(carros);
        System.out.println("El carro mas barato es ");
        System.out.println(carros[indiceBarato].mostrarDatos());

        teclado.close();

    }
    
}

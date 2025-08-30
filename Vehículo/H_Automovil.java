/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehículo;

/**
 *
 * @author yanier
 */
public class H_Automovil extends DADVehiculo {
    String marca;
    String modelo;
    double precio;
    
    public H_Automovil(String fechafabricacion,String vinChasis,String vinmotor,String marca, String modelo, double precio ){
        
        super(fechafabricacion,vinChasis,vinmotor);
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        
    }
    public String getmarca(){
        return marca;
    }
    public String getmodelo(){
        return modelo;
}
    public double getprecio(){
        return precio;
}
    public void mostrarDatos(){
        System.out.println("los datos del automovil son: ");
        System.out.println("fecha de fabricacion: " + getfechafabricacion());
        System.out.println("vinChasis: " + getvinChasis() );
        System.out.println("vinmotor: " + getvinmotor());
        System.out.println("Marca: " + getmarca());
        System.out.println("Modelo: " + getmodelo());
        System.out.println("Precio: " + getprecio());
        
    }
}

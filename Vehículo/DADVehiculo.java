/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehículo;

/**
 *
 * @author yanier
 */
public class DADVehiculo {
    String fechafabricacion;
    String vinChasis; 
    String vinmotor;
    
    public DADVehiculo(String fechafabricacion,String vinChasis,String vinmotor ){
        this.fechafabricacion = fechafabricacion;
        this.vinChasis = vinChasis;
        this.vinmotor = vinmotor;
    }
    
    public String getfechafabricacion(){
        return fechafabricacion;
    }
    
    public String getvinChasis(){
        return vinChasis;
    }
    public String getvinmotor(){
        return vinmotor;
    }
}

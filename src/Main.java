
import Clases.persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // sin argumentos
        persona p = new persona();
        
        p.setId(123456);
        System.out.println("el valor asignado actualmente a la cedula es :  " + p.getId());
        
        //construtor con argumentos 
        
        persona p2 = new persona (12345,"carlos");
        
    }
    
}

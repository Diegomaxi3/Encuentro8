/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import java.util.Scanner;
import Entity.Persona;
/**
 *
 * @author Diego
 */
public class PersonaService {
    private Persona persona;
    
    public PersonaService(){
        
    }
    
    public Persona crearPersona(){
        Scanner sc = new Scanner(System.in);
        persona = new Persona();
        System.out.println("Ingrese su nombre: ");
        persona.setNombre(sc.nextLine());
        System.out.println("Ingrese Edad: ");
        persona.setEdad(sc.nextInt());
        
        return persona;
    }
    
    public void mostrarDatos(){
        System.out.println("Persona: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}

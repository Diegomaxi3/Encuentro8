/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Diego
 */
public class Persona {
     
    private String name;
    private int edad;
    
    public Persona(){}
    
    public void setNombre(String nombre){
        this.name = nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getNombre(){
        return name;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public Persona CrearPersona(){
        return this;
    }
    
}

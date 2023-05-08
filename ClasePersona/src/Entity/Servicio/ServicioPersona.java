/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Servicio;

import Entity.Persona;

/**
 *
 * @author Diego
 */
public class ServicioPersona {
    
    public Persona persona;
    
    public ServicioPersona(String nombre, int edad, float peso, float altura, String sexo){
        persona = new Persona(nombre,edad,peso,altura,sexo);
    }
}

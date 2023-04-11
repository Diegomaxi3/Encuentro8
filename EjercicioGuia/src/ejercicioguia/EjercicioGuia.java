/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia;
import Service.PersonaService;
import Entity.Persona;
/**
 *
 * @author Diego
 */
public class EjercicioGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaService ps = new PersonaService();
        Persona persona = ps.crearPersona();
        ps.mostrarDatos();
        System.out.println("Persona copia: " + persona.getNombre());
    }
    
}

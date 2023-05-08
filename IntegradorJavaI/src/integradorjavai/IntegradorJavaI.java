/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorjavai;
import Entity.Estudiante;
import Entity.Service.EntityService;
/**
 *
 * @author Diego
 */
public class IntegradorJavaI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityService servicioEst = new EntityService();
        Estudiante [] curso = servicioEst.ingresoEstudiante();
        String [] mayorProm = servicioEst.promedioMayor(curso);
        System.out.println("Promedio: " + servicioEst.calcularPromedio(curso));
        System.out.println("-------------------");
        for (String nom : mayorProm){
            System.out.println("Nombre: " + nom);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerejercicioguia9;

import Entity.Cadena;
import Entity.Service.CadenaServicio;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class PrimerEjercicioGuia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CadenaServicio cs = new CadenaServicio();
        Cadena cadena = cs.crearCadena();
        cs.mostrarVocales(cadena);
        cs.invertirFrase(cadena);
        cs.vecesRepetido(cadena,"o");
        cs.vecesRepetido(cadena,"i");
        cs.compararLongitud(cadena);
       // Date hoy = new Date(); 
     //   System.out.println("Fecha: " + hoy);
      //  System.out.println("Anio: " + (hoy.getYear() + 1900));
      //  System.out.println("Dia: " + hoy.getDay());
     //   System.out.println("Dia: " + hoy.getDate());
    //    System.out.println("Mes: " + (hoy.getMonth() + 1 ));
        
    }
    
}

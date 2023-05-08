/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Service;
import Entity.Estudiante;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class EntityService {
   

    public EntityService() {}
    
    public Estudiante[] ingresoEstudiante(){
         Estudiante [] est = new Estudiante[8];
         Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            est[i] = new Estudiante();
            System.out.println("Ingrese el nombre del estudiente nro: " + (i + 1) );
            est[i].setNombre(sc.nextLine());
            System.out.println("Ingrese la nota del final del estudiante nro: " + (i + 1));
            est[i].setNota(sc.nextDouble());
            sc.nextLine();
        }
        System.out.println("Se termino el ingreso de alumnos");
        return est;
    } 
    
    public double calcularPromedio(Estudiante [] est){
        double promedio;
        double suma =0 ;
        for (Estudiante est1 : est) {
            suma += est1.getNota();
        }
        promedio = suma / est.length;
        return promedio;
    }
    
    public String[] promedioMayor(Estudiante [] est){      
        double promedio = calcularPromedio(est);
        int cant = 0;
         for(Estudiante est1 : est){
            if (est1.getNota() > promedio) cant++ ;
        }
         
         String [] nombres = new String[cant];
         cant = 0;
        for(Estudiante est1 : est){
            if (est1.getNota() > promedio) {
               nombres[cant] = est1.getNombre();
               cant++;
            }
        }
        
        return nombres;
    }
}

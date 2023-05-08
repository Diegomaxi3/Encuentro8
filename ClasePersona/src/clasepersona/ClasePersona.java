/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasepersona;
import java.util.Scanner;
import Entity.Servicio.ServicioPersona;
/**
 *
 * @author Diego
 */
public class ClasePersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese peso: ");
        float peso = sc.nextFloat();
        System.out.println("Ingrese Altura: ");
        float altura = sc.nextFloat();
        sc.nextLine();
        
        String sexo;
        do{
        System.out.println("Ingrese Sexo: ");
          sexo = sc.nextLine();
        }while(!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O"));
        ServicioPersona persona = new ServicioPersona(nombre,edad,peso,altura,sexo);   
        
        System.out.println(persona.persona.toString());
       
    }
    
}

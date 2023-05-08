/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Service;

import Entity.Cadena;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class CadenaServicio {

    public CadenaServicio() {
    }

    public Cadena crearCadena(){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Ingrese una frase: ");
         Cadena cadena = new Cadena(sc.nextLine());
        return cadena;
    }
    
    public void mostrarVocales(Cadena cadena){
        int cont = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            String l = cadena.getCadena().substring(i,i + 1);
            if (l.equalsIgnoreCase("a") || l.equalsIgnoreCase("e")
                    || l.equalsIgnoreCase("i") || l.equalsIgnoreCase("o") 
                    || l.equalsIgnoreCase("u")){
                cont++;
            }
        }
        System.out.println("Cantidad de vocales: " + cont);
    }
    
    public void invertirFrase(Cadena cadena){
        System.out.print("Cadena alrevez: ");
        for (int i = cadena.getLongitud() ; i > 0; i--) {
            System.out.print(cadena.getCadena().substring(i - 1, i));
        }
        System.out.println("");
    }
    
    public void vecesRepetido(Cadena cadena,String letra){
        int cont = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if(cadena.getCadena().substring(i,i + 1).equalsIgnoreCase(letra)){
               cont++; 
            }
        }
        System.out.println("Cantidad de veces que se repite |" + letra + "|:"  + cont);
    }
    
     public void  compararLongitud(Cadena cadena){
         System.out.println("Ingrese frase: ");
         Scanner sc = new Scanner(System.in);
         boolean a = sc.nextLine().length() > cadena.getLongitud();
         System.out.println( a ? "La cadena es mayor":"La cadena es menor" );
     }
}

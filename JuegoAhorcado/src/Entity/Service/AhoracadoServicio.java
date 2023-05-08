/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Service;
import Entity.Ahoracado;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class AhoracadoServicio {
    Ahoracado ahorcado;
    Scanner sc = new Scanner(System.in);
    
    public AhoracadoServicio(){};
    
    public void crearJuego(){
        ahorcado = new Ahoracado();
        System.out.println("Ingrese la palabra: ");
        String palabra =sc.next();
        ahorcado.setPalabra(ingresarPalabra(palabra));
        System.out.println("Ingrese la cantidad maxima de intentos: ");
        ahorcado.setCantOportunidades(sc.nextInt());
    }
    
    public int longitud(){
        return ahorcado.getPalabra().length;
    }
    
    public boolean buscarLetra(char letra){
     //   char [] encon =  ahorcado.getEncontradas();
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (letra == ahorcado.getPalabra()[i]){ 
                
            //    ahorcado.setEncontradas(encon);
                System.out.println("La letra pertence a la palabra");
                return true;
            }
        }
        ahorcado.setCantOportunidades(ahorcado.getCantOportunidades() - 1);
        System.out.println("La letra no pertence a la palabra");
        return false;
    }
    
    public boolean encontradas(char letra){
        boolean retorno = buscarLetra(letra);       
        System.out.println("Numero de letras (encontradas/no encontradas): (" + 
                contEncontrados() +"/ " + (longitud() - contEncontrados()) +   ")" );
        return retorno;
    }
    
    public int intentos(){
        return ahorcado.getCantOportunidades();
    }
    
    private char[] ingresarPalabra(String palabra){
        char[] pla = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            pla[i] = palabra.charAt(i);
        }
        return pla;
    }
    
    private int contEncontrados(){
        int contador= 0;
        for (int i = 0; i < ahorcado.getEncontradas().length; i++) {
            if (ahorcado.getEncontradas()[i] != ' ')
            {
              contador++;
            }
        }
        return contador;
    }
      
    public void juego(){
        crearJuego();
        do{
            System.out.println("");
            System.out.println("----------------------------------------");
            System.out.println("Longitud de la palabra: " + longitud());
            System.out.print("Ingrese la letra a buscar: ");       
            encontradas(sc.next().charAt(0));
            System.out.println("Can. intentos restantes: " + intentos());
        }while(intentos() > 0);
       
        if(intentos() == 0){
            System.out.println("Lo sentimos, no hay más oportunidades");
        }
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.service;
import Entity.Raices;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class RaicesServicio {
     
    public RaicesServicio(){}
    
    public Raices crearRaiz(){
        Raices raiz = new Raices();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer coeficiente: ");
        raiz.setA(sc.nextInt());
        System.out.println("Ingrese segundo coeficiente: ");
        raiz.setB(sc.nextInt());
        System.out.println("Ingrese tercer coeficiente: ");
        raiz.setC(sc.nextInt());
        
        return raiz;
    }
    
    public int getDescriminate(Raices raiz){
        return (int)(Math.pow(raiz.getB(),2)-4*raiz.getA()*raiz.getC());
    }
    
    public boolean tieneRaiz(Raices raiz){ 
        if (getDescriminate(raiz) == 0) return false;
        else return true;
    }
    
    public boolean tieneRaices(Raices raiz){
        if (getDescriminate(raiz) == 0) return false;
        else return true;
    }
    
    public void obtenerRaices(Raices raiz){
        if (tieneRaices(raiz)){};
           // System.out.println("Salucion 1: " +  (- raiz.getB() + Math.sqrt((Math.pow(raiz.getB(),2)),2)-(4*raiz.getA()*raiz.getC())))/(2*raiz.getA()) ; 
           //  ", Salucion 2: " + getDescriminate(raiz) * -1);
    }
    
    public void obtenerRaiz(Raices raiz){
        if(tieneRaiz(raiz)){
            System.out.println("");
        }
    }
    
    public void calcular(Raices raiz){
        
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;
import java.util.Scanner;
import Entity.Services.CuentaBancariaService;
/**
 *
 * @author Diego
 */
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        CuentaBancariaService cuenta = new CuentaBancariaService();
        cuenta.crearCuenta();
        System.out.println("Ingrese cantidad a depositar: ");
        cuenta.ingresarSaldo(sc.nextDouble());
        cuenta.consultarSaldo();
        
        
        System.out.println("Ingrese cantidad a Retirar: ");
        cuenta.retirarSaldo(sc.nextDouble());
        cuenta.consultarSaldo();
        
        System.out.println("Ingrese cantidad a Retirar: ");
        cuenta.retirarSaldo(sc.nextDouble());
        cuenta.consultarSaldo();
        
        System.out.println("Extraccion rapida");
        cuenta.extraccionRapida();
        
        cuenta.consultarDatos();
        
    }
    
}

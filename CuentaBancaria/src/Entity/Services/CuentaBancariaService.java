/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Services;
import Entity.CuentaBancariaClass;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class CuentaBancariaService {
    
    private CuentaBancariaClass cuenta;
    
    Scanner sc = new Scanner(System.in);
    
    public void crearCuenta(){
         cuenta = new CuentaBancariaClass();
       
         
         System.out.println("Ingrese el numero de cuenta: ");
         cuenta.setNroCuenta(sc.nextInt());
         System.out.println("Ingrese DNI: ");
         cuenta.setNroDNI(sc.nextInt());
         System.out.println("Ingrese monto inicial: ");
         cuenta.setSaldoActual(sc.nextInt());
    }
    
    public void ingresarSaldo(double ingreso){
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
    }
    
    public void retirarSaldo(double retirar){  
        if(controlar(retirar)) cuenta.setSaldoActual(cuenta.getSaldoActual() - retirar);
        else retirarTodo();
    }
    
    public void extraccionRapida(){
        cuenta.setSaldoActual(cuenta.getSaldoActual()- (cuenta.getSaldoActual() * 0.20));
    }
    
    public void consultarSaldo(){
        System.out.println("Saldo Actual: " + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(){
        System.out.println("NroCuenta: " + cuenta.getNroCuenta());
        System.out.println("DNI: " + cuenta.getNroDNI());
        consultarSaldo();
    }
    
    private boolean controlar(double retiro){
       return cuenta.getSaldoActual() - retiro >= 0;
    }
    
    private void retirarTodo(){
        cuenta.setSaldoActual(cuenta.getSaldoActual()- cuenta.getSaldoActual());
    }
}

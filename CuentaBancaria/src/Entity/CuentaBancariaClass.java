/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Diego
 */
public class CuentaBancariaClass {
    private int nroCuenta;
    private long nroDNI;
    private double saldoActual;
    
    public CuentaBancariaClass(){};

    public int getNroCuenta() {
        return nroCuenta;
    }

    public long getNroDNI() {
        return nroDNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public void setNroDNI(long nroDNI) {
        this.nroDNI = nroDNI;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
}

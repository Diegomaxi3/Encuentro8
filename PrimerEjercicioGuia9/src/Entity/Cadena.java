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
public class Cadena {
    String cadena;
    int longitud;

    public Cadena() {
    }

    public Cadena(String cadena) {
        this.cadena = cadena;
        this.longitud = cadena.length();
    }

    public String getCadena() {
        return cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
           
}

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
public class Ahoracado {
    char [] palabra; 
    char [] encontradas;
    int cantOportunidades;
    
    public Ahoracado(){};
    public Ahoracado(char [] palabra,char [] encontradas,int cantOportunidades){
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.cantOportunidades = cantOportunidades;
    };
    
    public char[] getPalabra(){
        return this.palabra;
    }

    public char [] getEncontradas() {
        return encontradas;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public void setEncontradas(char [] encontradas) {
        this.encontradas = encontradas;
    }

    public void setCantOportunidades(int cantOportunidades) {
        this.cantOportunidades = cantOportunidades;
    }

    public int getCantOportunidades() {
        return cantOportunidades;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public class Cadena {
    //crear atributos - constructores -get&set - toString
    private String fraseCadena;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String fraseCadena, int longitud) {
        this.fraseCadena = fraseCadena;
        this.longitud = longitud;
    }

    public String getFraseCadena() {
        return fraseCadena;
    }

    public void setFraseCadena(String fraseCadena) {
        this.fraseCadena = fraseCadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "fraseCadena=" + fraseCadena + ", longitud=" + longitud + '}';
    }
    
    
}

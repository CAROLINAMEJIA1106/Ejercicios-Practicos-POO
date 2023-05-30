/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Serafini Gerardo
 */
public class NIF {
    private String letra;
    private int DNI;

    public NIF() {
    }

    public NIF(String letra, int DNI) {
        this.letra = letra;
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "NIF{" + "letra=" + letra + ", DNI=" + DNI + '}';
    }
    
}

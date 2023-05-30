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
public class CuentaBancaria {
    //creamos atributos
    private int numCta;
    private long dni;
    private double saldoCta;
    
    //creamos constructores

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numCta, long dni, int saldoCta) {
        this.numCta = numCta;
        this.dni = dni;
        this.saldoCta = saldoCta;
    }

   
    //creamos get y set

    public int getNumCta() {
        return numCta;
    }

    public void setNumCta(int numCta) {
        this.numCta = numCta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoCta() {
        return saldoCta;
    }

    public void setSaldoCta(double saldoCta) {
        this.saldoCta = saldoCta;
    }

    
    
    //creamos toString

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numCta=" + numCta + ", dni=" + dni + ", saldoCta=" + saldoCta + '}';
    }
    
}

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
public class Arreglos {
    private double[] A;
    private double[] B;
    private int tamA;
    private int tamB;
    //public double[] setA;

    public Arreglos() {
    }

    public Arreglos(double[] A, double[] B, int tamA, int tamB) {
        this.A = A;
        this.B = B;
        this.tamA = tamA;
        this.tamB = tamB;
    }

    public double[] getA() {
        return A;
    }

    public void setA(double[] A) {
        this.A = A;
    }

    public double[] getB() {
        return B;
    }

    public void setB(double[] B) {
        this.B = B;
    }

    public int getTamA() {
        return tamA;
    }

    public void setTamA(int tamA) {
        this.tamA = tamA;
    }

    public int getTamB() {
        return tamB;
    }

    public void setTamB(int tamB) {
        this.tamB = tamB;
    }

    @Override
    public String toString() {
        return "Arreglos{" + "A=" + A + ", B=" + B + ", tamA=" + tamA + ", tamB=" + tamB + '}';
    }
    
    
    

    
    
    
}

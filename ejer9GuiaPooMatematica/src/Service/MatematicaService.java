/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Matematica;

/**
 *
 * @author Carolina
 */
public class MatematicaService {
    
    public double Mayor(Matematica mat){
        return Math.max(mat.getNumero1(), mat.getNumero2());
    }
    public void calcularPotencia(Matematica mat){
        int num1 = (int) Math.round(mat.getNumero1());
        int num2 = (int) Math.round(mat.getNumero2());
        int nummayor = Math.max(num1, num2);
        int nummenor = Math.min(num1, num2);
        
        System.out.println(" "+nummayor);
        System.out.println(" "+nummenor);
        
        System.out.println("Potencia es igual a: " + Math.pow(nummayor, nummenor));
        
    }
    public void calcularRaiz(Matematica mat){
        int num1 = (int) Math.abs(mat.getNumero1());
        int num2 = (int) Math.abs(mat.getNumero2());
        int nummayor = Math.max(num1, num2);
        int nummenor = Math.min(num1, num2);
        
        System.out.println(" "+nummayor);
        System.out.println(" "+nummenor);
        
        System.out.println("Raiz Cuadrada es igual a: " + Math.sqrt(nummenor));
    }
}

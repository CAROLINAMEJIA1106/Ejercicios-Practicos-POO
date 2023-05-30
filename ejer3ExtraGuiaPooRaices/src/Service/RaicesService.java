/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class RaicesService {
    Scanner leer = new Scanner(System.in);
    public Raices ingresarDatos(){
        Raices r = new Raices();
        System.out.println("Por favor ingrese los coeficientes: ");
        System.out.print("A = ");
        r.setA(leer.nextDouble());
        System.out.println(" ");
        System.out.print("B = ");
        r.setB(leer.nextDouble());
        System.out.println(" ");
        System.out.print("C = ");
        r.setC(leer.nextDouble());
        System.out.println(" ");
        
        return r;
    }
    
    public double getDiscriminante(Raices r){
        double dis;
        dis = Math.pow(r.getB(), 2) - (4*r.getA()*r.getC());
        return dis;
    }
    public boolean tieneRaices(Raices r){
        //tiene dos raices
        
        return getDiscriminante(r) > 0;
    }
    public boolean tieneRaiz(Raices r){
        //tiene una sola raíz
        return getDiscriminante(r) == 0;
        
    }
    public void calcular(Raices r){
         if(tieneRaices(r)){
            obtenerRaices(r);
        }else if(tieneRaiz(r)){
            obtenerRaiz(r);
        }else{
            System.out.println("Error --- No tiene solución");
        }        
    }
            
    
    public void obtenerRaices(Raices r){
        double resultado1;
        double resultado2;
        resultado1 = (-r.getB()+ Math.sqrt(getDiscriminante(r))) / (2*r.getA());
        resultado2 = (-r.getB()- Math.sqrt(getDiscriminante(r))) / (2*r.getA());
        if(tieneRaices(r)){
            System.out.println("Las dos soluciones son: ");
            System.out.println("Resultado 1 = " + resultado1);
            System.out.println("Resultado 2 = " + resultado2);
        }
    }
    public void obtenerRaiz(Raices r){
        double resultado;
        resultado = (-r.getB()+ Math.sqrt(getDiscriminante(r))) / (2*r.getA());
        if(tieneRaiz(r)){
            System.out.println("Tiene una única solución: ");
            System.out.println(" " + resultado);
        }
    }
}

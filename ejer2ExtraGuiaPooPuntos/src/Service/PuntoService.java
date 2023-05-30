/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class PuntoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //creo métodos
    public Puntos crearPuntos(){
        //instancio objeto tipo puntos
        Puntos p = new Puntos();
        System.out.println("Por favor ingrese las coordenadas del punto A: ");//solicito coordenadas
        System.out.print("X1 = ");
        p.setX1(leer.nextInt());
        System.out.println(" ");
        System.out.print("Y1 = ");
        p.setY1(leer.nextInt());
        
        System.out.println("Por favor ingrese las coordenadas del punto B: ");//solicito coordenadas
        System.out.print("X2 = ");
        p.setX2(leer.nextInt());
        System.out.println(" ");
        System.out.print("Y2 = ");
        p.setY2(leer.nextInt());
        
        return p;
    }
    
    public double calcularDistancia(Puntos p){
        
        double distancia;
        double a1 = p.getX1();
        double a2 = p.getX2();
        double b1 = p.getY1();
        double b2 = p.getY2();
        double r = a2-a1;
        double g = b2-b1;
        
        double dist = Math.pow(r,2) + Math.pow(g,2);
        distancia = Math.sqrt(dist);
        
        return distancia;
        
    }
}

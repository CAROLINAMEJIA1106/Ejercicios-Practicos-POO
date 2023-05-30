/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class CafeteraService {
    Scanner leer = new Scanner(System.in);
    //creo método e instancio objeto
    public Cafetera llenarCafetera(){
        Cafetera caf = new Cafetera();
        System.out.println("Ingrese la capacidad máxima de la Cafetera: ");
        caf.setCapacidadMax(leer.nextInt());
        do {
            System.out.println("Llenando...");
            System.out.println(" ");
            caf.setCantidadActual(caf.getCapacidadMax());
        } while (caf.getCantidadActual() != caf.getCapacidadMax());
        
        return caf;
    }
    //creo método servir Taza
    public void servirTaza(Cafetera caf){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el tamaño de la taza: ");
        int tamanoTaza = leer.nextInt();
        if (caf.getCantidadActual() < tamanoTaza) {
            System.out.println("No se alcanzará a llenar su taza, porque la "
                    + "cantidad de café en la cafetera es menor.");
            System.out.println(" ");
            System.out.println("Llenando...");
            System.out.println(" ");
            System.out.println("La taza se llenó con: " + caf.getCantidadActual());
            caf.setCantidadActual(0);
         
        }else{
            System.out.println("Llenando...");
            System.out.println(" ");
            System.out.println("Taza Llena");
            caf.setCantidadActual(caf.getCantidadActual() - tamanoTaza);
            
        }
    }
    //creo método vaciar Cafetera
    public void vaciarCafetera(Cafetera caf){
        System.out.println("Se está vaciando la cafetera...");
        System.out.println(" ");
        caf.setCantidadActual(0);
        
    }
    //creo método agregar Café
    public void agregarCafe(Cafetera caf){
        Scanner leer = new Scanner(System.in);
        int cantCafe;
               
        do{
        System.out.println("Por favor ingrese la cantidad de café que se "
                + "añadirá a la cafetera: ");
        cantCafe = leer.nextInt();
        if((cantCafe + caf.getCantidadActual()) > caf.getCapacidadMax()){
            System.out.println("Esa cantidad rebosará la cafetera...");
        }
        }while ((cantCafe + caf.getCantidadActual()) > caf.getCapacidadMax());
        System.out.println("Llenando la cafetera....");
        System.out.println(" ");
        caf.setCantidadActual(cantCafe + caf.getCantidadActual());
    }
    
}


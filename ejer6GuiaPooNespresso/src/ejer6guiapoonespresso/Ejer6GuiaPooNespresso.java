/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer6guiapoonespresso;

import Entidad.Cafetera;
import Service.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejer6GuiaPooNespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // se instancia objeto del tipo servicio y del tipo Cafetera
        CafeteraService cafser = new CafeteraService();
        Cafetera caf1 = cafser.llenarCafetera();
        int opcion;
        System.out.println(" ---- NESPRESSO -------(capacidad en onzas)");
        System.out.println("MENÚ DE OPCIONES: ");
        System.out.println("1. Servir Taza");
        System.out.println("2. Vaciar Cafetera");
        System.out.println("3. Agregar café");
        System.out.println("4. Consultar datos de la Cafetera");
        System.out.println("5. Salir");
        
        do {
            System.out.println("¿Qué desea hacer?: ");
            opcion = leer.nextInt();
        if (opcion <= 0 || opcion > 5) {
            System.out.println("----Opción inválida---");
        }else{
            switch (opcion) {
                case 1:
                    cafser.servirTaza(caf1);
                    break;
                case 2:
                    cafser.vaciarCafetera(caf1);
                    break;
                case 3:
                    cafser.agregarCafe(caf1);
                    break;
                case 4:
                    System.out.println(" " + caf1);
                    break;
                
            }
            
        }
            
                    
            
        } while (opcion != 5);
        System.out.println("Gracias por utilizar ---NESPRESOO---"
                            + "Hasta la próxima!!");
        
        
    }
    
}

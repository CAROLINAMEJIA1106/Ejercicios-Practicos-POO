/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2extraguiapoopuntos;

import Entidad.Puntos;
import Service.PuntoService;

/**
 *
 * @author Carolina
 */
public class Ejer2ExtraGuiaPooPuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instancio objeto tipo Service y tipo Puntos
        PuntoService ps = new PuntoService();
        Puntos p1 = ps.crearPuntos();
        
        System.out.println(" " + p1);
        System.out.println("La distancia entre las cooerdenadas de los dos puntos "
                + "ingresados es: " + ps.calcularDistancia(p1));
        
    }
    
}

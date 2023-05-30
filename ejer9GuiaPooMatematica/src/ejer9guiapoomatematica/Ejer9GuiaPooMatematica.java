/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer9guiapoomatematica;

import Entidad.Matematica;
import Service.MatematicaService;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejer9GuiaPooMatematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Matematica mat = new Matematica();
        mat.setNumero1(Math.random()*10);
        mat.setNumero2(Math.random()*10);
        
        System.out.println("Numero 1: " + mat.getNumero1());
        System.out.println("Número 2: " + mat.getNumero2());
        
        //instanciar servicio
        MatematicaService ms = new MatematicaService();
        
        System.out.println("El número de mayor valor es: " + ms.Mayor(mat));
        
        ms.calcularPotencia(mat);
        ms.calcularRaiz(mat);
    }
    
}

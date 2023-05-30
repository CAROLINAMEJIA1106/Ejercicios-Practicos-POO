/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer5extraguiapooadivinandomes;

import Entidad.Meses;
import Service.MesesService;

/**
 *
 * @author Carolina
 */
public class Ejer5ExtraGuiaPooAdivinandoMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciamos objetos de servicio y tipo Meses
        MesesService ms = new MesesService();
        Meses m = ms.crearDatos();
        
        System.out.println("--------HOLA USUARIO-----");
        System.out.println("----Bienvenido al programa de adivinar el mes secreto----");
        ms.Adivinar(m);
        System.out.println(" " +m);
    }
    
}

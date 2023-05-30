/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3extraguiapooraices;

import Entidad.Raices;
import Service.RaicesService;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejer3ExtraGuiaPooRaices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //instancio objeto servicio y objeto Raices
                
        RaicesService rs = new RaicesService();
        
        Raices r = rs.ingresarDatos();
        rs.calcular(r);
        
        
    }
    
}

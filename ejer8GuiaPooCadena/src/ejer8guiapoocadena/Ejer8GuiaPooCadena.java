/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8guiapoocadena;

import Entidad.Cadena;
import Service.CadenaService;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejer8GuiaPooCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //creamos objeto tipo Cadena
        Cadena frasecad = new Cadena();
        //ingresamos frase principal
        System.out.println("Por favor ingrese una frase: ");
        frasecad.setFraseCadena(leer.next());
        frasecad.setLongitud(frasecad.getFraseCadena().length());
        
        //instanciamos un objeto del tipo servicio
        CadenaService cs = new CadenaService();
        cs.mostrarVocal(frasecad);
        cs.invertirFrase(frasecad);
        cs.caracterRepetido(frasecad);
        cs.compararLongitud(frasecad);
        cs.unirFrases(frasecad);
        cs.reemplazo(frasecad);
        cs.contiene(frasecad);
        
        
        
    }
    
}

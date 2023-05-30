/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4extraguiapoonif;

import Entidades.NIF;
import Service.NIFService;

/**
 *
 * @author Serafini Gerardo
 */
public class Ejer4ExtraGuiaPooNIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      NIFService cod = new NIFService();
      NIF codigo = cod.crearNIF();
      
      cod.mostrar(codigo);
    }
    
}

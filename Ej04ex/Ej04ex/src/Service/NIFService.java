/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Serafini Gerardo
 */
public class NIFService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public NIF crearNIF(){
    NIF codigo = new NIF(); 
        System.out.println("Ingrese su DNI: ");
        codigo.setDNI(leer.nextInt());
        
        int res = codigo.getDNI()%23;
        
        String letras[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N",
            "J","Z","S","Q","V","H","L","C","K","E"};
       
        codigo.setLetra(letras[res]);
        
        
       return codigo; 
    
}
    public void mostrar(NIF codigo){
        System.out.println("Su NIF (con el código verificador) es: ");
        System.out.println("" + codigo.getDNI() + "-" + codigo.getLetra());
        
    }
    
}

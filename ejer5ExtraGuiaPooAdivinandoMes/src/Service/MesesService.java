/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class MesesService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Meses crearDatos(){
        Meses m = new Meses();
        
        String vectorMeses[] = {"enero","febrero","marzo","abril","mayo","junio","julio"
                ,"agosto","septiembre","octubre","noviembre","diciembre"};
        
        m.setMesSecreto(vectorMeses[8]);
        
        return m;
        
        
    }
    
    public void Adivinar(Meses m){
        
        String mesUsuario;
        String mesUmin;
        do{
            do{
            System.out.println("Introduzca el nombre del mes en minúsculas: ");
            mesUsuario = leer.next();
            mesUmin = mesUsuario.toLowerCase();


            }while(!mesUsuario.equals(mesUmin));

            if(mesUsuario.equals(m.getMesSecreto())){
                System.out.println(" Felicitaciones!!!! Has acertado");

            }else{
                System.out.println("FALLASTE --- No has acertado");
                System.out.println("Inténtalo nuevamente");

            }
        }while(!mesUsuario.equals(mesUmin) || !mesUsuario.equals(m.getMesSecreto()));
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer7guiapoopesoideal;

import Entidad.Persona;
import Service.PersonaService;

/**
 *
 * @author Carolina
 */
public class Ejer7GuiaPooPesoIdeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciamos objeto del tipo Servicio y Persona
        PersonaService ps = new PersonaService();
        
        
        //declaramos array
        Persona listaPersonas[];
        //instanciar array de 4 personas
        listaPersonas = new Persona[4]; 
        for (int i = 0; i < listaPersonas.length; i++) {
            
            listaPersonas[i] = ps.crearPersona();
        }
        System.out.println(" ");
        //instancio cada objeto tipo persona
        Persona p1 = listaPersonas[0];
        Persona p2 = listaPersonas[1];
        Persona p3 = listaPersonas[2];
        Persona p4 = listaPersonas[3];
        // utilizo los metodos de imc y edad para cada persona creada 
        // y muestro por pantalla
        
        int bajopeso = 0; //contadores
        int pesoideal = 0;
        int sobrepeso = 0;
        int mayoredad = 0;
        int menoredad = 0;
                
        for (int i = 0; i < listaPersonas.length; i++) {
            if(ps.calcularImc(listaPersonas[i]) == -1){
                System.out.println(" " + listaPersonas[i]);
                System.out.println("Persona según IMC con:  BAJO PESO");
                bajopeso += 1;
            }else{
            if(ps.calcularImc(listaPersonas[i]) == 0){
                System.out.println(" " + listaPersonas[i]);
                System.out.println("Persona según IMC con:  PESO IDEAL");
                pesoideal += 1;
            }else{
                if(ps.calcularImc(listaPersonas[i]) == 1){
                    System.out.println(" " + listaPersonas[i]);
                    System.out.println("Persona según IMC con:  SOBREPESO");
                    sobrepeso += 1;
                }
            }
            }
            if(ps.mayorEdad(listaPersonas[i]) == true){
                System.out.println("La persona es Mayor de Edad");
                mayoredad += 1;
            }else{
                System.out.println("La persona es Menor de Edad");
                menoredad += 1;
            }
            System.out.println(" ");
        }
        
        //creamos el calculo para el porcentaje de imc y mayores de edad
        
        double porcBajopeso;
        double porcPesoideal;
        double porcSobrepeso;
        double porcmayoredad;
        double porcmenoredad;
                
        porcBajopeso = (bajopeso * 100) / 4;
        porcPesoideal = (pesoideal * 100) / 4;
        porcSobrepeso = (sobrepeso * 100) / 4;
        porcmayoredad = (mayoredad * 100) / 4;
        porcmenoredad = (menoredad * 100) / 4;
        
        System.out.println(" ");
        
        System.out.println("El porcentaje de las personas que están con Bajo "
                + "Peso es del: " + porcBajopeso + " %");
        System.out.println("El porcentaje de las personas que están con Peso "
                + "Ideal es del: " + porcPesoideal + " %");
        System.out.println("El porcentaje de las personas que están con Sobre "
                + "Peso es del: " + porcSobrepeso + " %");
        System.out.println("El porcentaje de las personas que son mayores "
                + "de Edad es del: " + porcmayoredad + " %");
        System.out.println("El porcentaje de las personas que son menores "
                + "de Edad es del: " + porcmenoredad + " %");
        
        System.out.println(" ");
        
  
    }
    
}

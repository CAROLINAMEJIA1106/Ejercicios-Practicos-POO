/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class CadenaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //creamos métodos
    
    //método mostrar cantidad de vocales
    public void mostrarVocal(Cadena frasecad){
        
        String fraseppal = frasecad.getFraseCadena();
        int longi = frasecad.getLongitud();
        
        char letrasFrase[]; //CREAMOS ARRAY TIPO CHAR CON LA FRASE
        letrasFrase = new char[longi];
        
        String lFrase[]; //CREAMOS UN ARRAY TIPO STRING
        lFrase = new String[longi];
        
        int contvocales = 0; //CONTADOR DE VOCALES
        
        for (int i = 0; i < longi; i++) {
            letrasFrase[i] = fraseppal.charAt(i);
            lFrase[i] = String.valueOf(letrasFrase[i]); //convierto a string el array tipo char
         
        }
        for (int i = 0; i < longi; i++) {
            if(lFrase[i].equalsIgnoreCase("a")|| lFrase[i].equalsIgnoreCase("e") 
                    || lFrase[i].equalsIgnoreCase("i")|| lFrase[i].equalsIgnoreCase("o")
                    || lFrase[i].equalsIgnoreCase("u")){
                contvocales += 1;
            
            }
        }
        System.out.println("La frase ingresada contiene: " + contvocales + " vocales");
        
    }
    //método invertir frase
    public void invertirFrase(Cadena frasecad){
        String fraseInvertida = "";
        String fraseoriginal = frasecad.getFraseCadena();
        int longi = frasecad.getLongitud();
        
        for (int i = longi-1; i >= 0; i--) {
            fraseInvertida += fraseoriginal.charAt(i);
        }
        
        System.out.println("La frase invertida es: " + fraseInvertida);
    }
    //método caracter repetido
    public void caracterRepetido(Cadena frasecad){
        System.out.println("Por favor ingrese un caracter: ");
        String caract = leer.next();
        int cont = 0;
        
        for (int i = 0; i < frasecad.getLongitud(); i++) {
            if(caract.equalsIgnoreCase(String.valueOf(frasecad.getFraseCadena().charAt(i)))){
                cont += 1;
            } 
        }         
        System.out.println("El caracter " + caract + " se repite en la frase " + cont + " veces");
    }
    //método comparar logitud
    public void compararLongitud(Cadena frasecad){
        System.out.println("Por favor ingrese otra frase: ");
        String otrafrase = leer.next();
        int longitud2 = otrafrase.length();
        if(longitud2 == frasecad.getLongitud()){
            System.out.println("Las dos frases tienen la misma longitud que es: " + longitud2);            
        }else{
            System.out.println("Las dos frases tienen distintas longitudes así: ");
            System.out.println("Frase original: " + frasecad.getLongitud());
            System.out.println("Frase nueva: " + longitud2);
        }
    }
    //método unir frases
    public void unirFrases(Cadena frasecad){
        System.out.println("Por favor ingrese otra frase: ");
        String otrafrase = leer.next();
        System.out.println("Las frases unidas quedan así: ");
        System.out.println(" " + frasecad.getFraseCadena().concat(otrafrase));
    }
    //método reemplazar String
    public void reemplazo(Cadena frasecad){
        String fraseFinal;
        System.out.println("Por favor ingrese el caracter con el cual va a "
                + "reemplazar la letra 'a' de la frase: ");
        String caracter = leer.next();
        fraseFinal = frasecad.getFraseCadena().replace("a", caracter);
        System.out.println("La frase original: " + frasecad.getFraseCadena());
        System.out.println("La frase final queda así: " + fraseFinal);
    }
    public void contiene(Cadena frasecad){
        int cont = 0;
        System.out.println("Por favor digite una letra cualquiera: ");
        String letra = leer.next();
        for (int i = 0; i < frasecad.getLongitud(); i++) {
            if(letra.equalsIgnoreCase(frasecad.getFraseCadena().substring(i, i))){
                cont += 1;            
            }
        }
        if(cont == 0){
            System.out.println("FALSO");
            System.out.println("La letra no está contenida");
        }else{
            System.out.println("VERDADERO");
            System.out.println("La letra está contenida");
        }
        
    }
    
}

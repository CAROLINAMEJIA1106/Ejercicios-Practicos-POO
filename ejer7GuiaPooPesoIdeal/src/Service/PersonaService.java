/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String aF;
    //creamos método e instanciamos objeto Persona
    public Persona crearPersona(){
        Persona per = new Persona();
        boolean verificacionsexo;
        
        
        
        //solicitamos datos para llenar atributos
        System.out.println("Por favor ingrese el nombre completo: ");
        per.setNombre(leer.next());
        
        System.out.println("Por favor ingrese la edad: ");
        per.setEdad(leer.nextInt());
        
        do {
            System.out.println("Por favor ingrese el sexo(H-Hombre ó M-Mujer u O-Otro): ");
            per.setSexo(leer.next());
            verificacionsexo = per.getSexo().equalsIgnoreCase("M")|| per.getSexo().equalsIgnoreCase("H") || per.getSexo().equalsIgnoreCase("O");
            if(verificacionsexo == false){
                System.out.println("---Dato inválido--");
                System.out.println("Ingrese solamente H para hombre ó M para mujer u O para otro");
            }
        } while (verificacionsexo == false);
        
        System.out.println("Por favor ingrese el peso en Kg: ");
        per.setPeso(leer.nextDouble());
        
        System.out.println("Por favor ingrese la altura en metros: ");
        per.setAltura(leer.nextDouble());
        
        do{
        System.out.println("Tiene una rutina de actividad física? (responda S para si ó N para no): ");
        aF = leer.next();
        if(aF.equalsIgnoreCase("S")){
            per.setActividadFisica(true);
        }else{
            if(aF.equalsIgnoreCase("N")){
                per.setActividadFisica(false);
            }
        }
        }while(!aF.equalsIgnoreCase("S") && !aF.equalsIgnoreCase("N"));
        
        return per;
    }
    //creamos método IMC
    public int calcularImc(Persona per){
        int imc=0;
        double peso = per.getPeso() / Math.pow(per.getAltura(),2);
        
        if(peso < 20){
            imc = -1;
        }else{
            if(peso<=25){
                imc = 0;
            }else{
                if(peso>25){
                    imc = 1;
                }
            }
        }
        return imc;
      
    }
    //creamos método mayorEdad
    public boolean mayorEdad(Persona per){
        boolean mayorDeEdad;
        
        mayorDeEdad = per.getEdad() >= 18;
        
        return mayorDeEdad;
    }
    public int ActivFisica(Persona per){
        int activF = 0;
        
        if(per.isActividadFisica() == true){
            activF += 1;
        }
        return activF;
    }
}

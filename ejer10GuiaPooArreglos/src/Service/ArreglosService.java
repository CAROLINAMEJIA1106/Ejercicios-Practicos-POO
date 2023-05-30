/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Arreglos;
import java.util.Arrays;
import java.util.Scanner;



/**
 *
 * @author Carolina
 */
public class ArreglosService {
    Scanner leer = new Scanner(System.in);
    
    //crear métodos
    public void Generar(){
        //instancio un objeto de tipo Arreglos
        Arreglos arr = new Arreglos();
        
        arr.setTamA(50);
        arr.setTamB(20);
        
        arr.setA(new double[arr.getTamA()]);//declaro tamaños
        arr.setB(new double[arr.getTamB()]);
        
        
        double Aotro[];
        Aotro = new double[50];
        double Botro[];
        Botro = new double[20];
        
        //generar arreglo A 
        System.out.println("ARREGLO A: ");
        for (int i = 0; i < arr.getTamA(); i++) {
            Aotro[i] = Math.random()*60;
            arr.setA(Aotro);
            System.out.print("[" + arr.getA()[i] + "]");
         
        }
        //genero arreglo B
        System.out.println(" ");
        System.out.println("ARREGLO B: ");
        for (int i = 0; i < arr.getTamB(); i++) {
            Botro[i] = Math.random()*30;
            arr.setB(Botro);
            System.out.print("[" +arr.getB()[i] + "]");
        }
        System.out.println(" ");
        System.out.println("Arreglo A ordenado");
        Arrays.sort(Aotro);
        for (int i = 0; i < 50; i++) {
            System.out.print("[" + Aotro[i] + "]");
        }
        System.out.println(" ");
        
        for (int i = 0; i < 10; i++) {
            Botro[i] = Aotro[i]; //copio los 10 primeros de A
        }
        for (int i = 10; i < 20; i++) {
            Botro[i] = 0.5;
        }
        
        System.out.println("El arreglo B combinado es: ");
        for (int i = 0; i < 20; i++) {
            System.out.print("[" + Botro[i] + "]");
        }
        
        
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class CuentaService {

    //creamos método crear Cuenta parainstanciar un objeto de tipo Cuenta Bancaria
    public CuentaBancaria crearCta() {
        CuentaBancaria cta1 = new CuentaBancaria();

        //empezamoa a guardar la información de todos los atributos
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el número de la cuenta: ");
        cta1.setNumCta(leer.nextInt());

        System.out.println("Por favor ingrese su DNI de identificación: ");
        cta1.setDni(leer.nextLong());

        System.out.println("Por favor ingrese el saldo actual de su cuenta: ");
        cta1.setSaldoCta(leer.nextDouble());

        return cta1;
    }

    //método ingresar dinero
    public void Ingresar(CuentaBancaria cta1) {
        
        Scanner leer = new Scanner(System.in);
        //leo la consignación y la sumo al saldo de la cuenta
        System.out.println("Por favor digite el valor a consignar: ");
        cta1.setSaldoCta(cta1.getSaldoCta() + leer.nextDouble());

    }

    //método retirar dinero
    public void Retirar(CuentaBancaria cta1) {
        
        Scanner leer = new Scanner(System.in);
        //introduzco el valor del retiro y compruebo
        System.out.println("Por favor ingrese el valor a retirar: ");
        double retiro = leer.nextDouble();
        if (cta1.getSaldoCta() > retiro) {
            cta1.setSaldoCta(cta1.getSaldoCta() - retiro);
        } else {
            cta1.setSaldoCta(0);
        }

    }

    //método extracción rápida
    public void ExtraccionRapida(CuentaBancaria cta1) {
        
        double exrap = cta1.getSaldoCta() * 0.20;
        cta1.setSaldoCta(cta1.getSaldoCta() - exrap);
        System.out.println("Usted retirará el valor de: " + exrap);
        
    }
    //método consultar saldo
    public void ConsultarSaldo(CuentaBancaria cta1){
                     
        System.out.println("Su saldo actual es de: " + cta1.getSaldoCta());
    }
    //método consultar datos
    public void ConsultarDatos(CuentaBancaria cta1){
 
        System.out.println(" " + cta1);
    }

        
        
    


        
        
    
    
    
    
}

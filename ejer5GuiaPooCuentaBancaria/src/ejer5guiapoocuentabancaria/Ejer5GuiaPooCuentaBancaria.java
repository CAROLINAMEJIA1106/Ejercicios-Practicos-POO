/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer5guiapoocuentabancaria;

import Entidad.CuentaBancaria;
import Service.CuentaService;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejer5GuiaPooCuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //instanciamos un objeto del tipo servicio
        
        CuentaService cs = new CuentaService();
        //intanciamos un objeto del tipo CuentaBancaria
        CuentaBancaria cta = cs.crearCta();
        int opcion;
        System.out.println("MENÚ DE OPCIONES: ");
        System.out.println("1. INGRESO");
        System.out.println("2. RETIRO");
        System.out.println("3. EXTRACCIÓN RÁPIDA");
        System.out.println("4. CONSULTAR SALDO");
        System.out.println("5. CONSULTAR DATOS");
        System.out.println("6. SALIR");
        
        do {
            System.out.println("¿Qué desea hacer?: ");
            opcion = leer.nextInt();
        if (opcion <= 0 || opcion > 6) {
            System.out.println("----Opción inválida---");
        }else{
            switch (opcion) {
                case 1:
                    cs.Ingresar(cta);
                    break;
                case 2:
                    cs.Retirar(cta);
                    break;
                case 3:
                    cs.ExtraccionRapida(cta);
                    break;
                case 4:
                    cs.ConsultarSaldo(cta);
                    break;
                case 5:
                    cs.ConsultarDatos(cta);
                    break;
                case 6:
                    break;
                
            }
            
        }
            
            
        } while (opcion != 6);
        System.out.println("Gracias por utilizar este servicio-"
                            + "Hasta la próxima!!");
        

    }
    
}

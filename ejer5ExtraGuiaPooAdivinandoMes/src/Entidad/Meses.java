/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public class Meses {
    //atributos
    
    private String mesSecreto;
    
    //constructores

    public Meses() {
    }

    public Meses(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    @Override
    public String toString() {
        return "Meses{" + "mesSecreto=" + mesSecreto + '}';
    }

    

   
    
    

    
    
}

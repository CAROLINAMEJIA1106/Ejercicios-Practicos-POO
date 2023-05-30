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
public class Persona {
    //creamos atributos
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private boolean actividadFisica;
    
    //creamos constructores
    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura, boolean actividadFisica) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.actividadFisica = actividadFisica;
    }
    
    //creamos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isActividadFisica() {
        return actividadFisica;
    }

    
    public void setActividadFisica(boolean actividadFisica) {
        this.actividadFisica = actividadFisica;
    }
    
    //creamos toString

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", actividadFisica=" + actividadFisica + '}';
    }
    
    
    
}
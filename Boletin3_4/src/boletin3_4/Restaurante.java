/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_4;

/**
 *
 * @author Pablo
 */
public class Restaurante {
    
    private float polbo;
    private float patacas;

    public Restaurante() {
        polbo = 0;
        patacas = 0;
    }
     public Restaurante(float polbo, float patacas) {
        this.polbo = polbo;
        this.patacas = patacas;
    }

    public float getPolbo() {
        return polbo;
    }

    public void setPolbo(float polbo) {
        this.polbo = polbo;
    }

    public float getPatacas() {
        return patacas;
    }

    public void setPatacas(float patacas) {
        this.patacas = patacas;
    }

    public void engadirPolbo(int x) {
        polbo = polbo + x;
    }

    public void engadirPatacas(int x) {
        patacas = patacas + x;
    }

    public void amosarPolbo() {
        System.out.println("Polbo= " + polbo + " kg");
    }

    public void amosarPatacas() {
        System.out.println("Patacas= " + patacas + " kg");
    }

    public int calculaClientes() {
        int personasPulpo = (int) (polbo * 2);
        int personasPatacas = (int) (patacas * 1.5);
        if (personasPulpo > personasPatacas) {
            return personasPatacas;
        }
        return personasPulpo;
    }
    
}

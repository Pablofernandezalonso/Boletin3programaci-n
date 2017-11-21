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
public class Boletin3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Restaurante probapulpeiros = new Restaurante (5,2);
        probapulpeiros.engadirPolbo(5);
        probapulpeiros.engadirPatacas(1);
        System.out.println("Aforo= "+probapulpeiros.calculaClientes());
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_1;

/**
 *
 * @author Pablo
 */
public class Boletin3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coche cocheproba = new Coche();
        System.out.println("Velocidade inicial = "+cocheproba.getVelocidade()+"Km/h");
        cocheproba.acelerar(120);
        System.out.println("Velocidade maxima = "+cocheproba.getVelocidade()+"Km/h");
        cocheproba.frenar(70);
        System.out.println("velocidade despois de frenar = "+cocheproba.getVelocidade()+"Km/h");
        
    }
    
}

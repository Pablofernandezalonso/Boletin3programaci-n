/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_3;

/**
 *
 * @author Pablo
 */
public class Boletin3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo circuloproba = new Circulo();
        circuloproba.setRadio(5);
        System.out.println(circuloproba.getRadio());
        System.out.println(circuloproba.calcularArea());
        System.out.println(circuloproba.calcularLonxitude());
    }
        
    }
    


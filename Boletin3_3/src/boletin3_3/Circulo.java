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
public class Circulo {
    
    private double radio;
    static private double pi = 3.14;

public Circulo(){
}
public Circulo(double r){
    radio = r;
}
public void setRadio(double r){
    radio = r;
}
public double getRadio(){
    return radio;
}
public double calcularArea(){
    double area = pi*Math.pow(radio,2);
    return area;
}
public double calcularLonxitude(){
    double lonxitude = 2*pi*radio;
    return lonxitude;
}
    
}

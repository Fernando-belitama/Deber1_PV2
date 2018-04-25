/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.aplicacion;

import javax.swing.JOptionPane;

/**
 *
 * @author FERNANDO
 */
public class Ejercicio3 {
    
    
    /*
    
    EJERCICIO 13
    
    Desarrolle una solucion que permita calcular el area de un cuadrdo y el area de un 
    triangulo rectangulo, considere: 
    
    area del cuadrado = lado2;
    area del triangulo rectangulo=(base x altura)/2
    */
    
    public static void main(String[] args) {
        
        double lado, base, altura, areaCuadrado, areaTringulo;
        
        lado=Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL LADO DEL CUADRADO : "));
        base=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA BASE DEL TRIANGULO : "));
        altura=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA ALTURA DEL TRIANGULO : "));
        
        areaCuadrado=lado*lado;
        areaTringulo=(base*altura)/2;
        
        JOptionPane.showMessageDialog(null,"EL AREA DEL CUADRADO ES : "+areaCuadrado+"\n"
                + "EL AREA DEL TRIANGULO ES : "+areaTringulo);

    }
    
}

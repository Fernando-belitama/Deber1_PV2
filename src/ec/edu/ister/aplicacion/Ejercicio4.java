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
public class Ejercicio4 {
    
    /*
    
    PROBLEMA 14
    
    Desarrolle un solucion que permita ingresar una cantidad de dinero en dolares,
    mostrando la menor cantidad de billetes de 100, 50, 10 y monedas de 1 dolar que
    seran necesarios para completar la cantidad ingresada.
    
    */
    
    public static void main(String[] args) {
        
        
        int dolares, b100, b50, b10, m1;
        
        dolares=Integer.parseInt(JOptionPane.showInputDialog("INGRESE UNA CANTIDAD DE DOLARES : "));
        
        b100= dolares/100;
        b50= dolares % 100/50;
        b10=dolares % 100 % 50 / 10;
        m1= dolares % 100 % 50 % 10;
        
        JOptionPane.showMessageDialog(null,"CANTIDAD DE BILLETES DE $100 ->     "+ b100+ "\n"
        + "CANTIDAD DE BILLETES DE $50 ->     "+ b50+"\n"
        + "CANTIDAD DE BILLETES DE $10 ->     "+b10+"\n"
        + "CANTIDAD DE MONEDAS DE $1 ->     "+ m1);
        
        
        
        
    }
}

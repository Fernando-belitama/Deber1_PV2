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
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        //EJERCICIO NUMERO 12
        /*
        Diseñe un programa que permita ingresar dos núemeros enteros, y muestre la suma de los digitos correspondientes a las unidades, 
        decenas y centenas de los números ingresados.
        */
        
        int numero1, numero2;
        
        int unidades1, unidades2, sumaUnidades;
        int decenas1, decenas2, sumaDecenas;
        int centenas1, centenas2, sumaCentenas;
        
        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 1:"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 2:"));
        
        unidades1=numero1%10;
        unidades2=numero2%10;
        
        decenas1=(numero1/10)%10;
        decenas2=(numero2/10)%10;
        
        centenas1=(numero1/100)%10;
        centenas2=(numero2/100)%10;
        
        sumaUnidades=unidades1+unidades2;
        sumaDecenas=decenas1+decenas2;
        sumaCentenas=decenas1+decenas2;
        
        JOptionPane.showMessageDialog(null, "Numeros ingresados "+ numero1+" y "+numero2);
        JOptionPane.showMessageDialog(null, "La suma de las unidades es:  "+ sumaUnidades + "\n "
        + "La suma de las decenas es : "+ sumaDecenas+ "\n"
        + "La suma de las centenas es : "+ sumaCentenas );
        
    }
    
}

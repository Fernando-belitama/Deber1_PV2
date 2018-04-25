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
public class Ejercicio5 {
    
    
    /*
    PROBLEMA 42
    
    Calcular el área de un rectangulo conociendo su base y altura. si el área es
    menor que 100, se debera visualizar el mensaje "rectangulo pequeño"; si el 
    área es mayor o igual a 100 y menor que 1000, se visualizara el mensaje 
    "rectangulo mediano"; y si el area es mayor o iagual que 1000,  el mensaje 
    sera "rectangulo grande".
    */
    public static void main(String[] args) {
        
        
        double base, altura, area;
        String mensaje;
        
        
        base=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA BASE DEL RECTANGULO :"));
        altura=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA ALTURA DEL RECTANGULO :"));
        
        area=base*altura;
        
        if(area< 100){
            mensaje="rectangulo pequeño";
        }else{
            
            if(area>=1000){
                mensaje="rectangulo grande";
            }else{
                mensaje="rectangulo mediano";
            }
        }
        JOptionPane.showMessageDialog(null,"EL AREA ES : "+area+"\n"
                + " Y ES UN : "+ mensaje);
    }
}

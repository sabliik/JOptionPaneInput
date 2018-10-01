/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parseoyjoptionpane;

import javax.swing.JOptionPane;

public class ParseoYJOptionPane {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido a la calculaora");
             
        String n1 = JOptionPane.showInputDialog("Ingrese el primer número");
        String n2 = JOptionPane.showInputDialog("Ingrese el segundo número");
        
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        
       double suma = num1 + num2;
       
       JOptionPane.showMessageDialog(null, "La suma de los números es "+ suma);
    }
    
}

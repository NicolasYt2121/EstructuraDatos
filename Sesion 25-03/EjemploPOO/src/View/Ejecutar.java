/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Dividir;
import Model.Resta;
import Model.Suma;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class Ejecutar {
    public static void main(String[] args) {
        Suma suma = new Suma();
        suma.setNumero1(Double.parseDouble(JOptionPane.showInputDialog("Digite el número 1: ")));
        suma.setNumero2(Double.parseDouble(JOptionPane.showInputDialog("Digite el número 2: ")));
        JOptionPane.showMessageDialog(null, "La suma es: "+suma.OPeracion());
        
        Resta resta = new Resta();
        resta.setNumero1(Double.parseDouble(JOptionPane.showInputDialog("Digite el número 1: ")));
        resta.setNumero2(Double.parseDouble(JOptionPane.showInputDialog("Digite el número 2: ")));
        JOptionPane.showMessageDialog(null, "La resta es: "+ resta.OPeracion());
        
        Dividir dividir = new Dividir();
        JOptionPane.showMessageDialog(null, "La división es: "+ dividir.OPeracion());
    }
}

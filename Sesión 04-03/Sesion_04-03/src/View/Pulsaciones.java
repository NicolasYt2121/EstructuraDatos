/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Class.Personas;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class Pulsaciones {

    public static void main(String[] args) {
        byte edad=0;
        do {            
            edad=Byte.parseByte(JOptionPane.showInputDialog("Digite la edad "));
            if(edad<1 || edad>130){
                JOptionPane.showMessageDialog(null, "La edad ingresada no es valida.");
            }
        } while (edad<1 || edad>130);
        
        Personas persona = new Personas();
        persona.setEdad(edad);
        persona.Ejecutar();
    }
}

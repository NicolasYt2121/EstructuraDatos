/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class Sumar extends Operacion{

    @Override
    public void Ejecutar() {        
        super.setResultado(getNumero1()+getNumero2());
        JOptionPane.showMessageDialog(null, getResultado());
    }
    
}

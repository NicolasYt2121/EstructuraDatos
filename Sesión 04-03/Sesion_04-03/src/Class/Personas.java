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
public class Personas extends Operacion{
    
    private byte edad;

    public Personas() {
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public void Ejecutar() {
        this.Pulsaciones();
    }
    
    private void Pulsaciones(){
        /*double resutadoParcial=0;
        Restar restar = new Restar();
        Dividir dividir = new Dividir();
        
        restar.setNumero1(220);
        restar.setNumero2(getEdad());        
        resutadoParcial=restar.getNumero1()-getNumero2();
        
        dividir.setNumero1(resutadoParcial);
        dividir.setNumero2(10);
        dividir.Ejecutar();*/
        
        setResultado((220-this.getEdad())/10);
        JOptionPane.showMessageDialog(null, this.getResultado());
    }
    
}

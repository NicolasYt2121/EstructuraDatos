/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Interfase.Accion;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public abstract class Operaciones implements Accion {

    private double numero1;
    private double numero2;
    private double resultado;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }

    protected void setResultado(double resultado) {
        this.resultado = resultado;
    }

    @Override
    public double OPeracion() {
        return -999999;
    }
    
    
}

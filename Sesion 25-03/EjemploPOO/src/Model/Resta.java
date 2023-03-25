/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ariel
 */
public class Resta extends Operaciones{

    @Override
    public double OPeracion() {
        super.setResultado(super.getNumero1()-super.getNumero2());
        return  super.getResultado();
    }
    
}

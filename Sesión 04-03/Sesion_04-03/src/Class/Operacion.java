/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ariel
 */
public abstract class Operacion {
    
    //Atributos
    private double numero1;
    private double numero2;
    private double resultado;
    
    //Constructor vacio
    public Operacion(){}

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

    protected double getResultado() {
        return resultado;
    }

    protected void setResultado(double resultado) {
        this.resultado = resultado;
    }   

    //Método de ejecución
    public void Ejecutar(){
    
    }
}

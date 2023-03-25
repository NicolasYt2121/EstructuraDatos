/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Class.Dividir;
import Class.Multiplicar;
import Class.Restar;
import Class.Sumar;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class Ejecutar {

    public static void main(String[] args) {
        //crear variable de entrada por teclado para elegir la operacion (+-*/)
        //si no ingresa un dato valido, informar al usuario.
        byte tipo;
        int numero1, numero2;
        do {
            tipo = Byte.parseByte(JOptionPane.showInputDialog("Digite 1/Suma 2/Resta 3/Multiplicación 4/División:"));
            if (tipo < 1 && tipo > 4) {
                JOptionPane.showMessageDialog(null, "Ha ingresado un dato diferente a 1/2/3/4, favor verificar e ingresar de nuevo.");
            }
        } while (tipo < 1 || tipo > 4);

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor: "));

        switch (tipo) {
            case 1:
                Sumar sumar = new Sumar();
                sumar.setNumero1(numero1);
                sumar.setNumero2(numero2);
                sumar.Ejecutar();
                break;
            case 2:
                Restar restar = new Restar();
                restar.setNumero1(numero1);
                restar.setNumero2(numero2);
                restar.Ejecutar();
                break;
            case 3:
                Multiplicar multiplicar = new Multiplicar();
                multiplicar.setNumero1(numero1);
                multiplicar.setNumero2(numero2);
                multiplicar.Ejecutar();
                break;
            case 4:
                Dividir dividir = new Dividir();
                dividir.setNumero1(numero1);
                dividir.setNumero2(numero2);
                dividir.Ejecutar();
                break;
            default:
                throw new AssertionError();
        }
    }
}

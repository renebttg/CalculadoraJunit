package org.example.calculadorajunit;

/**
 * @author Rene
 * @version 1.0
 * @since Release 1.0 da aplicação
 */
public class Calculadora {

    /**
     * @param a , primeiro valor utilizado para soma
     * @param b , segundo valor utilizado para soma
     * @return , resultado da soma
     */
    public double somar(double a, double b) {
        return a + b;

    }

    /**
     * @param a , primeiro valor utilizado para subtração
     * @param b , segundo valor utilizado para subtração
     * @return , resultado da subtraçao
     */
    public double subtrair(double a, double b) {
        return a - b;

    }


    /**
     * @param a , primeiro valor utilizado para multiplicar
     * @param b , segundo valor utilizado para multiplicar
     * @return , resultado da multiplicação
     */
    public double multiplicar(double a, double b) {
        return a * b;

    }

    /**
     * @param a , primeiro valor utilizado para dividir
     * @param b , segundo valor utilizado para dividir
     * @return , resultado da divisão
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Impossível dividir por 0");
            return Double.NaN;
        } else {
            return a / b;
        }
    }


}





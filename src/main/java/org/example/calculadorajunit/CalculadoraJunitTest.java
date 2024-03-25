package org.example.calculadorajunit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rene
 * @version 1.1
 * @since 1.0 da aplicação
 */
public class CalculadoraJunitTest {

    /*
     Teste de Soma Cenário 1: soma de dois valores inteiros positivos, resultado esperado: 10
     */
    @Test
    public void SomarDoisValoresPositivos() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double soma = calc.somar(3, 7);
        //Modelo de comparação
        assertEquals(10, soma);
    }

    /*
    Teste de Soma Cenário 2: soma de dois valores sendo um deles quebrado, resultado esperado: 5.5
     */
    @Test
    public void SomarDoisValoresSendoUmQuebrado() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double somar = calc.somar(5, 0.5);
        //Modelo de comparação
        assertEquals(5.5, somar);
    }

    /*
    Teste de Soma Cenário 3: soma de dois valores negativos, resultado esperado: -10
     */
    @Test
    public void SomarDoisValoresNegativos() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double soma = calc.somar(-5, -5);
        //Modelo de comparação
        assertEquals(-10, soma);
    }

    /*
    Teste de Soma Cenário 4: soma de dois valores sendo um deles 0, resultado esperado: 3
     */
    @Test
    public void SomarDoisValoresSendoUmZero() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double soma = calc.somar(3, 0);
        //Modelo de comparação
        assertEquals(3, soma);
    }

    /*
    Teste de Soma Cenário 5: soma de dois valores sendo um deles negativo, resultado esperado: 4
     */
    @Test
    public void SomarDoisValesSendoUmNegativo() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double soma = calc.somar(5, -1);
        //Modelo de comparação
        assertEquals(4, soma);
    }

    /*
    Teste de Subtração Cenário 1: subtração de dois valores inteiros positivos, resultado esperado: -4
     */
    @Test
    public void SubtrairDoisValoresPositivos() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double subtrair = calc.subtrair(3, 7);
        //Modelo de comparação
        assertEquals(-4, subtrair);
    }

    /*
    Teste de Subtração Cenário 2: subtração de dois valores sendo um deles quebrado, resultado esperado: 4.5
     */
    @Test
    public void SubtrairDoisValoresSendoUmQuebrado() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double subtrair = calc.subtrair(5, 0.5);
        //Modelo de comparação
        assertEquals(4.5, subtrair);
    }

    /*
    Teste de Subtração Cenário 3: subtração de dois valores sendo um deles quebrado, resultado esperado: 0
     */
    @Test
    public void SubtrairDoisValoresNegativos() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double subtrair = calc.subtrair(-5, -5);
        //Modelo de comparação
        assertEquals(0, subtrair);
    }

    /*
    Teste de Subtração Cenário 4: subtração de dois valores sendo um deles 0, resultado esperado: 3
     */
    @Test
    public void SubtrairDoisValoresSendoUmZero() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double subtrair = calc.subtrair(3, 0);
        //Modelo de comparação
        assertEquals(3, subtrair);
    }

    /*
    Teste de Subtração Cenário 5: subtração de dois valores sendo um deles negativo, resultado esperado: 6
     */
    @Test
    public void SubtrairDoisValoresSendoUmNegativo() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double subtrair = calc.subtrair(5, -1);
        //Modelo de comparação
        assertEquals(6, subtrair);
    }

    /*
    Teste de Multiplicação Cenário 1: multiplicação de dois valores inteiros positivos, resultado esperado: 21
     */
    @Test
    public void MultiplicarDoisValoresPositivos() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double multiplicar = calc.multiplicar(3, 7);
        //Modelo de comparação
        assertEquals(21, multiplicar);
    }

    /*
    Teste de Multiplicação Cenário 2: multiplicação de dois valores sendo um deles quebrado, resultado esperado: 2.5
     */
    @Test
    public void MultiplicarDoisValoresSendoUmQuebrado() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double multiplicar = calc.multiplicar(5, 0.5);
        //Modelo de comparação
        assertEquals(2.5, multiplicar);
    }

    /*
    Teste de Multiplicação Cenário 3: multiplicação de dois valores negativos, resultado esperado: 25
     */
    @Test
    public void MultiplicarDoisValoresNegativos() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double multiplicar = calc.multiplicar(-5, -5);
        //Modelo de comparação
        assertEquals(25, multiplicar);
    }

    /*
    Teste de Multiplicação Cenário 4: multiplicação de dois valores sendo um deles 0, resultado esperado: 0
     */
    @Test
    public void MultiplicarDoisValoresSendoUmZero() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double multiplicar = calc.multiplicar(3, 0);
        //Modelo de comparação
        assertEquals(0, multiplicar);
    }

    /*
   Teste de Multiplicação Cenário 5: multiplicação de dois valores sendo um deles negativo, resultado esperado: -5
    */
    @Test
    public void MultiplicarDoisValoresSendoUmNegativo() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double multiplicar = calc.multiplicar(5, -1);
        //Modelo de comparação
        assertEquals(-5, multiplicar);
    }

    /*
    Teste de Divisão Cenário 1: divisão de dois valores inteiros positivos, resultado esperado: 4
     */
    @Test
    public void DividirDoisValoresPositivos() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double dividir = calc.dividir(8, 2);
        //Modelo de comparação
        assertEquals(4, dividir);
    }

    /*
    Teste de Divisão Cenário 2: divisão de dois valores sendo um deles quebrado, resultado esperado: 10
     */
    @Test
    public void DividirDoisValoresSendoUmQuebrado() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double dividir = calc.dividir(5, 0.5);
        //Modelo de comparação
        assertEquals(10, dividir);
    }

    /*
    Teste de Divisão Cenário 3: divisão de dois valores inteiros negativos, resultado esperado: 1
     */
    @Test
    public void DividirDoisValoresNegativos() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double dividir = calc.dividir(-5, -5);
        //Modelo de comparação
        assertEquals(1, dividir);
    }

    /*
    Teste de Divisão Cenário 4: divisão de dois valores sendo um deles 0, resultado esperado: Impossível dividir por 0 mais retorno NaN.
     */
    @Test
    public void DividirDoisValoresSendoUmZero() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double dividir = calc.dividir(3, 0);
        //Modelo de comparação
        assertEquals(Double.NaN, dividir);
    }

    /*
    Teste de Divisão Cenário 5: divisão de dois valores sendo um deles negativo, resultado esperado: -5
     */
    @Test
    public void DividirDoisValoresSendoUmNegativo() {
        Calculadora calc = new Calculadora();
        //Parametros a serem utilizados no teste
        double dividir = calc.dividir(5, -1);
        //Modelo de comparação
        assertEquals(-5, dividir);

    }
}

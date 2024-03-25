package org.example.calculadorajunit;

/**
 * @author Rene
 * @version 1.0
 * @since Release 1.0 da aplicação
 */
public class CalculadoraMain {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println("Testes de Soma: ");

        //Cenário de teste 1: soma de dois valores inteiros positivos, resultado esperado: 10
        double somar = calc.somar(3, 7);
        System.out.println(somar);

        //Cenário de teste 2: soma de dois valores sendo um deles quebrado, resultado esperado: 5.5
        somar = calc.somar(5, 0.5);
        System.out.println(somar);

        //Cenário de teste 3: soma de dois valores inteiros negativos, resultado esperado: -10
        somar = calc.somar(-5, -5);
        System.out.println(somar);

        //Cenário de testes 4: soma de dois valores sendo um deles 0, resultado esperado: 3
        somar = calc.somar(3, 0);
        System.out.println(somar);

        //Cenário de testes 5: soma de dois valores inteiros sendo um deles negativo, resultado esperado: 4
        somar = calc.somar(5, -1);
        System.out.println(somar);

        System.out.println("\n----------------");
        System.out.println("\nTestes de subtração: ");

        //Cenário de testes 1: subtração de dois valores inteiros positivos, resultado esperado: -4
        double subtrair = calc.subtrair(3, 7);
        System.out.println(subtrair);

        //Cenário de testes 2: subtração de dois valores sendo um deles quebrado, resultado esperado: 4.5
        subtrair = calc.subtrair(5, 0.5);
        System.out.println(subtrair);

        //Cenário de testes 3: subtração de dois valores inteiros negativos, resultado esperado: 0
        subtrair = calc.subtrair(-5, -5);
        System.out.println(subtrair);

        //Cenário de testes 4: subtração de dois valores sendo um deles 0, resultado: 3
        subtrair = calc.subtrair(3, 0);
        System.out.println(subtrair);

        //Cenário de testes 5: subtração de dois valores sendo um deles negativo, resultado esperado: 6
        subtrair = calc.subtrair(5, -1);
        System.out.println(subtrair);

        System.out.println("\n----------------");
        System.out.println("\nTestes de multiplicação: ");

        //Cenário de testes 1: multiplicação de dois valores inteiros positivos, resultado esperado: 21
        double multiplicar = calc.multiplicar(3, 7);
        System.out.println(multiplicar);

        //Cenário de testes 2: multiplicação de dois valores sendo um deles quebrado, resultado esperado: 2.5
        multiplicar = calc.multiplicar(5, 0.5);
        System.out.println(multiplicar);

        //Cenário de testes 3: multiplicação de dois valores inteiros negativos, resultado esperado: 25
        multiplicar = calc.multiplicar(-5, -5);
        System.out.println(multiplicar);

        //Cenário de testes 4: multiplicação de dois valores sendo um deles 0, resultado esperado: 0
        multiplicar = calc.multiplicar(3, 0);
        System.out.println(multiplicar);

        //Cenário de testes 5: multiplicação de dois valores sendo um deles negativo, resultado esperado: -5
        multiplicar = calc.multiplicar(5, -1);
        System.out.println(multiplicar);

        System.out.println("\n----------------");
        System.out.println("\nTestes de divisão: ");

        //Cenário de testes 1: divisão de dois valores inteiros positivos, resultado esperado: 4
        double dividir = calc.dividir(8, 2);
        System.out.println(dividir);

        //Cenário de testes 2: divisão de dois valores sendo um deles quebrado, resultado esperado: 10
        dividir = calc.dividir(5, 0.5);
        System.out.println(dividir);

        //Cenário de testes 3: divisão de dois valores inteiros negativos, resultado esperado: 1
        dividir = calc.dividir(-5, -5);
        System.out.println(dividir);

        //Cenário de testes 4: divisão de dois valores sendo um deles 0, resultado esperado: Impossível dividir por 0 mais retorno NaN.
        dividir = calc.dividir(3, 0);
        System.out.println(dividir);

        //Cenário de testes 5: divisão de dois valores sendo um deles negativo, resultado esperado: -5
        dividir = calc.dividir(5, -1);
        System.out.println(dividir);


    }
}

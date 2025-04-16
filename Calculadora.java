package com.mycompany.calculadora;

/**
 *  Eu Derik S. estou fazendo um algoritmo que fará a função de uma calculadora 
 * @author D3
 */

public class Calculadora {
    public static void main(String[] args) {
        //Definição de dois números
        double number1 = 38.1; //Números que possuem decimal
        double number2 = 16.2; //Números que possuem decimal
        
        //Operações matemáticas
        double Soma = number1 + number2;                              //+ é soma
        double Subtracao = number1 - number2;                         //- subtração
        double Multiplicacao = number1 * number2;                     //* Multiplicação
        double Divisao = number2 !=0 ?number1 / number2 : Double.NaN; // / Divisão,Evita divisão por 0 
        double SobradaDivisao = number1 % number2;                    //% Módulo
        
        //Exibição de resultados
        System.out.println("Resultados:");
        System.out.println("Soma:" + Soma);                             //Não explicarei porque já entendi
        System.out.println("Subtração:"+ Subtracao);
        System.out.println("Multiplicação:" + Multiplicacao);
        System.out.println("Divisão:" + Divisao); //Fiz apenas como teste, não sei se seria utíl
        System.out.println("Divisão1:" + (number2 != 0 ? Divisao : 
                "indefinida (divisão por zero)"));
        System.out.println("Resto:" + SobradaDivisao);
        
             
    }
    
}

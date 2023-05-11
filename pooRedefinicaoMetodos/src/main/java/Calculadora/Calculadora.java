/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import java.util.Arrays;

/**
 *
 * @author Nathan Graebin
 */
public class Calculadora {

    public void somar(int valor1, int valor2) {

        System.out.println(valor1 + valor2);
    }

    public double somar(double valor1, double valor2) {

        return valor1 + valor2;
    }

    public void somar(int valor1, int valor2, int valor3) {

        System.out.println((valor1 + valor2) + valor3);
    }

    //-------------------------------------------------------//
    // Arrays.stream(numeros).sum() oara somar elemestos de arrays

    public void somar(int[] numeros){
    int soma = Arrays.stream(numeros).sum();
    
        System.out.println(soma);
    }
}

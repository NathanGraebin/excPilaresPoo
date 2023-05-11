/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calculadora;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Nathan Graebin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        calc.somar(1, 1);

        System.out.println(calc.somar(1.5, 1.5));
        
        calc.somar(2, 2, 2);
        
        
        // somar(int[] numeros)
        
        int[] numeros = {10,10,10,10};
        calc.somar(numeros);
        
    }

}

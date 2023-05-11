/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overload;

import java.util.Scanner;
/**
 *
 * @author Nathan Graebin
 */
public class Pessoa {
    
    
    
    
    
    int anoAtual = 2023;
    
    int idade;
    
    
    
    
    Scanner Ler = new Scanner (System.in);
    
    
    public void calcularIdade(int panoNascimento){
        
       idade = anoAtual - panoNascimento;
        
        System.out.println(idade);
        
        
    
    }
    
}

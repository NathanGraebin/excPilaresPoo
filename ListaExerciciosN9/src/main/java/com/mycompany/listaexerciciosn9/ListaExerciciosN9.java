/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexerciciosn9;

import java.util.Scanner;

/**
 *9 - Crie uma classe chamada "Programador" que herda da classe "Funcionario" e possui um atributo privado "linguagem". 
 * Utilize encapsulamento para permitir o acesso ao atributo "linguagem" por meio de métodos getters e setters.
 * @author lucas
 */
public class ListaExerciciosN9 {

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in); 
       
        Programador programadores = new Programador ();
        String linguagem = "Java"; 
        programadores.setLinguagem(linguagem);
        
        System.out.println("LINGUAGEM: "+programadores.getLinguagem());
        
        
    }
}

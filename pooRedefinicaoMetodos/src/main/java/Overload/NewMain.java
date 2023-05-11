/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Overload;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Nathan Graebin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner Ler = new Scanner (System.in);
        
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        
        System.out.println("INFORME O ANO QUE VOCÊ NASCEU");
        int anoNascimento = Ler.nextInt();
        
        pessoa.calcularIdade(anoNascimento);
        funcionario.calcularIdade(anoNascimento);
        System.out.println("----------");
        
        funcionario.calcularIdade(anoNascimento, 365);
        

    }
    
}

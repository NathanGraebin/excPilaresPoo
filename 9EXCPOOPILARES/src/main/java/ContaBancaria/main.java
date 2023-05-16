/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ContaBancaria;

import java.util.Scanner;

/**
 * 2 - Crie uma classe chamada "ContaBancaria" com atributos privados, como
 * "saldo" e "titular". Utilize encapsulamento para permitir o acesso a esses
 * atributos por meio de métodos getters e setters.
 *
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        String titular;
        float saldo;
        ContaBancaria contaBancaria = new ContaBancaria();
        
        
        
        System.out.println("INFORME O NOME DO TITULAR:");
        contaBancaria.setTitutal(titular = Ler.next());
        
         System.out.println("INFORME O SALDO:");
        contaBancaria.setSaldo(saldo = Ler.nextFloat());

        System.out.println("TITULAR: "+contaBancaria.getTitular());
        System.out.println("SALDO: "+contaBancaria.getSaldo());
    }

}

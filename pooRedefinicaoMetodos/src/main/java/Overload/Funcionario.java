/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overload;

/**
 *
 * @author Nathan Graebin
 */
public class Funcionario extends Pessoa {

    @Override
    public void calcularIdade(int panoNascimento) {
        idade = anoAtual - panoNascimento;
        int mes = idade * 12;

        System.out.println(mes);

    }

    public void calcularIdade(int panoNascimento, int quantidadeDiasMedioAnos) {
        idade = anoAtual - panoNascimento;
        int idadeMes = idade * 12;
        int idadeEmDias = idade * quantidadeDiasMedioAnos;

        System.out.println("IDADE : " + idade);
        System.out.println("IDADE EM MESES " + idadeMes);
        System.out.println("IDADE EM DIAS " + idadeEmDias);

    }

}

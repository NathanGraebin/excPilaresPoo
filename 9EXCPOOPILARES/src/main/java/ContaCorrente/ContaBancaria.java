/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContaCorrente;

import ContaBancaria.*;

/**
 *
 * @author Nathan Graebin
 */
public class ContaBancaria {
    private String titular;
    private float saldo;
    
    public ContaBancaria(){
    
    }
    
    
    public void setTitutal(String aTitular){
    this.titular = aTitular;
    }
    
    public void setSaldo(float aSaldo){
    this.saldo = aSaldo;
    }
    
    public String getTitular(){
    return titular;
    }
    
    public float getSaldo(){
    return saldo;
    }
    
    
}


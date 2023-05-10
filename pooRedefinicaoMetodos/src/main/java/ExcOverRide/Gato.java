/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExcOverRide;

/**
 *
 * @author Nathan Graebin
 */
public class Gato extends Animal {
    
    @Override
    public void emitirSom(){
        System.out.println("O GATO ESTA MIANDO - MIAUUU");
    }
    
    @Override
    public void mover(){
        System.out.println("O GATO TA ANDANDO - PS PS PS");
    
    }
}

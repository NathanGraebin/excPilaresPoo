/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExcOverRide;

/**
 *
 * @author Nathan Graebin
 */
public class Cachorro extends Animal {
    
    @Override
    public void emitirSom(){
        System.out.println("O CACHORRO ESTA LATNDO - WOLF WOLF");
    }
    
    @Override
    public void mover(){
        System.out.println("O CACHORRO TA ANDANDO - PAF PAF PAF");
    
    }
    
}

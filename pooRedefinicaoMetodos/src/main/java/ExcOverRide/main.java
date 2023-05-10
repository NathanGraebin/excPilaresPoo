/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExcOverRide;

/**
 *
 * @author Nathan Graebin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro();
        
        Gato gato = new Gato();
        
        gato.emitirSom();
        
        gato.mover();
        
        System.out.println("--------");
        
        cachorro.emitirSom();
        
        cachorro.mover();
        
    }
    
}

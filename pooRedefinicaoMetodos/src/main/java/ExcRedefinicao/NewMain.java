/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExcRedefinicao;

/**
 *
 * @author Nathan Graebin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        
        animal.fazerBarulho();
        
        animal = new Gato();
        
        animal.fazerBarulho();
    }
    
}

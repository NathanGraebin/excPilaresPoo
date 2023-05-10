/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package redefinicaometodos.pooredefinicaometodos;

/**
 *
 * @author Nathan Graebin
 */
public class PooRedefinicaoMetodos {

    public static void main(String[] args) {
               
        Animal animal = new Cachorro();

        animal.emitirSom(); //cachorro
        
        
        animal = new Gato();
        animal.emitirSom(); //gato
        
        Animal animal1 = new Animal();
        animal1.emitirSom();
        
        animal = new Elefante();
        animal.emitirSom();

    }
}

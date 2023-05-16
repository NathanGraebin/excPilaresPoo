/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormaGeometrica;

/**
 *
 * @author Nathan Graebin
 */
public class Circulo extends FormaGeometrica {
    float pi ;
    float raio ;
    
    
    
    
    
    @Override
    public float calcularArea(float pi, float raio) {
        pi=3.14f;
        return pi * (raio* raio);
    }
}

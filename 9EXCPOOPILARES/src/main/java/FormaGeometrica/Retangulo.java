/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormaGeometrica;

/**
 *
 * @author Nathan Graebin
 */
public class Retangulo extends FormaGeometrica {

    float base;
    float altura;

    @Override
    public float calcularArea(float base, float altura) {
        return base * altura;
    }

}

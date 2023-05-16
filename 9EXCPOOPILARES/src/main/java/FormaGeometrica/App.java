package FormaGeometrica;

import java.util.Scanner;

/**
 * 1 - Crie uma classe abstrata chamada "FormaGeometrica" com um método abstrato
 * "calcularArea()". Em seguida, crie duas subclasses chamadas "Retangulo" e
 * "Circulo" que herdam da classe "FormaGeometrica" e implementam o método
 * "calcularArea()" de maneiras diferentes.
 *
 * @author Nathan Graebin
 */
public class App {

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        Circulo c1 = new Circulo();
        Scanner Ler = new Scanner (System.in);
        
        
        System.out.println("================================");
       
        System.out.println("Infome a altura do retângulo: ");
        float altura = Ler.nextFloat();
        System.out.println("Infome a base do retângulo: ");
        float base = Ler.nextFloat();
        
        System.out.println("AREA RETANGULO : " + r1.calcularArea(altura, base));
        
        System.out.println("================================");
        
         System.out.println("Infome a raio do circulo: ");
        float raio = Ler.nextFloat();
        
        System.out.println("AREA CIRCULO : " + c1.calcularArea(3.14f,raio));
    }
}

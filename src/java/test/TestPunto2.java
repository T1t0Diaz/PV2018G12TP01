
package test;

import punto2.Circulo;
import punto2.Rectangulo;

public class TestPunto2 {
    public static void main(String[] args){
      
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo();
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo();
        
        circulo1.mostrarArea( circulo1.calcularArea(3) );
        circulo1.mostrarPerimetro( circulo1.calcularPerimetro(3) );
        rectangulo1.mostrarArea( rectangulo1.calcularArea(7,4) );
        rectangulo1.mostrarPerimetro( rectangulo1.calcularPerimetro(7,4) );
        
        circulo2.mostrarArea( circulo2.calcularArea(4.3) );
        circulo2.mostrarPerimetro( circulo2.calcularPerimetro(4.3) );        
        rectangulo2.mostrarArea( rectangulo2.calcularArea(8,2) );
        rectangulo2.mostrarPerimetro( rectangulo2.calcularPerimetro(8,2) );
        
        
    }
}

package test;

import punto5.EcuacionCuadratica;

public class TestPunto5 {

    public static void main(String[] args){
    
        EcuacionCuadratica ec = new EcuacionCuadratica();
        ec.mostrarResultado(ec.calcularEcuacionCuadratica(1, -2, -24));
        
    }
}

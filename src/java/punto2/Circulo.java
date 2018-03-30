package punto2;

public class Circulo {

    /**
     * Permite Calcular el Area de un Circulo.
     * @param radio es el valor del radio del circulo.
     * @return Retorna el valor del area.
     */
    public double calcularArea(double radio) {
        double area = Math.PI * Math.pow(radio,2);
        
        return area;
    }
    
    public double calcularPerimetro(double radio) {
        double perimetro = 2*Math.PI*radio;
        
        return perimetro;
    }
    
    public void mostrarArea(double area){
        System.out.println("El Area del Circulo es: "+ area);
    }
    
    public void mostrarPerimetro(double perimetro){
        System.out.println("El Perimetro del Circulo es: "+ perimetro);
    }
    
}

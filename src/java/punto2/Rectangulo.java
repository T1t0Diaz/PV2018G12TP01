package punto2;

public class Rectangulo {
    
    public double calcularArea(double base, double altura) {
        double area = base * altura; 
        
        return area;
    }
    
    public double calcularPerimetro(double base, double altura) {
        double perimetro = (base*2+altura*2);
        return perimetro;
    }
    
    public void mostrarArea(double area){
        System.out.println("El Area del Rectangulo es: "+ area);
    }
    
    public void mostrarPerimetro(double perimetro){
        System.out.println("El Perimetro del Rectangulo es: "+ perimetro);
    }
}

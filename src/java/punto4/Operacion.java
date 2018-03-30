/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

/**
 *
 * @author Alfred
 */
public class Operacion {
    
 
    public int calcularSumatoria(int limite){
    int sumatoria=0;
    for(int i=0;i<=limite;i++){
    sumatoria=sumatoria + ((2*i)-1);
    
    }
    
    return sumatoria;
    
    }
    public double calcularProductoria(double limite){
    double productoria=1;
    for(int i=1;i<=limite;i++){
    productoria=productoria*i;
    }
    return productoria;
    
    }
    
}

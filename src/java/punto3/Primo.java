/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

/**
 *
 * @author Alfred
 */
public class Primo {
    
    public void mostrarPrimo(int numero, int numero2){
       
         // numeros primos
        String listaNumPri="";
        int cont, numPri=0;
        
        for(int i=numero; i<= numero2;i++){
         cont=0;
           for(int j = 1; j<=i;j++){
                 
            if(i%j == 0) cont++;
           }
           
           if(cont == 2){                
                listaNumPri+= i + " , ";
                numPri++;
            }
        }
         System.out.println("Hay "+numPri+" numeros Primos: "+ listaNumPri);
        
        
    }
    
}

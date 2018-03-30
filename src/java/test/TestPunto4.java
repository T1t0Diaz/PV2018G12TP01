/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;
import punto4.Operacion;

/**
 *
 * @author Alfred
 */
public class TestPunto4 {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Operacion op=new Operacion();
        int numero;
        double limite;
        System.out.println("ingrese limite de la sumatoria ");
        numero= scan.nextInt();
        System.out.println("el resultado de la sumatoria es "+op.calcularSumatoria(numero));
        System.out.println("ingrese el limite de la productoria");
        limite =scan.nextDouble();
        System.out.println("el resultado de la productoria es "+op.calcularProductoria(limite));
        
        
        
    }
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;
import punto3.Primo;


/**
 *
 * @author Alfred
 */
public class TestPunto3 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       Primo primo = new Primo();
       Scanner scan =new Scanner(System.in);
        System.out.println("ingres primer limite");
        int limite = scan.nextInt();
        System.out.println("ingrese segundo limite");
        int limiteFinal = scan.nextInt();
        primo.mostrarPrimo(limite, limiteFinal);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmilab;

import java.util.Scanner;


public class BmiLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
       System.out.print("What is your Height in meters?");
       int meters = in.nextInt();
       
       System.out.println("what is your weight in Kilos ?");
       int kilo = in.nextInt();
       
       double bmi;
        bmi = kilo / Math.pow(meters , 2);
       
       System.out.println(bmi);
        
    }
    
}

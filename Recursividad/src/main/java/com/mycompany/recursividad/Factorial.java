/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.recursividad;

/**
 *
 * @author joseg
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //int resultFactorial = factorial(4);
      int resultFactorial = recurFactorial(4);
      System.out.println("Hellow world");

    }
   
   //Método iterativo de factorial
    public static int factorial(int numero) {

       int resultado = 1;

       for(int i = numero; i > 1; i--){
          resultado = resultado * i;
       } 

       return resultado;

    }
    
    //Método recursivo de factorial
    public static int recurFactorial(int numero) {
       
       if(numero < 2) {
         return 1;
       }
       return numero * recurFactorial(numero - 1);
    
    }

    //5! = 4*3*2*1
    //0! = 1
    //1! = 1

    
}

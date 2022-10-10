/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parentheses;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Parentheses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Equation = new Scanner(System.in);
        
       String mathEquation;
       char rightParen = ')';
       
       char leftParen = '(';
       
       int count = 0;
       int secondCount = 0;
       int thirdCount = 0;
       
       System.out.println("Please enter a math equation: ");
       mathEquation = Equation.nextLine();
       System.out.println("Let's see if the parentheses are even: ");
    for (int i = 0; i < mathEquation.length(); i++) {
      
      
        if (mathEquation.charAt(i) == rightParen) {
          count++;
    
      
      }
    for (int j = 0; j < mathEquation.length(); j++) {
      
      
        if (mathEquation.charAt(i) == leftParen) {
          secondCount++;
    
      
      }

       }
       
    }
    
    for (int j = 0; j < mathEquation.length(); j++) {
      
      
        if (mathEquation.charAt(j) == leftParen) {
          thirdCount++;
    
      
      }

       }

    

    if (count == thirdCount){
    System.out.println("True");
   
    } else if(count != thirdCount) {
        System.out.println("False");

    }
    }
}
    


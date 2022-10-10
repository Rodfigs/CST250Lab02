/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minimumvalue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author rodri
 */
public class MinimumValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Number = new Scanner(System.in);
       
       int num1;
       int num2;
       int num3;
       int num4;
       int count;
       int lowestNumber = 0;
       System.out.println("Please enter four numbers:");
       num1 = Number.nextInt();
       num2 = Number.nextInt();
       num3 = Number.nextInt();
       num4 = Number.nextInt();
       
       int compare = num1;
       Queue<Integer> myQ = new LinkedList();
      
        myQ.add(num1);
        myQ.add(num2);
        myQ.add(num3);
        myQ.add(num4);
        /*
        I want the code to see if the first element in the queue is less 
        than or equal to the compare value that is as much as num1
        if it is it
        
        
        
                */
        for  (count = 0; count < 3; count++) {
          if(myQ.element() <= compare) {
         
         lowestNumber = myQ.element();
         
         myQ.remove();
          
          } else if (myQ.element() >= compare) {
            myQ.remove();
           
           
       
        
        
          } else {
        
        }
      }
     if(myQ.element() <= compare) {
         
         lowestNumber = myQ.element();
         System.out.println("The lowest number in queue is: ");
         System.out.println(lowestNumber);
          
          }
}
       
    }
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package specelements;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class SpecElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Number = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;

        
        System.out.println("Please enter numbers for the first array: ");
        
        num1 = Number.nextInt();
        num2 = Number.nextInt();
        num3 = Number.nextInt();
        num4 = Number.nextInt();
        
        int[] firstArray = new int[]{ num1,num2, num3, num4 }; 
        
        
        System.out.println("This array has either 65 or 77 in it: ");
  
        for (int i : firstArray) {
	if ( i == (77) || i == 65) {
		System.out.println("True");
	} else {System.out.println("false");}
}
        
}
}
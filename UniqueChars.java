/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uniquechars;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author rodri
 */
public class UniqueChars {

    /**
     * @param args the command line arguments
     */
   
    
    
    
    boolean compare(String customWord) 
    {
        Scanner word = new Scanner(System.in);
        
        
     
        
     
        for (int i = 0; i < customWord.length(); i++)
            for (int j = i + 1; j < customWord.length(); j++)
                if (customWord.charAt(i) == customWord.charAt(j))
                   
                return false;
                
        return true;
                
                }
                    
    public static void main(String args[])
    {
       Scanner word = new Scanner(System.in);
        UniqueChars obj = new UniqueChars();
       System.out.println("Enter the word you want to check unique letters for: ");
        String customWord;
        
        customWord = word.nextLine();
 
        if (obj.compare(customWord))
            System.out.println("The String " + customWord + " has all unique characters");
        else
            System.out.println("The String " + customWord + " has duplicate characters");
    }
}
   
            
    


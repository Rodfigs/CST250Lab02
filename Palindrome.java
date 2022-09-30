/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindrome;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author rodri
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static boolean palindromeCheck(String customWord) {
      Scanner word = new Scanner(System.in);
    String check = "";
        
    boolean ans = false;
    
    for (int i = customWord.length() - 1; i >= 0; i--) {
        check = check + customWord.charAt(i);
    }
    
            if (customWord.equals(check)) {
            ans = true;
        }
    return ans;
    }
    public static void main(String[] args)
    {
        
        System.out.println("Enter the word you would like to check if its a palindrome: ");
        Scanner word = new Scanner(System.in);
        
        
        String customWord;
        customWord = word.nextLine();
 
       
        customWord = customWord.toLowerCase();
        boolean A = palindromeCheck(customWord);
        System.out.println(A);
    }
}

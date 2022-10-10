/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindrome2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
/**
 *
 * @author rodri
 */
public class Palindrome2 {

    
    
    
    
    static char pop()
    {
    return stack[top--];
    }
     static int top = -1 ;
    static void push(char part)
    {
    stack[++top] = part;
    }
    static char []stack;
    
    
    static int palindromeCheck(char str[]){
        
        int wordLength = str.length;
        
        stack = new char[wordLength * 4];
        
        int i, middle = wordLength / 2;
        
        for (i = 0; i < middle; i++)
        {
        push(str[i]);
        }
        
        if (wordLength % 2 != 0)
        {
        i++;
        }
        while (i < wordLength)
        {
        char part = pop();
        
        if (part != str[i])
        return 0;
        i++;
            }
        return 1;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Palindrome = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        
        String yourWord;
        
        yourWord = Palindrome.nextLine();
        
    {
    char str[] = yourWord.toCharArray();
 
    if (palindromeCheck(str) == 1)
    {
        System.out.println("Yes");
    }
    else
    {
        System.out.println("No");
    }
    }
        
    }
}
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversearray;
import java.util.Scanner;
/**
 *
 * @author rodri
 */
public class ReverseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        String customWord;
        
        System.out.println("Enter the word you want to reverse");
        
        customWord = word.nextLine();
        
        char[] customArray = new char[customWord.length()];
        
        for (int i = 0; i < customWord.length(); i++) {
            customArray[i] = customWord.charAt(i);
    }
    
        for (int i = 0; i < customWord.length(); i++) {
            customArray[i] = customWord.charAt(i);
            {
    System.out.print(customArray);
}
            for(i= customArray.length-1; i>=0; i--){
                System.out.print(customArray[i] + " ");  
        }  
}
}
}

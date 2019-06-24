
package corejava.practice;

import java.util.Scanner;


public class SmallAndCapitalLetter {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char ch;//a
        System.out.println("Enter any letter : ");
        ch=input.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("This is a smaall letter ");
            
        }else if(ch>='A' && ch<='Z'){
            
            System.out.println("This is a capital letter");
        }else{
            
            System.out.println("This is not a letter");
        }
        
        
        
        
    }
    
    
}

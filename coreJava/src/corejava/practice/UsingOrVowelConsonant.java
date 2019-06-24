
package corejava.practice;

import java.util.Scanner;


public class UsingOrVowelConsonant {
    
    public static void main(String[] args){
        
       Scanner input=new Scanner(System.in);
       char ch;
       
       System.out.println("Enter The any letter for checking vowel or consonant");
       ch=input.next().charAt(0);
       if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
           System.out.println("This is a vowel");
           
           
       }else{
           System.out.println("This is a consonant");
       }
       
        
    }
    
}

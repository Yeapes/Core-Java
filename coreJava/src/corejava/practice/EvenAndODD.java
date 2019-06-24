
package corejava.practice;

import java.util.Scanner;


public class EvenAndODD {
    
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       
       int sum;
       
       System.out.print("Enter A valid Integer number : ");
       sum=input.nextInt();
       if(sum%2==0){
           System.out.println("This is a even number");
       }else{
           
           
           System.out.println("This is a odd number");
       }
       
       
       
      System.out.println("Thanks for using our program");
        
        
    } 
    
}

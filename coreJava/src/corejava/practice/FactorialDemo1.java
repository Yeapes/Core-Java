
package corejava.practice;

import java.util.Scanner;


public class FactorialDemo1 {
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number,fact=1;
        System.out.print("Enter any integer number: ");
        
        number=input.nextInt();
        for (int i = number; i>=1; i--) {
            //System.out.print(" "+i);
            
            fact=fact*number;
            
        }System.out.print(" ");
        System.out.println("Factorial number of "+number+"="+fact);
        
        
        
        
    }
    
}

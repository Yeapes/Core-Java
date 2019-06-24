
package corejava.practice;

import java.util.Scanner;


public class TemparatureDemo {
    
    public static void main(String[] args){
        double C,F;
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter The value of celcius: ");
        C=input.nextDouble();
        F=1.8*C+32;
        
        
        System.out.println("Celsious to farenhiet: "+F);
        
        
        
        
        
    }
    
}

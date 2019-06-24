
package corejava.practice;

import java.util.Scanner;


public class SeriesDemo5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double n,product=1;
        System.out.print("Enter the last number :");
        n=input.nextInt();
        
        for (double i = 1.5; i <=n; i++) {
            
            System.out.print(" "+i);
            product=product*i;
            
          
            
        }System.out.print("");
        System.out.println("This is summation :"+product);
        
        
        
    }
}

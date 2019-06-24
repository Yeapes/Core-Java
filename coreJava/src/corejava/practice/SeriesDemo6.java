
package corejava.practice;

import java.util.Scanner;


public class SeriesDemo6 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n,product=1;
        System.out.print("Enter the final number :");
        n=input.nextInt();
        
        for (int i = 1; i <=n; i++) {
            System.out.print(" "+i);
            product=product*i*i;
            
        }System.out.print("");
        
        System.out.println("This is product :"+product);
        
        
    }
    
}

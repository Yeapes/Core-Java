
package corejava.practice;

import java.util.Scanner;


public class SeriesDemo4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n,pro=1;
        System.out.print("Enter the final value :");
        n=input.nextInt();
        
        for (int i = 1; i <=n; i=i+2) {
            
            System.out.print(" "+i+"X");
            pro=pro*i; //1*
            
        }System.out.println("This is summation :"+pro);
        
        
        
        
        
    }
    
}

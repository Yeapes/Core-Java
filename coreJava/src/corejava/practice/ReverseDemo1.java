
package corejava.practice;

import java.util.Scanner;


public class ReverseDemo1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number,sum=0,temp,r;
       System.out.print("Enter any integer number :");
        number=input.nextInt();
        
        temp=number;
        while(temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
            
            
        }System.out.println(sum);
        
        
        
        
    }
    
}

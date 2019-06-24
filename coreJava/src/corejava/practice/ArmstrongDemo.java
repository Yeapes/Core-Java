
package corejava.practice;

import java.util.Scanner;


public class ArmstrongDemo {
    public static void  main(String[] args){
        Scanner input=new Scanner(System.in);
        int number,sum=0,temp,r;
        
        System.out.print("Enter a positive number : ");
        number=input.nextInt();
        
        temp=number;
        while(temp!=0){
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
            
        }System.out.println(sum);
        if(number==sum){
            
            System.out.print("This is a armstrong number");
        }else{
            
            System.out.print("This is not a armstrong number ");
            
        }System.out.println();
        
        
        
        
        
        
        
    }
    
}

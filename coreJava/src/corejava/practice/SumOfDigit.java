
package corejava.practice;

import java.util.Scanner;


public class SumOfDigit {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num,r,sum=0;
        System.out.print("Enter The positive value :");
        num=input.nextInt();
       int temp=num;
       
       while(temp!=0){
           r=temp%10;
           sum=sum+r;
           temp=temp/10;
    
       }System.out.println(sum);
       
    }
    
}

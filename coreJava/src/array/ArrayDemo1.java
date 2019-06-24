
package array;

import java.util.Scanner;


public class ArrayDemo1 {
    public static void main(String[] args){
    
    Scanner input=new Scanner(System.in);
    int[] largeSum=new int[10];  
    System.out.print("Please enter a positive  number for 0 index :");
    largeSum[0]=input.nextInt();
    System.out.print("Please Enter a positive number for 1 index :");
    largeSum[2]=input.nextInt();
    System.out.print("Please enter a positive  number for 0 index :");
    largeSum[3]=input.nextInt();
    System.out.print("Please Enter a positive number for 1 index :");
    largeSum[4]=input.nextInt();
   System.out.print("Please enter a positive  number for 0 index :");
    largeSum[5]=input.nextInt();
    System.out.print("Please Enter a positive number for 1 index :");
    largeSum[6]=input.nextInt();
    System.out.print("Please enter a positive  number for 0 index :");
    largeSum[7]=input.nextInt();
    System.out.print("Please Enter a positive number for 1 index :");
    largeSum[8]=input.nextInt();
    System.out.print("Please enter a positive  number for 0 index :");
    largeSum[9]=input.nextInt();
    
    
    int sum=largeSum[0]+largeSum[1]+largeSum[3]+largeSum[4]+largeSum[5]+largeSum[6]+largeSum[7]+largeSum[8]+largeSum[9];
    System.out.println("This is user summation :"+sum);
    
     
    }  
}

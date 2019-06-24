
package corejava.practice;
import java.util.Scanner;


public class SummationOddnumber {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int sum=0;
    int m,n;
   System.out.print("Enter The intial number :");
   m=input.nextInt();
   System.out.print("Enter final number");
   
   n=input.nextInt();
        for (int i = m; i <=n; i++) {
            if(i%2!=0){
                 sum=sum+i;
                 System.out.println(" "+i);
                 System.out.println();
            }
        }
        System.out.println("This is summation 1 to 20  of odd number :"+sum);

    }
  
}

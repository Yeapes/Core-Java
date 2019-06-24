
package corejava.practice;
import java.util.Scanner;

public class ForLoopDemo2 {
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int sum=0;
        int m,n;
        System.out.println("Enter the value of m :");
        m=input.nextInt();
        System.out.println("Enter the value of n :");
        n=input.nextInt();
        
        
        
        for (int i = m; i < n; i++) {
            if(i%2!=0){
                 sum=sum+i;
                 System.out.print(" "+i);
                 System.out.println();
                
            }
        }System.out.println("This is your summation :"+sum);
        
            
        }
        
}


package corejava.practice;
import java.util.Scanner;

public class SeriesDemo2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double n,sum=0;
        System.out.print("Enter final number :");
        n=input.nextDouble();
        
        for (double i = 1.5; i <=n; i++) {
            
            sum=sum+i;
            
            
        }System.out.println("This is your summation number :"+sum);
        
        
        
        
        
        
        
    }
    
}

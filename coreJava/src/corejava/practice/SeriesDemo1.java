
package corejava.practice;
import java.util.Scanner;
//1+2+3.....+n;
public class SeriesDemo1 {
  
    public static  void main(String[] args){
          Scanner input=new Scanner(System.in);
            int n;
            int sum=0;

        System.out.print("Enter the final number :");
        n=input.nextInt();
        
        for (int i = 1; i <=n; i++) {
           sum=sum+i;
           
            
            
        }System.out.println("This is summation :"+sum);
        
 
        
        
        
        
        
        
        
    }
    
}

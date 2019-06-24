
package corejava.practice;
import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter your negative number :");
        n=input.nextInt();
      if(n<0){
          System.out.println(-n);       
      }else{
          System.out.println("This is not a valid number ");
          
      }
        
    }
    
}

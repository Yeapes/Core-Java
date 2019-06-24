
package interestpractice;
import java.util.Scanner;

public class Interest {
    public static void main(String[] args){
      Scanner input=new Scanner(System.in);
      int loan_amount,months;
      double percentage,total_amount;
      
      System.out.print("Enter the value of loan amount :");
      loan_amount=input.nextInt();
      System.out.print("Enter the value of months :");
      months=input.nextInt();
      System.out.print("Enter the value of percentage :");
      percentage=input.nextDouble();
      
      total_amount=loan_amount+loan_amount*percentage/100.0f;
        for (int i = 1; i <=months; i++) {
            
            total_amount=total_amount+total_amount*percentage/100.0f;
            System.out.println("Total amount of "+i+":"+total_amount+"tk only");
                    
        }
      
      
        
        
        
        
    }
}

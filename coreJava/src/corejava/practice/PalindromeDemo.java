
package corejava.practice;
import java.util.Scanner;

public class PalindromeDemo {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int number,sum=0,temp,r;
        
        System.out.print("Enter a integer number :");
        number=input.nextInt();
        
        temp=number;
        while(temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
            
            
            
        }if(number==sum){
            System.out.print("This is a palindrome number");
            
        }else{
            
            
            System.out.print("This is not palindrome number");
        }
        System.out.println(" ");
        
        
        
        
    }
}

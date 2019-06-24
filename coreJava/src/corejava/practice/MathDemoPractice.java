
package corejava.practice;
import java.util.Scanner;

public class MathDemoPractice {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x;
        int y;
        System.out.print("Enter the value of x and y :");
        x=input.nextInt();
        y=input.nextInt();
        int max=Math.max(x, y);
        int min=Math.min(x, y);
        System.out.println("Large number is : "+max);
        System.out.println("Small number is: "+min);
        
        
        
    }
    
}

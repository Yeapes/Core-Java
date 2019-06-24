
package corejava.practice;

import java.util.Scanner;
public class ConditionalDemo {
    public static void main(String[] args){
            Scanner input=new Scanner(System.in);
    
    int x,y,large,min;
  System.out.println("Enter the value of x  :");
  x=input.nextInt();
  System.out.println("Enter the value of  y :");
  y=input.nextInt();
   min=(x<y)? x:y; 
   large=(x>y)? x:y;// prothom expression jodi true hoi tahole second expression a jabe notuba 3rd expression a jabe
    System.out.println("The maximum  number is : "+large);
    System.out.println("The minimum number is :"+min);
  
    }

    
}

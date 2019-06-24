
package corejava.practice;

import java.util.Scanner;


public class Control_Statement {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int sum;
        sum=input.nextInt();
        
        
        if(sum<4){
            
            
            System.out.println("Your are come to right way");
        }
        else if(sum>8) {
            System.out.println("Your are come to right way and place");
            
        }
        else{
            System.out.println("You have  something mistake this statement");
        }
        
        
    }
    
    
    
}

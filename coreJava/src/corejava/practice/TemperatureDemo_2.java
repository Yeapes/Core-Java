
package corejava.practice;

import java.util.Scanner;


public class TemperatureDemo_2 {
    
    
    public static void main(String[] args){
        double F,C = 0;
        Scanner Myscanner=new Scanner(System.in);
        
        System.out.print("Enter The value of Farenheigt: ");
        F=Myscanner.nextDouble();
        C=0.55555*(C-32);
        System.out.println("This is celsious :"+C);
        
        
    }
    
}

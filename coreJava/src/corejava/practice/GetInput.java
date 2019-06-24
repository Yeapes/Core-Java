
package corejava.practice;

import java.util.Scanner;



public class GetInput {
    
    public static void main(String[] args){
        Scanner Test=new Scanner(System.in);
        int TestValue1,TestValue2;
        
        System.out.println("Enter Your Test Value :");
        
        TestValue1=Test.nextInt();
        TestValue2=Test.nextInt();
        
        int result=TestValue1+TestValue2;
        
        System.out.println("This Is Your Test Value :"+result );
        String WlcName;
        System.out.println("Enter Your Name :");
        WlcName=Test.nextLine();
        System.out.println("Welcome To Our Comapany"+WlcName);
        
        
        
        
        
    }
    
    
    
    
}

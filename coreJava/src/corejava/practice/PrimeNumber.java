

package corejava.practice;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num,count=0;
        
        System.out.println("Enter any positive number :");
        num=input.nextInt();
        
        for (int i = 2; i < num; i++) {
            
            if(num%i==0){
                count++;
                break;
                
                
            }
            
        }if(count==0){
            
            System.out.println("This is a prime number ");
            
        }else{
            
            System.out.println("This is not a prime number");
        }
        
        
       
        
        
        
        
    }
    
    
    
    
         
    }
       
    


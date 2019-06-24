package problemSolving;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
       
        
      
       //Cholte thakbe jotkkhon na amra stop korbo
        while(true){
             try {
                 Scanner input = new Scanner(System.in);
                System.out.print("Please Enter num1 :");
                int num1 = input.nextInt();
                System.out.print("Please Enter num2 :");
                int num2 = input.nextInt();
                int result = num1 / num2;

                System.out.println("Result :" + num1 + "/" + num2 + "=" + result);

            } catch (Exception e) {

                System.out.print("Exception :" + e);
                System.out.println("You must integer.please try again");

            }
            
            
            
        }
           
        }

    

}

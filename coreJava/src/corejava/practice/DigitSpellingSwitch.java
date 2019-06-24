
package corejava.practice;

import java.util.Scanner;


public class DigitSpellingSwitch {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int digit;
        System.out.println("Enter any digit for checking spellin in english language : ");
        digit=input.nextInt();
        
        switch(digit){
            case 1:
                System.out.println("One");
                break; 
            case 2:
                System.out.println("Two");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("This is  not a right digit");
        }

    }
    
}

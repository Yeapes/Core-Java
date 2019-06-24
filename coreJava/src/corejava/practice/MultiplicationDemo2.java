
package corejava.practice;

import java.util.Scanner;


public class MultiplicationDemo2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //say for example-----amra 1-20 porjonto namta print korbo 
        int m,n;
        //user input dibe koto theke koto porjonto namta hobe
        System.out.print("Enter the initial number :");
        m=input.nextInt();
        System.out.print("Enter the final number :");
        n=input.nextInt();
        for (int i =m; i <=n; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.println(i+"X"+j+"="+i*j);
            }System.out.println("\n\n");
        } 
    }
    
    
}

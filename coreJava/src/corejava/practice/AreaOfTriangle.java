
package corejava.practice;


import java.util.Scanner;


public class AreaOfTriangle {
    
 public static void main(String[] args){
   
   Scanner input=new Scanner(System.in);
   double base,height,Triangle_Area;
   System.out.print("Please base of triangle: ");
   base=input.nextInt();
   System.out.println("Please enter height of triangle : ");
   height=input.nextInt();
   Triangle_Area=0.5*base*height;
   
   System.out.println(Triangle_Area);
  
       
 }
  
}

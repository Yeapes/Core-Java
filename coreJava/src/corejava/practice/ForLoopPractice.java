
package corejava.practice;
import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       String bd;
       System.out.println("Enter your habbyt ");
       bd=input.nextLine();    
        for(int i=1; i<=14; i++ ){
            if(i==10){
                continue;
            }
            
            System.out.println(bd);
        }
        
        
        
    }
    
}
/* asole for loop a 3 ti part royeche
1 --initialization,2--conditon--condition hocche koto porjonto 
loop ta kaj korbe seta bujai
*/

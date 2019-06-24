
package randomNumber;

import java.util.Random;


public class RandomNumber {
    public static void main(String[] args){
        
        Random rand=new Random();
        //alternative way to implement random number ---(math.random*(90))
        
        
        int randomNumber=rand.nextInt(2);
        System.out.println(randomNumber);

    }
    
}



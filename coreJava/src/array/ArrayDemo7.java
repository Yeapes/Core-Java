
package array;


public class ArrayDemo7 {
    public static void main(String[] args){
        int[][] number=new int[4][5];
        int k=0;
        //Assining the value in number array
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                
                number[row][col]=k;
                k++;
            }

        }
        //printing the elements
        
        
        for (int row  = 0; row  < 4; row ++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(" "+number[row][col]);

            }System.out.println(" ");
            
        }
        System.out.println(number[3][4]);
        
        
        
        
        
        
        
    }
    
    
}

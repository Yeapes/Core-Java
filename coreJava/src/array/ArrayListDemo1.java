
package array;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo1 {
    public static void main(String[] args){
        //This is a arrayList realted program
        ArrayList<Integer>number=new ArrayList<>();
    
        //Assining value
        number.add(10);
        number.add(12);
        number.add(18);
        number.add(20);
        System.out.println("Array Size : "+number.size());
        System.out.println(number);
        
        for (int x:number) {
            System.out.println(x);
        }
        
        Iterator itr=number.iterator();
        
        while(itr.hasNext()){
            
            System.out.print(" "+itr.next());
            
        }
        
        
        //Removing elements
//        number.clear();
//        System.out.println(number);
        //replace a value of existing index
            number.set(0, 20);
            
            System.out.println("after setting "+number);
            //check empty array list if array list is empty and return for true value or false
            boolean checkEmpty=number.isEmpty();
            System.out.println("after checking :"+number);
            
            //matching value of the arraylist and return true or false 
            boolean contain=number.contains(30);
            System.out.println("after containing result :"+contain);
           //finding a index from arraylist and we get index arraylist  
        int findingIndex=number.indexOf(20);
            System.out.println("after finding of arraylist index :"+findingIndex);
            
         //show a value from arraylist 
         int gt=number.get(0);
         System.out.println(gt);

    }
    
}

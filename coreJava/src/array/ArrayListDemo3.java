package array;

import java.util.ArrayList;
import java.util.Collections;
//sorting an arrayList 
public class ArrayListDemo3 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(1);
        number.add(2);
        number.add(-12);
        number.add(103);

        System.out.println("Before sorting of array list elements : "+number);
        
        Collections.sort(number);
        
        System.out.println("After sorting in Ascending order arrayList"+number);
        
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("After sorting in Descending order :"+number);
        
        
        
        
    }

}

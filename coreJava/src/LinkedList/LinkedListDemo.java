
package LinkedList;

import java.util.LinkedList;


public class LinkedListDemo {
    public static void main(String[] args){
        
        LinkedList<String> countryNames=new LinkedList<String>();
        
        countryNames.add("Bangladesh");
        countryNames.add("Afghanistan");
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("Nepal");
        countryNames.add(5,"Brazil");
        countryNames.addFirst("Abu-Dabi");
        countryNames.addLast("Saudi-Arabia");
        countryNames.remove(1);
       
        
        
        System.out.println(countryNames.size());
        System.out.println(countryNames);
        System.out.println(countryNames.getFirst());
        
    }
    
}

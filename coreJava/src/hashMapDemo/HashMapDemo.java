
package hashMapDemo;

import java.util.HashMap;



public class HashMapDemo {
    //Hashmap work base of key
    //using the method put,and get.
    public static void main(String[] args){
        
        HashMap<Integer,String> customer=new HashMap<Integer,String>();
        
        customer.put(101, "Yeapes");
        customer.put(102, "Raihan");
        customer.put(103, "Sojib");
        
        System.out.println(customer.get(101));
        
        
    }
    
}

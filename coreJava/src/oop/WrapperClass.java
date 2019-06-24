
package oop;

public class WrapperClass {
    public static void main(String[] args){
        
        //premitive to object with wrapper class
        
        int x=30;
        //wrapper class 
        
       // Integer y=Integer.valueOf(x);
        Integer y=x; //This is called--valueOf(x) autoboxing       
        System.out.println(y);
        
        //object-> to premitive data type
        
        Double a=new Double(12.3);
        
        double b=a.doubleValue();
        System.out.println(b);
        
        
        //double b=a; //doubleValue(a)This is called unboxing
        
        
        
    }
    
    
}

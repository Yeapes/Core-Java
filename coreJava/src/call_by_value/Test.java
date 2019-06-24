
package call_by_value;


public class Test {
    public static void main(String[] args){
        int x=10;
        
      CallByValue ob1=new CallByValue();
      
      //do not change actual values
      //only pass copy of primitive data type variable value
      //copied to a method parameter 
      System.out.println("Before calling method :"+x);
        ob1.simple(x);
       System.out.println("After Calling metho :"+x);
        

    }
    
}

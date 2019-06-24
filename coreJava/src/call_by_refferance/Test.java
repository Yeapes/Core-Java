
package call_by_refferance;

public class Test {
    public static void main(String[] args){
        
      Byrefferance ob1=new Byrefferance();
      ob1.name="Yeapes";
      
      System.out.println("Before passing value :"+ob1.name);
      
      ob1.change(ob1);
      System.out.println("After passing value :"+ob1.name);
      
      
      
      
        
        
        
        
        
    }
    
    
}

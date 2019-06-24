
package anonymousclass;


public class Test {
    public static void main(String[] args){
    // This is anonyms class
    Person p=new Person(){
        
     @Override
     void display(){
         
         System.out.println("This is Test class");
         
     }
        
        
        
        
    };
    p.display();
    
    
    
    }
    
    
    
    
    
    
    
}

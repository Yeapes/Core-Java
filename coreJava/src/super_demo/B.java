
package super_demo;


public class B extends A{
    int x=3;
    
    void display(){
        
        System.out.println(super.x);
        
        
    }
    
    @Override
    void information(){
        
        super.information();
        System.out.println("Inside the sub class");
        
    }
    
    
    
}

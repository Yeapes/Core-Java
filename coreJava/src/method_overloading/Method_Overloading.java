
package method_overloading;

//same all method
//all method must be declared inside a class
//parameter must be defferent type
public class Method_Overloading {
    
   void add(int a,int b){
       System.out.println(a+b); 
   }
    void add(double a,double b){
        System.out.println(a+b);
        
    }
    void add(int a,int b,int c){
        
        System.out.println(a+b+c);
        
    }
    
    void add(){
        System.out.println("Nothing to  add");
        
        
    }
    
}

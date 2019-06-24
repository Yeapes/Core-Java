
package runtime_Polymrphsm;


public class Rectangle extends Shape {
    double base,width;
     Rectangle(double base,double width ){
        this.base=base;
        this.width=width;
       
    }
    
    void display(){
        
        System.out.print(base*width);
        
        
  
    }
    //
    
    
}

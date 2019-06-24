
package runtime_Polymrphsm;


public class Triangle extends Shape {
    
    double base,height;
    
    Triangle(double base,double height){
        
        this.base=base;
        this.height=height;
      
    }
    void display(){
        System.out.print(0.5*base*height);
        
        
    }
    

}

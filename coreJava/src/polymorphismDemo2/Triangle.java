
package polymorphismDemo2;


public class Triangle extends Shape {
    
    //area();
    double base,height;
    
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    @Override
    double area(){
        System.out.println("Triangle Area :");
        return 0.5*base*height;
        
    }
 
}

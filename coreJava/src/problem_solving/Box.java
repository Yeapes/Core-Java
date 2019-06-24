
package problem_solving;


public class Box {
    
    double height=10,width=10,depth=10;
    
    Box(double h,double w,double d){
        height=h;
        width=w;
        depth=d; 
    }
  
        void displayVol(){
            
            double vol=height*width*depth;
            System.out.println("Volum is :"+vol);
            
        }
    
}


package dynamicpolymorphism;


public class Test {
    
   public static void main(String[] args){
       
       
      Shape[] s=new Shape[3];      
      s[0]=new Shape();
      s[1]=new Triangle(2,2);
      s[2]=new Rectangle(2,4);
      
       for (int i = 0; i <3; i++) {
           
           System.out.println(s[i].area());
         
           
       }
      
      
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
   }
    
    
    
    
}

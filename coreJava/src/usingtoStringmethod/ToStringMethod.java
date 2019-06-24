
package usingtoStringmethod;


public class ToStringMethod {
    
    String name;
    int age;
    
    
    ToStringMethod(String name,int age){
        
        this.name=name;
        this.age=age;
        
        
    }
    
    @Override
    public String toString(){
        
        return "Name:"+name+"age \n"+age;
        
    }
    
    
    
    
}

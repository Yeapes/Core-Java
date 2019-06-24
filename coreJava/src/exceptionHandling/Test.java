
package exceptionHandling;


public class Test {
    public static void main(String[] args){
        int x=10;
        int y=0;
        try{
        int result=x/y;
        System.out.println(result);
        }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Exception :"+e);    
        }
        //finally must be run when take run time error
        finally{
        
        System.out.println("Hello! Dear,,I have no exception :");
        
        }
   
    }
    
    
    
}

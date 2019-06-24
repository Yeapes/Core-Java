
package returning_value;


public class Test {
    public static void main(String[] args){
        Returning_Class ob1=new Returning_Class();
        
        int result=ob1.square(8);
        System.out.println(result);
        
        float result2=ob1.sum(result);
        System.out.println(result2);
    }
}

   
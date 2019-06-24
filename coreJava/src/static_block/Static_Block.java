
package static_block;


public class Static_Block {
    
    static int n;
    static String p;
    
    
    static{
        n=1;
        p="Yeapes";
        
    }
    
    static void information(){
        System.out.println("number is :"+n);
        System.out.println("Name is :"+p);
        
    }
    public static void main(String[] args){
         information();
        
    }
    
}


package string_practice;


public class StringDemo1 {
    public static void main(String[] args){
        
        String n1="MD Yeapes";
        String n2=new String ("MD Yeapes");
        
        
      int len= n1.length();
      System.out.println("n1 length="+len);
        
        if(n1.equals(n2)){
            System.out.println("Equal");
            
            
        }else{
            
            System.out.println("Not Equal");
        }
        
        boolean con=n1.contains("Yeapes");
        
        System.out.println(con);
        
        boolean em=n1.isEmpty();
        System.out.println(em);
        
        n1.equalsIgnoreCase(n2);
        
    }
    
}

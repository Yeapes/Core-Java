
package stringcomparisonEquouls;


public class StringComparison {
    public static void main(String[] args){
        
        String password1="yeapes123";
        String password2="yeapes123";
        
        String password3=new String("yeapes123");
        String password4=new String("yeapes123");
        
        System.out.println(password1.equals(password2));
        System.out.println(password2.equals(password3));
        System.out.println(password3.equals(password4));
        
        System.out.println(password1==password3);
        
        
    }
    
    
}

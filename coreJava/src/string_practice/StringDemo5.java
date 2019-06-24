
package string_practice;


public class StringDemo5 {
    public static void main(String[] args){
        
        String s1="This is my country";
        String s2="This is my district";
        
        //i joto jaigate ache prottek jaigate e bosbe 
        String s3=s1.replace('i', 'e');
        System.out.println(s3);
        
        
       String[] s= s1.split(" ");
        for (String x:s) {
            
           System.out.println(x);
        }

    }
            

}

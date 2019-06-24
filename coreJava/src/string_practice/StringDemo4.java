
package string_practice;


public class StringDemo4 {
    public static void main(String[] args){
        String country="     Bangladesh is my    country   ";
        System.out.println(country);
        char ch=country.charAt(0);
        System.out.println(ch);
        
        
        //return aschi value this mathod
        int value=country.codePointAt(0);
        System.out.println("value :"+value);
        
        //index ber korbe  string theke,,prothom j string ta pabe seta ber kore nibe
        
        int index=country.indexOf("n");
        System.out.println(index);
        
        int index2=country.lastIndexOf("n");
        System.out.println(index2);
        
        //string theke space gula clear kore dibe; 
        //String s3=country.trim();
        
        //System.out.println(s3);
    }
}

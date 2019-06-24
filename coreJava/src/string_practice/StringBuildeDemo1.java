package string_practice;

public class StringBuildeDemo1 {

    public static void main(String[] args) {

        
            //String 3 way te declare kora jai String,StringBuffer,StringBuilder;
        StringBuilder str = new StringBuilder("Md Yeapes");

//        str.append(" " + "LPI");
//        System.out.println(str);
//        
//        str.reverse();
//        System.out.println(str);

        
        str.delete(0, 2);
        System.out.println(str);
    }
}

package string_practice;

public class StringDemo3 {

    public static void main(String[] args) {

        String first_name = "Md Raihan";
        String last_name = " Al Yeapes";

        String Full_name = first_name.concat(last_name);
        System.out.println(Full_name);
        String upperName=Full_name.toUpperCase();
        System.out.println(upperName);
        String lowerName=Full_name.toLowerCase();
        
        System.out.println(lowerName);
        //M diye ki start hoyeche?? check kora ,,,true or false ;
        
        boolean b=Full_name.startsWith("M");
        System.out.println("checking result:" +b);
        
        //last name ki s diye sesh hocche?/ check kora 
        boolean last=last_name.endsWith("w");
        System.out.println("after checking result :"+last);
        
        
        String[] names={"Yeapes","Raisul","Owhab","Shanto","Rakib"};
        
        for (String x:names) {
            System.out.println(x);
        }
                
        
        
        
        
        
        
        
        
    }

}

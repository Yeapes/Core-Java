
public class wrapperclass {
    
    public static void main(String[] args){
        //premitive to object with wrapper class
        
        byte x=12;
        
        Byte y=Byte.valueOf(x);
        
        System.out.println(y);
        
        //objeject-> premitive data type 

        Integer u=new Integer(111);
        
        int d=u.intValue();
        
        System.out.println(d);
  
    }
    
}

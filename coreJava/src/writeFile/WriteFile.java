
package writeFile;

import java.util.Formatter;
import java.util.Scanner;


public class WriteFile {
    public static void main(String[] args){
        String id,name;
        try{
         Scanner input=new Scanner(System.in);
        Formatter formatter=new Formatter("E:/Core Java Practice/write.txt");
        System.out.print("How many students :");
        int num=input.nextInt();
        for(int i=1; i<num; i++){
            
            System.out.print("Enter id :");
            id=input.nextLine();
            System.out.println("Enter name :");
            name=input.nextLine();
            formatter.format("%s %s\r\n",id,name);
            
        }formatter.close();
        
        
        }catch(Exception e){
            System.out.println(e);
            
        }
        
        
        
        
    }
    
}

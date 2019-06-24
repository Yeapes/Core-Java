package insertdataintofile;

import java.util.Formatter;
import java.util.Scanner;

public class FileDemo2 {

    public static void main(String[] args) {

        String id, name;

        try {
            Scanner input=new Scanner(System.in);
            
            Formatter formatter = new Formatter("E:/Core Java Practice/CoreJava Practice/Test.txt");
            System.out.println("How Students you want :");
            int num=input.nextInt();
            
            for (int i = 1; i <num; i++) {
                System.out.println("Enter Student id and name :");
                id=input.nextLine();
                name=input.nextLine();
                
                formatter.format("%s,%s\r\n",id, args);
               
                
                
            } formatter.close();
            

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}

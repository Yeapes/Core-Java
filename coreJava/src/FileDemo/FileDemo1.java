package FileDemo;

import java.io.File;

public class FileDemo1 {

    public static void main(String[] args) {
//getAbsolutepathe()
        File f = new File("C:/Users/Md Yeapes(LPI)/Desktop/New File");

        f.mkdir();//create a directory
        
        String p=f.getAbsolutePath();
        System.out.println(p);
        
        String nameOf_f=f.getName();
        
        System.out.println(nameOf_f);
        
        File file1 = new File("Test.txt");
        File file2 = new File("Test.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("File are created");

        } catch (Exception e) {

            System.out.println(e);

            
            
            //
            
            
        }

    }

}

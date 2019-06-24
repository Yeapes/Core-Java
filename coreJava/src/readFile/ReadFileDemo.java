package readFile;

import java.io.File;
import java.util.Scanner;

public class ReadFileDemo {

    public static void main(String[] args) {
        try {
            File file = new File("E:/Core Java Practice/write.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String id = scanner.next();
                String name = scanner.next();

                System.out.println("ID :" + id + "Name :" + name);

            }

        } catch (Exception e) {

        }

    }
}

package array;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(10);
        number1.add(7);
        number1.add(8);
        number1.add(4);
        number1.add(7);
        System.out.println(" number 1 :"+number1);
        
        
        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);
        number2.add(5);
        
        System.out.println("number 2 :"+number2);
        
        
        number3.addAll(number1);
        System.out.println("number 3 :"+number3);
        
       boolean equals= number1.equals(number2);
        
        System.out.println("number1==number2 :"+equals);

    }

}

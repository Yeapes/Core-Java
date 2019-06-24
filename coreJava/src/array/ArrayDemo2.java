package array;

import java.util.Scanner;

public class ArrayDemo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0, avg;
        double[] number = new double[5];
        System.out.print("Please enter 5 number :");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        avg = sum / number.length;
        System.out.println("This is summation of 5 numbers : " + sum);
        System.out.println("The average is :" + avg);

        double max = number[0];
        double min = number[0];
        for (int i = 1; i < 5; i++) {

            if (max < number[i]) {
                max = number[i];

            }
            if (min > number[i]) {

                min = number[i];
            }

        }
        System.out.println("Max number is :" + max);
        System.out.println("Min number is: "+min);

    }

}

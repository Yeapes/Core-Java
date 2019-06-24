package array;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        int[] number = {1, -3, 45, 4, 56};
        Arrays.sort(number);

        for (int i = 0; i < number.length; i++) {

            System.out.print("\n\n " + number[i]);

        }System.out.println();

        for (int i = 4; i >=0; i--) {
            System.out.println(" " + number[i]);

        }

    }

}

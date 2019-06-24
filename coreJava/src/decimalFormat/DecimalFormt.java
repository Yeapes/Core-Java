package decimalFormat;

import java.text.DecimalFormat;

public class DecimalFormt {

    public static void main(String[] args) {

        DecimalFormat ob = new DecimalFormat("0.00");

        double x = 4.45464;

        System.out.print(ob.format(x));

//       System.out.printf("x= %.2f \n", x); using c language function
//        System.out.println("x="+x);
    }

}

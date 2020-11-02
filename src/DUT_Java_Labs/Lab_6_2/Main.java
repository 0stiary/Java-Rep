package DUT_Java_Labs.Lab_6_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int jojo = 132189;


        while (jojo >= 10) {
            jojo = calc(jojo);
            System.out.println(jojo);
        }

    }
    public static int calc(int calc)
    {
        char [] tmp = Integer.toString(calc).toCharArray();
        calc = 0;
        for (int i = 0; i < tmp.length; i++) {
            calc += Character.getNumericValue(tmp[i]);
        }

        return calc;
    }
}

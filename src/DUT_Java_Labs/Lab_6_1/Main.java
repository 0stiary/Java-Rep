package DUT_Java_Labs.Lab_6_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String input = "Hello, rgrgrg 231wdf 124115-jhf dwn1n341";

        String[] tmp = input.split(" ");
        String output =  "";
        for (String v : tmp) {
            if (v.length() > output.length())
                output = v;
        }
        System.out.println(output);
    }

}

package DUT_Java_Labs.Lab_3_1;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "a2", "c1", "b1", "c3", "c2");

        ArrayList<String> output = new ArrayList<>();

        for (String c : list) {
            if (c.contains("c"))
                output.add(c);
        }

        Collections.sort(output);

        System.out.println(output);
    }
}

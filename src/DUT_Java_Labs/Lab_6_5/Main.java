package DUT_Java_Labs.Lab_6_5;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        for (Integer c: mult(3, 4)) {
            System.out.println(c);
        }

    }

    public static LinkedList<Integer> mult(int hManyMult, int onWhat)
    {
        LinkedList<Integer> result = new LinkedList<>();

        for (int i = 1; i <= hManyMult; i++) {
            result.add(onWhat * i);
        }

        return result;
    }
}


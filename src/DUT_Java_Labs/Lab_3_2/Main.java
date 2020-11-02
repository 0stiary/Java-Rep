package DUT_Java_Labs.Lab_3_2;

import DUT_Java_Labs.Lab_1.RandomMass;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();

        int[] mass = new int[11];

        int n = 0, summ = 0;

        for (int c : mass) {
            c = rnd.nextInt(10);
            if (c % 2 == 0)
            {
                n++;
                summ += c;
            }
            System.out.print(c + ", ");
        }
        float res = (float)summ / n;
        System.out.println("\n" + res);

    }
}

package DUT_Java_Labs.Lab_4;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        int[] arr = {3, 4, 13, 2, 1, 8};
//        int count = 0;
//
//        int[] gg = Arrays.stream(arr).filter(e -> e % 2 != 0).sorted().toArray();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0)
//            {
//                arr[i] = gg[count];
//                count++;
//            }
//            System.out.println(arr[i]);
//        }

        double[] arr2 = {1, 1, 1, 2, 1, 1};

        for (double v : Arrays.stream(arr2).distinct().toArray()) {
            System.out.println(v);
        }

    }
}

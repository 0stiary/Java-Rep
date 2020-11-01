package DUT_Java_Labs.Lab_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        System.out.println(System.nanoTime());
        Integer[] arr2 = {1, 3, 1, 2, 1, 1};

        ArrayList<Integer> som = new ArrayList(Arrays.asList(Arrays.stream(arr2).distinct().toArray()));
        //som.addAll(Arrays.asList(arr2));

        for (int j = 0; j < som.size(); j++) {
            int odd = 0;

            for (int i = 0; i < arr2.length; i++) {
                if (som.get(j).equals(arr2[i])){
                    odd++;

                    if(odd > 1)
                    {
                        som.remove(som.get(j));
                        break;
                    }
                }
            }
        }

        for (Object v : som)
        {
            System.out.println(v);
        }

        System.out.println(System.nanoTime());

    }
}

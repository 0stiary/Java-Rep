package DUT_Java_Labs.Lab_6_6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String [] input = {"Don't" , "worry" , "," , "be" , "happy", "!"};
        ArrayList<Integer> numOfLength = new ArrayList<>();
        for (String c : input)
            numOfLength.add(c.length());

        String finalInput = "";
        for (String c : input) {
            finalInput += c;
        }
        finalInput = new StringBuilder(finalInput).reverse().toString();

        char[] tempOutput = finalInput.toCharArray();
        ArrayList<String> output = new ArrayList<>();
        int tmp = 0;
        for (int i = 0; i < numOfLength.size(); i++) {
           output.add(new String(Arrays.copyOfRange(tempOutput, tmp, tmp + numOfLength.get(i))));
           tmp += numOfLength.get(i);
           System.out.println(output.get(i));
        }



    }
}

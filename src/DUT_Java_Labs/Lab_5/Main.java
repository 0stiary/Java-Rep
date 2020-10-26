package DUT_Java_Labs.Lab_5;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        // 1st task
        System.out.println(calcString("1+5+8-7*5/4"));
        // 2nd task
        {
            int[] arr = new int[8];

            if (arr.length % 2 == 0) {
                arr = new int[arr.length+1];
            }

            for (int e: fillArray(arr)) {
                System.out.print(e + " ");
            }

        }

        /*String str = "Tdfgfdgthrosdfefsdf";
        str = stringCalc(str, "-thro");
        System.out.println("str is");
        System.out.println(str);*/
    }

    public static double calcString(String str) {
        double result = Integer.parseInt(String.valueOf(str.charAt(0)));
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '+':
                    result += str.charAt(i + 1);
                    break;
                case '-':
                    result -= str.charAt(i + 1);
                    break;
                case '*':
                    result *= str.charAt(i + 1);
                    break;
                case '/':
                    if (str.charAt(i + 1) != 0) {
                        result /= str.charAt(i + 1);
                    } else {
                        System.out.println("Divide by zero");
                        throw new ArithmeticException();
                    }
                    break;
            }
        }
        return result;
    }

    public static int[] fillArray(int[] arr) {
        int center = arr.length / 2;

        arr[center] = 0;

        for (int i = 1; i <= center; i++) {
            arr[center + i] = i;
            arr[center - i] = -i;
        }
        return  arr;
    }



    /*public static String stringCalc(String str, String calcString) {
        StringBuilder stb = new StringBuilder(str);

        if (calcString.charAt(0) == '+') {
            stb.append(calcString.substring(1, calcString.length() - 1));
        }
        else if (calcString.charAt(0) == '-') {
            int fromPos = stb.indexOf(calcString);
            int toPos = fromPos+calcString.length()-1;
            System.out.println(stb);
            stb = new StringBuilder(stb.substring(fromPos,toPos));
            3
            System.out.println(stb);
        }
        return stb.toString();
    }*/
}

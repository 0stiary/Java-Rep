package DUT_Java_Labs.Lab_5;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        // 1st task
        /*System.out.println(calcString("1+5+8-7*5/4"));
        // 2nd task
        {
            int[] arr = new int[8];

            if (arr.length % 2 == 0) {
                arr = new int[arr.length+1];
            }

            for (int e: fillArray(arr)) {
                System.out.print(e + " ");
            }

        }*/
        //3 task
        String str = "Tdfgfdgthrosdfefsdf";
        str = stringCalc(str, "-thros");
        System.out.println("-------- str  --------");
        System.out.println(str);
    }

    /*public static double calcString(String str) {
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
    }*/



    public static String stringCalc(String str, String refacString) {
        StringBuilder stb = new StringBuilder(str);

        if (refacString.charAt(0) == '+')
            stb.append(refacString.substring(1));

        else if (refacString.charAt(0) == '-') {

            int fromPos = stb.indexOf(refacString.substring(1));
            int toPos = fromPos + refacString.length()-1;
            System.out.println(stb);

            stb.delete(fromPos, toPos);
            //System.out.println(stb);
        }
        return stb.toString();
    }
}

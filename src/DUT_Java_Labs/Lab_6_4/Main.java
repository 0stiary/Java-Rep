package DUT_Java_Labs.Lab_6_4;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char [] blacklistA = {'a','b','r','t','y','g'};
        char [] blacklistB = new char[blacklistA.length];
        for (int i = 0; i < blacklistA.length; i++) {
            blacklistB[i] = Character.toUpperCase(blacklistA[i]);
        }
        char [] blacklist = (new String(blacklistA) + new String(blacklistB)).toCharArray();

        String input = "hello my nme";
        if (input != null)
            System.out.println(noSuchLetters(input, blacklist));

    }

    public static boolean noSuchLetters(String input, char [] blacklist)
    {
        input = input.replaceAll("//s","");

        for (int i = 0; i < input.length(); i++) {
            for (char c : blacklist) {
                if (input.charAt(i) == c)
                    return true;
            }
        }
        return  false;
    }
}

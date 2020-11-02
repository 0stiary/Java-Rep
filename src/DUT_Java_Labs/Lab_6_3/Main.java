package DUT_Java_Labs.Lab_6_3;

public class Main {
    public static void main(String[] args) {
        int input = 194300;
        input = Math.min(input, 359999);

        int HH = input / 3600;
        int MM = (input / 60) % 60;
        int SS = input % 60;

        System.out.println(  wtf(HH) + " : " + wtf(MM) + " : " + wtf(SS));

    }

    public static String wtf(int iint)
    {
        return (iint > 10 ? String.valueOf(iint) : ("0" + iint));
    }
}

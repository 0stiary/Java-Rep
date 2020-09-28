package DUT_Java_Labs.Lab_1;

public class Main {

    public static void main(String[] args) {

        RandomMass rnd_Mass = new RandomMass();

        int[][] mass = new int[5][5];

        rnd_Mass.RandomFill(mass);

        RandomMass rnd_Mass_params = new RandomMass(-8,10,2);
        System.out.println();
        rnd_Mass_params = new RandomMass(-8,10,-2);
        System.out.println();
        rnd_Mass_params = new RandomMass(10,-8,2);
        System.out.println();
        rnd_Mass_params = new RandomMass(10,-8,-2);
        System.out.println();
    }
}

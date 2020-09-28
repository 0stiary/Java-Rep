package DUT_Java_Labs.Lab_1;

import java.util.Random;

public class RandomMass {

    Random rand;

    void RandomFill(int[][] mass) {

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rand.nextInt(100);
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }

        printArray(mass);

    }

    private void printArray(int [][] mass){
        System.out.println("-------------------------------------------");
        for (int i = 0; i < mass.length; i++) {
            if(mass[i][mass.length-1-i] % 2 == 0){
                System.out.print("  " + mass[i][mass.length-1-i] + "   ");
            }
        }
    }

    private void fillArray(int began, int end, int step){
        System.out.println("\n-------------------------------------------");
        int[] arr = new int[began < end
                            ? ((end - began) / Math.abs(step)) + 1
                            : ((began - end) / Math.abs(step)) + 1];

        step = (began > end) && (step > 0)
                ? -step
                : (began < end) && (step < 0)
                    ? -step
                    : step;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = began;
            began += step;

            System.out.print(arr[i] + "\t");
        }

    }

    public RandomMass(){

        rand = new Random();

    }

    public RandomMass(int began, int end, int step){

        fillArray(began, end, step);
    }
}

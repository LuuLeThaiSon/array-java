package demo;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {

        int[] array;
        int size;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        size = scanner.nextInt();

        array = new int[size];

        int i = 0;
        while (i != size) {
            System.out.print("Enter array's element[" + i + "]: ");
            array [i] = scanner.nextInt();
            i++;
        }

        int max = array[0];
        int elementMax = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                elementMax = j;
            }
        }

        System.out.println("Max is " + max + " at element " + elementMax);
    }
}

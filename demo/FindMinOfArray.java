package demo;

import java.util.Scanner;

public class FindMinOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array;
        int size;

        System.out.print("Enter array's size: ");
        size = scanner.nextInt();
        array = new int[size];

        int i = 0;
        while (i != size) {
            System.out.print("Enter array[" + i + "]: ");
            array[i] = scanner.nextInt();
            i++;
        }

        minArray(array);
    }

    public static void minArray(int[] arr) {
        int min = arr[0];
        int minElement = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minElement = i;
            }
        }

        System.out.println("Array's min is " + min + " at element " + minElement);
    }
}

package demo;

import java.util.Arrays;
import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value, element;
        int[] array = {1,2,3,4,5,6};

        System.out.print("Enter number: ");
        value = scanner.nextInt();

        System.out.print("Enter element: ");
        element = scanner.nextInt();

        add(array, value,element);

    }

    public static void add(int[] array, int value, int element) {
        int temp;
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < element; i++) {
            newArray[i] = array[i];
        }

        newArray[element] = value;

        for (int i = element; i < array.length ; i++) {
            newArray[i+1] = array[i];
        }

        System.out.println(Arrays.toString(newArray));
    }
}

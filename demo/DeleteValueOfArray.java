package demo;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteValueOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array;
        int size, value;

        System.out.print("Enter array size: ");
        size = scanner.nextInt();

        array = new int[size];

        int i = 0;
        while (i != size) {
            System.out.print("Enter array[" + i + "]: ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Enter number your want delete: ");
        value = scanner.nextInt();

        delArray(array, value);
    }

    public static void delArray(int[] array, int value) {
        int[] newArray;
        newArray = new  int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                for (int j = i; j < array.length - 1; j++) {
                    newArray[j] = array[j+1];
                }
                break;
            } else {
                newArray[i] = array[i];
            }
        }

        System.out.println(Arrays.toString(newArray));
    }
}

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
        int[] newArray1;
        int count = 0;
        int index = 0;
        newArray1 = new  int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count ++;
                continue;
            } else {
                newArray1[index++] = array[i];
            }
        }

        int[] newArray2;
        newArray2 = new int[array.length-count];

        for (int i = 0; i < newArray2.length; i++) {
            newArray2[i] = newArray1[i];
        }

        System.out.println(Arrays.toString(newArray2));
    }

}

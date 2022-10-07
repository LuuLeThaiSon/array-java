package reverse_array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array;
        int size;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        size = scanner.nextInt();

        array = new int[size];

        int i = 0;

        while (i != size) {
            System.out.print("Input array[" + i + "]: ");
            array[i] = scanner.nextInt();
            i++;
        }

        int temp;
        for (int j = 0; j < array.length/2; j++) {
            temp = array[j];
            array[j] = array[array.length-1-j];
            array[array.length-1-j] = temp;
        }

        System.out.print(Arrays.toString(array));
    }
}

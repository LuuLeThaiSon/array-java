package demo;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMangHaiChieu {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{3,4,5},{1,2,1}};
        int max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
// Tổng 1 cột
        System.out.println("max: " + max);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cột muốn tính tổng: ");
        int k = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i][k];
        }

        System.out.println("Sum: " + sum);

//Tổng đường chéo
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i][i];
            sum2 += array[i][array.length - 1 - i];
        }

        System.out.println("Sum cheo 1: " + sum1);

        System.out.println("Sum cheo 2: " + sum2);

    }
}

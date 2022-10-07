package demo;

import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array;
        int size;
        int count = 0;

        do {
            System.out.print("Nhập số lượng sinh viên: ");
            size = scanner.nextInt();

            if (size > 30) {
                System.out.println("Nhập lại!!!");
            }
        } while (size > 30);

        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập điểm sinh viên thứ " + (i+1) + " : ");
            array[i] = scanner.nextInt();
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }

        System.out.println("Có " + count + " sinh viên đỗ");
    }
}

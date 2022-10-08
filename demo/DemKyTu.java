package demo;

import java.util.Objects;
import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        String str = "aaaabbbbbccccssss";
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ky tu: ");
        char a = scanner.nextLine().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==a) {
                count++;
            }
        }

        System.out.println(count);
    }
}

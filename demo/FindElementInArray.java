package demo;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        boolean check = false;

        for (int i = 0; i < array.length ; i++) {
            if (array[i].equals(name)) {
                System.out.println("Element: " + i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.print("Not a name of array.");
        }
    }
}

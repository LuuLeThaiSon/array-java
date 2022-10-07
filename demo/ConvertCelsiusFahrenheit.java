package demo;

import java.util.Scanner;

public class ConvertCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        float celsius, fahrenheit;

        do {
            System.out.println("1.Celsius To Fahrenheit");
            System.out.println("2.Fahrenheit To Celsius");
            System.out.println("0.Exit");

            System.out.println("Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Celsius To Fahrenheit");
                    System.out.print("Enter celsius: ");
                    celsius = scanner.nextFloat();
                    System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));
                }

                case 2 -> {
                    System.out.println("Fahrenheit To Celsius");
                    System.out.print("Enter fahrenheit: ");
                    fahrenheit = scanner.nextFloat();
                    System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit));
                }
                case 0 -> System.exit(0);

                default -> System.out.println("errol");
            }
        } while (true);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double result;
        result = (9.0 / 5) * celsius + 32;
        return  result;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double result;
        result = (5.0 / 9) * (fahrenheit - 32);
        return  result;
    }
}

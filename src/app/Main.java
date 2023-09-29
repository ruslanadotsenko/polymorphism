package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Device deviceA = new DeviceA();
        Device deviceB = new DeviceB();

        double x;
        double y;

        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Please enter x: ");
        x = scanner.nextDouble();
        System.out.print("Please enter y: ");
        y = scanner.nextDouble();
        System.out.println("You enter x = " + x + " and y = " + y);
        scanner.close();

        double resultA = deviceA.getResult(x, y);
        double resultB = deviceB.getResult(x, y);

        System.out.printf("%nResult from DeviceA: %.2f%n", resultA);
        System.out.printf("Result from DeviceB: %.2f%n", resultB);
    }
}


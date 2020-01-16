package osnovaJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int q = calculate(a, b, c, d);
        System.out.println("Значение выражения a * (b + (c / d)) = " + q);

        }

    private static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
}

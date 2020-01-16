package osnovaJava;

import java.util.Scanner;

public class Main {

    public static boolean LeapYear(int year) {
        if ((year % 4) != 0) {
            return false;
        } else {
            if ((year % 100) != 0) {
                return true;

            } else {
                if ((year % 400) == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    public static void DisplayLeapYear(int year){
        if (LeapYear(year)){
            System.out.println("Високосный");
        }else {
            System.out.println("не високосный");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();

        DisplayLeapYear(year);
    }
}


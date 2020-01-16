package osnovaJava;


import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите число:");
                int a = scanner.nextInt();
                boolean rez = isNegative(a);
                System.out.println(rez);
            }

            public static boolean isNegative(int a) {
                if (a <= 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }
package osnovaJava;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        int n  = scanner.nextInt();
	    int [] [] table = new int[n][n];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                table[i][j] = (i == j) ? 1:0;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package osnovaJava;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void InpArr(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i*3;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = new int[8];
        InpArr(arr);
    }
}

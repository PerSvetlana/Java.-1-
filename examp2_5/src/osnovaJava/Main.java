package osnovaJava;

import java.util.Arrays;

public class Main {
    public static void InpArr(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
        if (arr[i]>max) {
            max = arr[i];
        }else
            if (arr[i]<min){
                min = arr[i];
            }
    }
        System.out.println(max);
        System.out.println(min);
}
    public static void main(String[] args) {
        int[] arr = new int[]{2,6,3,7,0,54,2,5};
        InpArr(arr);
    }
}

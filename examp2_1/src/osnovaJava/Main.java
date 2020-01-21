package osnovaJava;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
         int[] nums = { 1, 0, 1, 0, 0, 1, 1, 1 };
         ArrNums (nums);
    }


    public static void ArrNums(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (nums[i] == 0) ? 1 : 0 ;
        }
        System.out.println(Arrays.toString(nums));
    }
}

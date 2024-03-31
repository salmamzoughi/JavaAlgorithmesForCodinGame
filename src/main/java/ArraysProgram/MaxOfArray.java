package ArraysProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 15, 3, 5, 6, 4, 2, 8, 25, 1};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.println("Le maximum est " + maximum);


    }
}

package ArraysProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 1, 3, 5, 6, 4, 2, 8, 8, 1};
        int[] arr2 = new int[arr.length];

        List<Integer> ls = new ArrayList<>();
        int indice = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[indice] = arr[i];
            ++indice;
        }

        System.out.println(Arrays.toString(arr2));
    }
}

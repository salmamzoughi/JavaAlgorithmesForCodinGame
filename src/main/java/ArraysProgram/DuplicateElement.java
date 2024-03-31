package ArraysProgram;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 1, 3, 5, 6, 4, 2,8,8,1};
        List<Integer> ls= new ArrayList<>();
        System.out.println("Duplicate elements in given array: ");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j] && !ls.contains(arr[j])){
                    ls.add(arr[j]);
                    System.out.println(arr[j]);
                    break;
                }

            }
        }
    }
}

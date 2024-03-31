package ArraysProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        int [] tab = {2, 1, 4, 0, 7, 9, 10, 3, 15};
        System.out.println(Arrays.stream(tab).sorted().findFirst().getAsInt());

        int [] tab1 = {2, 1, 4, -1, 7, 9, 0, 3, 15};
        Arrays.sort(tab1);
        System.out.println(tab1[0]);

        Integer [] tab2 = {2, 1, 4, -2, 7, 9, 0, 3, 15};
        List<Integer> liste = Arrays.asList(tab2);
        Collections.sort(liste);
        System.out.println(liste.get(0));

    }
}

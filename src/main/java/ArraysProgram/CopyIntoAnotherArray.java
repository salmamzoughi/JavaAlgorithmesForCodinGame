package ArraysProgram;

import java.util.Arrays;

public class CopyIntoAnotherArray {
    public static void main(String[] args) {
        int[] tab = new int[]{1, 2, 3, 4};
        //they have the same content after cloning, but they hold different references, so any change in one of them won’t affect the other one.
        int[] copiedArray = tab.clone();

        int[] tab2 =Arrays.stream(tab).toArray();
        for (int i=0;i<tab2.length;i++){
            System.out.print(tab2[i]+"| ");
        }
        String[] strArray = {"orange", "red", "green'"};
        String[] copiedArrayStream = Arrays.stream(strArray).toArray(String[]::new);

    }
}

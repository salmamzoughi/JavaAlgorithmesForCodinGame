package ArraysProgram;

public class SumArrayElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 4, 1};
        var sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }
        System.out.println(sum);
    }
}

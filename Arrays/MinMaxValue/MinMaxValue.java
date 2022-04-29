import java.util.Arrays;
import java.util.Scanner;

public class MinMaxValue {
    public static void main(String[] args) {
        int[] list = {1, 3, 5, 7, 11, -21, -45}; // -33 -2 1 8 34 56 101
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = inp.nextInt();
        Arrays.sort(list);
        int min = 0;
        int max = 0;
        for (int i : list) {
            if (i < n) {
                min = i;
            }
            if (i > n) {
                max = i;
                break;
            }
        }

        System.out.println("The nearest value less than input number : " + min);
        System.out.println("The nearest value greater than input number : " + max);

    }
}
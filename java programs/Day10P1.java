
import java.util.*;

public class Day10P1 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        if (n <= 0) {
            throw new IllegalArgumentException("Size of array must be greater than 0");
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter integer element " + i + ":");
            int input = sc.nextInt();

            try {
                if (input < Integer.MIN_VALUE || input > Integer.MAX_VALUE) {
                    throw new IllegalArgumentException("Input out of range for int data type");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
            a[i] = input;
        }
        System.out.println("Using enhanced for loop:");
        System.out.println("Elements of array are:");
        int i = 0;
        for (int x : a) {
            System.out.println(x + " index " + i);
            i++;
        }
      sc.close();
    }
}

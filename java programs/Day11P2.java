
import java.util.*;

public class Day11P2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.println("enter element: " + i);
                    int s = sc.nextInt();
                    a.add(s);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter integers only.");
                    sc.next(); // discard the invalid input
                }
            }
        }
        maxmin(a);
        sum(a);
    }

    public static void maxmin(List<Integer> a) {
        int max = a.get(0);
        int min = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > max) {
                max = a.get(i);
            }
            if (a.get(i) < min) {
                min = a.get(i);
            }
        }
        System.out.println("maximum value is :" + max);
        System.out.println("minimum value is :" + min);
    }

    public static void sum(List<Integer> a) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
        }
        System.out.println("sum of array elements is :" + sum);
    }
}


import java.util.*;

class fibbonacci {

    public int iterable(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;

        }
        return b;

    }

    public int recursive(int n) {
        if (n == 0 || n == 1) {
            return n; 
        }else {
            return recursive(n - 1) + recursive(n - 2);
        }
    }
}

public class Day7P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        fibbonacci f = new fibbonacci();
        System.out.println("uisng iterative appraoch");
        System.out.println("displaying fibbonacci eris");
        for (int i = 0; i < n; i++) {
            System.out.print(f.iterable(i) + " ");
        }
        System.out.println("\nusing recursive approach");
        for (int i = 0; i < n; i++) {
            System.out.print(f.recursive(i) + " ");
        }

        sc.close();
    }
}

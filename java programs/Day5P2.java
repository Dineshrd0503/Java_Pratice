
import java.util.Scanner;

public class Day5P2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find factorial");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("factorial of negative number does not exist");
        }
       
        System.out.println("factroail of "+n+" is "+fact(n));
        System.out.println("enter a number ");
        int n1 = sc.nextInt();
        System.out.println("printing multipication table");
        printtable(n1);

    }

    public static int fact(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void printtable(int n1) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n1 + " * " + i + " = " + (n1 * i));
        }

    }

}

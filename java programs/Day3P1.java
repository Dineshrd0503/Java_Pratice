import java.util.Scanner;
public class Day3P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to fizzbuzz generator");
        while (true) {
            System.out.println("enter a number from 1-100");
            int n = sc.nextInt();
            try {
                if (n < 1 || n > 100) {
                    throw new Exception("sorry enter number b/w 0 to 100");
                }
                fizzbuzz(n);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
public static void fizzbuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz"); 
            }else if (i % 3 == 0) {
                System.out.println("fizz"); 
            }else if (i % 5 == 0) {
                System.out.println("buzz"); 
            }else {
                System.out.println(i);
            }
        }
    }
}

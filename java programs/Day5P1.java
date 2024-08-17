import java.util.Scanner;
import java.lang.Math;

class Methods {
    public boolean isArmstrong(int n) {
        int sum = 0, r, t = n;
        while (n > 0) {
            r = n % 10;
            sum += Math.pow(r, 3);
            n /= 10;
        }
        return sum == t;
    }

    public boolean isNeon(int n) {
        int sq = n * n;
        int sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == n;
    }
}

public class Day5P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Neon and Armstrong checker");
        while (true) {
            System.out.println("Enter a number between 1 to 1000 (press 0 to exit)");
            int n = sc.nextInt();
            sc.nextLine(); 
            if (n == 0)
                break;
            try {
                if (n < 0 || n > 1000)
                    throw new Exception("Choose a number between 1 to 1000");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue; 
            }
            Methods m = new Methods();

            System.out.println("Checking if Armstrong or not");
            if (m.isArmstrong(n))
                System.out.println(n + " is an Armstrong number");
            else
                System.out.println(n + " is not an Armstrong number");

            System.out.println("Checking if Neon or not");
            if (m.isNeon(n))
                System.out.println(n + " is a Neon number");
            else
                System.out.println(n + " is not a Neon number");
        }
    }
}
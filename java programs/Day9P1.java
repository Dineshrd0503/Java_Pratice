
import java.util.*;

public class Day9P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter two numbers");
            byte a = sc.nextByte();
            byte b = sc.nextByte();
            try {
                if ((a < 0 || a > 127) || (b < 0 || b > 127)) {
                    throw new Exception("enter number b/w 1 to 127");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            if (a == 0 || b == 0) {
                System.out.println("program exited");
                break;
            }
            else
            primenumbers(a, b);
        }
    }

    public static void primenumbers(byte a, byte b) {
        System.out.println("Prime numbers between " + a + " and " + b + " are:");
        for (byte i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number ");
            } else {
                System.out.println(i + " is not a prime number ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(byte num) {
        if (num <= 1) {
            return false;
        }
        for (byte i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}


import java.util.*;
import java.lang.Math;

public class Day23P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("uisng enhanced switch statement");
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("choose a opeartion");
        System.out.println("'+'\n'-'\n'*'\n'/'\n'**'\n'%' ");
        String c = sc.next();
        switch (c) {
            case "+" ->
                System.out.println("result is :" + a + b);
            case "-" ->
                System.out.println("result is :" + (a-b));
            case "*" ->
                System.out.println("result is :" + a * b);
            case "/" -> {
                if (b != 0) {
                    System.out.println("result is :" + a / b); 
                }else {
                    System.out.println("error");
                }

            }
            case "**" ->
                System.out.println("result is :" + Math.pow(a, b));
            case "%" ->
                System.out.println("result is :" + a % b);

        }
    }
}

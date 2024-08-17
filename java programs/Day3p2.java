import java.util.Scanner;

public class Day3p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to menu driven calc program");
        while (true) {
        System.out.println("enter two numbers(int or floating)");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("enter your choice");
        System.out.println("+ for Addition\n- for subtraction\n* for product\n / for quotient\n % for remainder\n ** for power\n 0 to exit");
        String choice;
            choice = sc.next();
            if(choice=="0")
            {
                System.out.println("program exited");
                break;
            }
            switch (choice) {
                case "+" -> System.out.println("sum is " + (num1 + num2));
                case "-" -> System.out.println("difference is " + (num1 - num2));
                case "*" -> System.out.println("product is " + (num1 * num2));
                case "/" -> {
                    if (num2 != 0)
                        System.out.println("quotient is " + (num1 / num2));
                    else
                        System.out.println("division by zero error");
                }
                case "%" -> {
                    if (num2 != 0)
                        System.out.println("remainder is " + (num1 % num2));
                    else
                        System.out.println("division by zero error");
                }
                case "**" -> System.out.println("power is " + Math.pow(num1, num2));
                case "0" -> {
                    System.out.println("program exited");
                    sc.close();
                    return;
                }
                default -> System.out.println("invalid choice");
            }
            System.out.println("enter your choice"); // ask for input again
        }
        sc.close();
    }
}
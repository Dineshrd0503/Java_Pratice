
import java.util.*;
import java.lang.Math;
public class Day11P1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        System.out.println("welcome to number guessing game");
        int secretnumber = (int) Math.floor(Math.random() * 100) + 1;
        while (true) {
            System.out.println("enter your number choice:");
            try {
                int guess = sc.nextInt();
                if (guess < 0 || guess > 100) {
                    throw new Exception("enter value from 1 to 100"); 
                }else {
                    attempts++;
                    if (guess > secretnumber) {
                        System.out.println("your guess is too high");
                    } else if (guess < secretnumber) {
                        System.out.println("your guess is too low");
                    } else {
                        System.out.println("congrats you guessed the number in " + attempts + " attempts");
                        break;
                    }
                }

            } 
            catch (InputMismatchException e) {
                System.out.println("invalid input, please enter an integer");
                sc.next(); // discard the invalid input
            }catch (Exception e) {
                System.out.println(e.getMessage());
                sc.next(); // discard the invalid input
            } 
        }
        sc.close();
    }
}

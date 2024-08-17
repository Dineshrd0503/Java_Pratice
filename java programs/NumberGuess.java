/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
import java.util.Scanner;
public class NumberGuess {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        guessNumber(n);

    }
    public static void guessNumber(int n) {
        int attempts=0;
        Scanner sc=new Scanner(System.in);
        while(true){
            int pick=sc.nextInt();
            attempts++;
            if(n>pick)
            System.out.println("Your guess is lower than the number i picked");
            else if(n<pick)
            System.out.println("Your guess is higher than the number i picked");
            else
            System.out.println("Your guess is equal to number i picked guessed in :"+attempts+" attempts");
        }
    }
        
    }

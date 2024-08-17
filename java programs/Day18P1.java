
import java.lang.String;
import java.util.*;

public class Day18P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two strings(less than 30 characters)");
        String a = sc.nextLine();
        String b = sc.nextLine();
        try {
            if ((a.length() <=1 || a.length() > 30) && (b.length() <=1 || b.length() > 30)) {
                throw new Exception("enter a string of length 2-30 charcacters");
            }
            System.out.println("checing of strings are anagarms or not");
            anagramchecker1(a, b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sc.close();
        }
    }

    public static void anagramchecker1(String a, String b) {
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are the same
        if (a.length() != b.length()) {
            System.out.println("No");
            return;
        }

        // Convert strings to char arrays and sort them
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        // Compare sorted arrays
        if (Arrays.equals(charArrayA, charArrayB)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


    }
